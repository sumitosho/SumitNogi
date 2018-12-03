package com.websarva.wings.android.nogi.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.websarva.wings.android.nogi.R;
import com.websarva.wings.android.nogi.ikki;
import com.websarva.wings.android.nogi.niki;
import com.websarva.wings.android.nogi.sanki;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class MembersFragment extends Fragment {
    private LinearLayout ll1, ll2, ll3;

    private ListView lv1,lv2,lv3;



    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_members, container, false);

        ll1 = view.findViewById(R.id.ll1);
        ll2 = view.findViewById(R.id.ll2);
        ll3 = view.findViewById(R.id.ll3);

        lv1 = view.findViewById(R.id.lv1);
        lv2 = view.findViewById(R.id.lv2);
        lv3 = view.findViewById(R.id.lv3);

        String ikki[] = {"秋元真夏","生田絵梨花","井上小百合"};
        // Adding items to listview
         ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, ikki);

        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] links = getResources().getStringArray(R.array.link);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        String niki[] = {"伊藤かりん","伊藤純奈","北野日奈子"};

        adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, niki);

        lv2.setAdapter(adapter);
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] links = getResources().getStringArray(R.array.link1);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        String sanki[] = {"伊藤理々杏","岩本蓮加","梅澤美波"};
        adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, sanki);

        lv3.setAdapter(adapter);
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] links = getResources().getStringArray(R.array.link2);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });









        //this code for linearLayout


        view.findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                ll1.setVisibility(View.VISIBLE);


                ll2.setVisibility(View.INVISIBLE);
                ll3.setVisibility(View.INVISIBLE);
            }
        });
        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                ll2.setVisibility(View.VISIBLE);
                ll1.setVisibility(View.INVISIBLE);
                ll3.setVisibility(View.INVISIBLE);
            }
        });
        view.findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                ll3.setVisibility(View.VISIBLE);
                ll1.setVisibility(View.INVISIBLE);
                ll2.setVisibility(View.INVISIBLE);

            }
        });
        return view;
    }

}




//        iv1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),ikki.class);
//                startActivity(intent);
//            }
//        });
//        iv2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),niki.class);
//                startActivity(intent);
//            }
//        });
//        iv3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),sanki.class);
//                startActivity(intent);
//            }
//        });
//        return view;
//    }

