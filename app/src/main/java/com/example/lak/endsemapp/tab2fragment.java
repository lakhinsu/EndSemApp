package com.example.lak.endsemapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lak on 01-09-2018.
 */

public class tab2fragment extends Fragment{
    public static final String TAG="Topics";

    ExpListViewAdapterWithCheckbox listAdapter;
    ExpandableListView expListView;
    ArrayList<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    String Name;
    TextView footer;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.tab2_fragment,container,false);

        Log.d("Tabs","Tab2 Created");

        Bundle extras = getActivity().getIntent().getExtras();
        Name = extras.getString("SubName").toString();

        Log.d("Name","Name");

        // get the listview

        footer=view.findViewById(R.id.tab2footer);


        expListView = view.findViewById(R.id.lvExp);
        prepareListData();

        listAdapter = new ExpListViewAdapterWithCheckbox(getContext(), listDataHeader, listDataChild);

        listAdapter.loadStates(Name);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getContext().getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });

        return view;
    }

    private void prepareListData() {

        if(Name.equals("Algorithms")) {
            AdaTopics adaTopics = new AdaTopics();
            adaTopics.prepareList();
            //listDataHeader=new ArrayList<>();
            //listDataChild = new HashMap<String, List<String>>();
            listDataHeader = adaTopics.listDataHeader;
            listDataChild = adaTopics.listDataChild;
        }
        else if(Name.equals("Computer_Graphics")){
            CgTopics cgTopics=new CgTopics();
            cgTopics.prepareList();
            //listDataHeader=new ArrayList<>();
            //listDataChild = new HashMap<String, List<String>>();
            listDataHeader=cgTopics.listDataHeader;
            listDataChild=cgTopics.listDataChild;
        }
        else if(Name.equals("Java")){
            JavaTopics javaTopics=new JavaTopics();
            javaTopics.prepareList();
            listDataHeader=javaTopics.listDataHeader;
            listDataChild=javaTopics.listDataChild;
            //Log.d("Size",""+listDataChild.keySet());
            //Log.d("Size",""+listDataChild.get("Basics of Java").size());
        }
        else if(Name.equals("Systems_Prog.")){
            SpTopics spTopics=new SpTopics();
            spTopics.prepareList();
            listDataChild=spTopics.listDataChild;
            listDataHeader=spTopics.listDataHeader;
        }
    }
    @Override
    public void onDestroy() {
        listAdapter.saveStates(Name);
        super.onDestroy();
    }

    @Override
    public void onPause() {
        listAdapter.saveStates(Name);
        super.onPause();
    }


}
