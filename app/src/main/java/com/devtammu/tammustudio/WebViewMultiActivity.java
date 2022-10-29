package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class WebViewMultiActivity extends AppCompatActivity {

    Button protomalo,nayadiganta,dailystar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_multi);

        protomalo = findViewById(R.id.protomalo);
        nayadiganta = findViewById(R.id.nayadiganta);
        dailystar = findViewById(R.id.dailystar);


        protomalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewActivity.webUrl = "https://www.prothomalo.com";
                Intent myIntent = new Intent(WebViewMultiActivity.this,WebViewActivity.class);
                startActivity(myIntent);
            }
        });

        nayadiganta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewActivity.webUrl = "https://www.dailynayadiganta.com";
                Intent myIntent = new Intent(WebViewMultiActivity.this,WebViewActivity.class);
                startActivity(myIntent);
            }
        });

        dailystar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewActivity.webUrl = "www.whoer.net";
                Intent myIntent = new Intent(WebViewMultiActivity.this,WebViewActivity.class);
                startActivity(myIntent);
            }
        });


    }
}