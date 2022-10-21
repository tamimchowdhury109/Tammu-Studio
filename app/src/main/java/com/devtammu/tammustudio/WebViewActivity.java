package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;
    public static String webUrl = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.webView);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(webUrl);

    }
}