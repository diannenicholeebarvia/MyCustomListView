package com.ebarvia.mycustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView AndroidVersions;
    int[] logos;
    String[] codeNames, versions, apis, date;
    ArrayList<AndroidVersion> arrayList;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidVersions = (ListView) findViewById(R.id.AndroidVersion);
        logos = new int[]{R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo,
                R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.ics, R.drawable.jelly, R.drawable.kitkat,
                R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo};
        codeNames = getResources().getStringArray(R.array.codename);
        versions = getResources().getStringArray(R.array.version);
        apis = getResources().getStringArray(R.array.api);
        date = getResources().getStringArray(R.array.date);
        arrayList = new ArrayList<AndroidVersion>();
        for (int i = 0; i < codeNames.length; i++) {
            AndroidVersion android = new AndroidVersion(logos[i], codeNames[i], versions[i], apis[i], date[i]);
            arrayList.add(android);
        }
        adapter = new CustomAdapter(arrayList, this);
    }
    }
