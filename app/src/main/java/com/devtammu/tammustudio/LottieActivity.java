package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class LottieActivity extends AppCompatActivity {
    LottieAnimationView lottieView;
    Button lottieButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);


        lottieButton = findViewById(R.id.lottieButton);
        lottieView = findViewById(R.id.lottiView);


        lottieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieView.setAnimation(R.raw.lottie1);
                lottieView.playAnimation();
            }
        });

    }
}