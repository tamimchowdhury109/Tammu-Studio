package com.devtammu.tammustudio;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Class210Activity extends AppCompatActivity {

    EditText edNumber;
    Button showInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class210);

        getSupportActionBar().setTitle("Even-Odd Number (Class 210)");
//        getSupportActionBar().setSubtitle("Tammu");
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);


        edNumber = findViewById(R.id.edNumber);
        showInput = findViewById(R.id.showInput);


        showInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Number = Integer.parseInt(edNumber.getText().toString());

                if(Number%2 == 0){
                    Toast.makeText(Class210Activity.this, Number+" is an Even Number", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Class210Activity.this, Number+" is an Odd Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}