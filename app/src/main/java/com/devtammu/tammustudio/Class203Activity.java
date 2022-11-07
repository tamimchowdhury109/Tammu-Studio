package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Class203Activity extends AppCompatActivity {

    TextView nameDisplay;
    Button showInput;
    EditText edName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class203);

        nameDisplay = findViewById(R.id.nameDisplay);
        showInput = findViewById(R.id.showInput);
        edName = findViewById(R.id.edName);

        showInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameDisplay.setText("Hello "+edName.getText().toString()+" \nNice Work");
            }
        });

    }
}