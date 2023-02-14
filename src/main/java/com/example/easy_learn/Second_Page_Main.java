package com.example.easy_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.easy_learn.CourceScreen.Adapter_Second;
import com.example.easy_learn.CourceScreen.ModelClass_Second;

import java.util.ArrayList;

public class Second_Page_Main extends Activity {

    ListView listView;
    private Adapter_Second adapter;
    private ArrayList<ModelClass_Second> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        // 1- AdapterView: a listView
        listView = findViewById(R.id.listView);

        // 2- Data source
        dataModels = new ArrayList<>();

        dataModels.add(new ModelClass_Second("Unit 1","Introduction","50%"));
        dataModels.add(new ModelClass_Second("Unit 2","Introduction","100%"));
        dataModels.add(new ModelClass_Second("Unit 3","Introduction","56%"));
        dataModels.add(new ModelClass_Second("Unit 4","Introduction","45%"));
        dataModels.add(new ModelClass_Second("Unit 5","Introduction","90%"));

        // 3- Adapter
        adapter = new Adapter_Second(dataModels,getApplicationContext());

        listView.setAdapter(adapter);

        // 4- Handling the click events on Listview items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Intent i = new Intent(Second_Page_Main.this,Third_Page_Main.class);
                    i.putExtra("units",adapter.getItem(position).getUnitNo());
                    i.putExtra("subText",adapter.getItem(position).getSubText());
                    startActivity(i);
                }
                if (position == 1){
                    Intent i = new Intent(Second_Page_Main.this,Third_Page_Main.class);
                    i.putExtra("units",adapter.getItem(position).getUnitNo());
                    i.putExtra("subText",adapter.getItem(position).getSubText());
                    startActivity(i);
                }
                if (position == 2){
                    Intent i = new Intent(Second_Page_Main.this,Third_Page_Main.class);
                    i.putExtra("units",adapter.getItem(position).getUnitNo());
                    i.putExtra("subText",adapter.getItem(position).getSubText());
                    startActivity(i);
                }
                if (position == 3){
                    Intent i = new Intent(Second_Page_Main.this,Third_Page_Main.class);
                    i.putExtra("units",adapter.getItem(position).getUnitNo());
                    i.putExtra("subText",adapter.getItem(position).getSubText());
                    startActivity(i);
                }
                if (position == 4){
                    Intent i = new Intent(Second_Page_Main.this,Third_Page_Main.class);
                    i.putExtra("units",adapter.getItem(position).getUnitNo());
                    i.putExtra("subText",adapter.getItem(position).getSubText());
                    startActivity(i);
                }

            }
        });

        Button referenceBtn = findViewById(R.id.referenceBtn);
        referenceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Second_Page_Main.this,Third_Page_Main.class);
                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Second_Page_Main.this,First_Page_Main.class);
        startActivity(i);
    }
    }

