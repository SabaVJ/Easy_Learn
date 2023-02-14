package com.example.easy_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class First_Page_Main extends Activity {

    // Widgets
    MaterialButton startBtn;
    ImageView menu,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        menu = findViewById(R.id.menuImg);
        profile = findViewById(R.id.profileImg);
        startBtn = findViewById(R.id.startBtn);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(First_Page_Main.this, "Menu", Toast.LENGTH_SHORT).show();
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(First_Page_Main.this, "Profile", Toast.LENGTH_SHORT).show();
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First_Page_Main.this, Second_Page_Main.class);
                startActivity(i);
            }
        });

    }
}
