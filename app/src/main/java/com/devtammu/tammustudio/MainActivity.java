package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout tasbih,visibility,WebView,webViewMulti,relativeLayout,animation,picasso,lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout tasbih = (LinearLayout) findViewById(R.id.tasbih);
        LinearLayout visibility = (LinearLayout) findViewById(R.id.visibility);
        LinearLayout WebView = (LinearLayout) findViewById(R.id.WebView);
        LinearLayout webViewMulti = (LinearLayout) findViewById(R.id.webViewMulti);
        LinearLayout relativeLayout = (LinearLayout) findViewById(R.id.relativeLayout);
        LinearLayout animation = (LinearLayout) findViewById(R.id.animation);
        LinearLayout picasso = (LinearLayout) findViewById(R.id.picasso);
        LinearLayout lottie = (LinearLayout) findViewById(R.id.lottie);



        ///////// ==  Activity Change Start  == //////////////////

        tasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new  Intent(MainActivity.this, TasbihActivity.class);
                startActivity(myIntent);
            }
        });

        visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new  Intent(MainActivity.this, VisibilityActivity.class);
                startActivity(myIntent);
            }
        });

        WebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(myIntent);
            }
        });

        webViewMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, WebViewMultiActivity.class);
                startActivity(myIntent);
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(myIntent);
            }
        });

        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(myIntent);
            }
        });

        picasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, PicassoActivity.class);
                startActivity(myIntent);
            }
        });

        lottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, LottieActivity.class);
                startActivity(myIntent);
            }
        });



        ///////// ==  Activity Change End  == //////////////////

    }
}