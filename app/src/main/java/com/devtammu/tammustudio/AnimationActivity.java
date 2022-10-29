package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {
    ImageView imageView;
    Button startanimation1;
    Animation myAnime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        imageView = findViewById(R.id.imageView);
        startanimation1 = findViewById(R.id.startanimation1);
        myAnime = AnimationUtils.loadAnimation(AnimationActivity.this,R.anim.myanim);


        startanimation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(myAnime);
            }
        });

    }
}