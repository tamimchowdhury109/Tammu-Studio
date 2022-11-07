package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivityS2 extends AppCompatActivity {

    LinearLayout cls203,cls204;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_s2);

        LinearLayout cls203 = (LinearLayout) findViewById(R.id.cls203);
        LinearLayout cls204 = (LinearLayout) findViewById(R.id.cls204);


        cls203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivityS2.this, Class203Activity.class);
                startActivity(myIntent);
            }
        });

        cls204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivityS2.this, Class204Activity.class);
                startActivity(myIntent);
            }
        });
    }
}