package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);
        mList = new ArrayList<Module>();

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        aa = new ModuleAdapter(this, R.layout.row, mList);
        if(year.equalsIgnoreCase("Year 2")){
            mList.add(new Module("C208",true));
            mList.add(new Module("C200",false));
            mList.add(new Module("C346",true));
            aa.notifyDataSetChanged();
        }
//        aa.add(new Module("C208",true));
//        aa.add(new Module("C200",false));
//        aa.add(new Module("C346",true));
        lv.setAdapter(aa);







    }



}
