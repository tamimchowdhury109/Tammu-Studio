package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout tasbih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout tasbih = (LinearLayout) findViewById(R.id.tasbih);

        tasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beach = new  Intent(MainActivity.this, TasbihActivity.class);
                startActivity(beach);
            }
        });
    }
}