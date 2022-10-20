package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TasbihActivity extends AppCompatActivity {

    TextView tvCount;
    Button ButtonAdd,ButtonSup,ButtonReset;
    ImageView backHome;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        tvCount = findViewById(R.id.tvCount);
        ButtonAdd = findViewById(R.id.ButtonAdd);
        ButtonSup = findViewById(R.id.ButtonSup);
        ButtonReset = findViewById(R.id.ButtonReset);
        backHome = findViewById(R.id.backHome);

        //==================================================//
        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            count = count +1;
            tvCount.setText(""+count);
            }
        });

        ButtonSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count -1;
                tvCount.setText(""+count);
            }
        });

        ButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvCount.setText(""+count);
            }
        });

        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TasbihActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });





    }
}