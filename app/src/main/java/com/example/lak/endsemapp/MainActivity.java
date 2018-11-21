package com.example.lak.endsemapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    ListView mainlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainlist=findViewById(R.id.mainlist);

        String [] papers={"Java","Algorithms"};

        final ArrayAdapter<String> subjects;

        subjects = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, papers);

        mainlist.setAdapter(subjects);

        mainlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                                String text = subjects.getItem(position);
                                                Intent I=new Intent(getApplicationContext(),Subject.class);
                                                I.putExtra("SubName",text);
                                                startActivity(I);

                                            }
                                        }
        );
    }
}
