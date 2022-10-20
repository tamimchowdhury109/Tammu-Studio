package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class VisibilityActivity extends AppCompatActivity {

    Button showImage,goneImage,showToast;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility);

        imageView = findViewById(R.id.imageView);
        showImage = findViewById(R.id.showImage);
        goneImage = findViewById(R.id.goneImage);
        showToast = findViewById(R.id.showToast);


        showImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setVisibility(View.VISIBLE);
            }
        });

        goneImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setVisibility(View.GONE);
            }
        });

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VisibilityActivity.this, "Hello I AM Here :)", Toast.LENGTH_SHORT).show();
            }
        });





    }
}