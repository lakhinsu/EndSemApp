package com.example.lak.endsemapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingActivity extends AppCompatActivity {


    Switch night;

    public static final String MyPREFERENCES = "GroupPrefs" ;
    public static final String NightMode = "NightMode" ;

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Switch night=(Switch) findViewById(R.id.nightswitch);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        if(sharedpreferences.contains(NightMode)){
            String NM=sharedpreferences.getString(NightMode,"");
            if(NM.equals("true")){
                night.setChecked(true);
            }
            else
                night.setChecked(false);
        }

        night.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                SharedPreferences.Editor data = sharedpreferences.edit();
                String text;
                if(b==true) {
                    data.putString(NightMode, "true");
                    text="true";
                }
                else {
                    data.putString(NightMode, "false");
                    text="false";
                }

                data.commit();
                Intent Data=new Intent();
                Data.setData(Uri.parse(text));
                setResult(RESULT_OK,Data);
                finish();

            }
        });
    }
}
