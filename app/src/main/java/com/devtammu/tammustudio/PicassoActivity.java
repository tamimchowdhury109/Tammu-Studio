package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {
    ImageView imageView,newImage;
    Button newImagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        imageView = findViewById(R.id.imageView);
        newImage = findViewById(R.id.newImage);
        newImagebutton = findViewById(R.id.newImagebutton);

        Picasso.get()
                .load("https://www.thecrazyprogrammer.com/wp-content/uploads/2016/08/Picasso-Android-Tutorial-%E2%80%93-Load-Image-from-URL.jpg")
                .into(imageView);


        newImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://i.ytimg.com/vi/0PgvPd649kg/maxresdefault.jpg")
                        .resize(1080,720)
                        .into(newImage);
            }
        });
    }
}