package com.example.lak.endsemapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lak on 01-09-2018.
 */

public class tab1fragment extends Fragment {

    ListView papers;


    ExpListViewAdapterWithCheckbox listAdapter;
    ExpandableListView expListView;
    ArrayList<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    public static final String TAG="Papers";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.tab1_fragment,container,false);

        Log.d("Tabs","Tab1 Created");
        papers=(ListView) view.findViewById(R.id.listviewpaper);

        Bundle extras = getActivity().getIntent().getExtras();
        String Sname = extras.getString("SubName").toString();

        ///getActivity().setTitle(Sname);

        String [] paperlist;

        paperlist=getResources().getStringArray(R.array.Algorithm);  //By Default ADA

        final ArrayAdapter<String> papername;
        if(Sname.equals("Algorithms")){
            paperlist=getResources().getStringArray(R.array.Algorithm);
        }
        else if(Sname.equals("Java")){
            paperlist=getResources().getStringArray(R.array.Java);
        }
        papername=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, paperlist){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.WHITE);

                // Generate ListView Item using TextView
                return view;
            }
        };
        papers.setAdapter(papername);
        papers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                          public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                              String text = papername.getItem(position);
                                              Intent I=new Intent(getContext().getApplicationContext(),PdfViewer.class);
                                              I.putExtra("PaperName",text);
                                              startActivity(I);

                                          }
                                      }
        );
        return view;
    }
}
