package com.example.easy_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.easy_learn.UnitScreen.Adapter_Third;
import com.example.easy_learn.UnitScreen.ModelClass_Third;

import java.util.ArrayList;

public class Third_Page_Main extends Activity {

    ListView listView;
    private static Adapter_Third adapter;
    private ArrayList<ModelClass_Third> arrayList;

    public TextView unitTitle,subTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        listView = findViewById(R.id.listview);

        arrayList = new ArrayList<>();

        arrayList.add(new ModelClass_Third("Chapter 1","Intro","100%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 2","Intro","55%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 3","Intro","60%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 5","Intro","900%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 6","Intro","10%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 7","Intro","80%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 8","Intro","45%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 9","Intro","76%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 10","Intro","21%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 11","Intro","99%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 12","Intro","100%","Unit 1","Intro"));
        arrayList.add(new ModelClass_Third("Chapter 13","Intro","12%","Unit 1","Intro"));


        adapter = new Adapter_Third(getApplicationContext(),arrayList);

        listView.setAdapter(adapter);

        Intent i = getIntent();
        String units = i.getStringExtra("units");
        String percentage = i.getStringExtra("percentage");


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Third_Page_Main.this,First_Page_Main.class);
        startActivity(i);
    }
}


