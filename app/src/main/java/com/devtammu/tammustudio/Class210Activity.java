package com.devtammu.tammustudio;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Class210Activity extends AppCompatActivity {

    EditText edNumber,ed1stNumber,ed2ndNumber;
    Button showInput,showLargeInput;
    TextView largeDisplay;

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

        ed1stNumber = findViewById(R.id.ed1stNumber);
        ed2ndNumber = findViewById(R.id.ed2ndNumber);
        showLargeInput = findViewById(R.id.showLargeInput);
        largeDisplay = findViewById(R.id.largeDisplay);


        showInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sNumber = edNumber.getText().toString();

                if (sNumber.length()> 0 ){

                    int Number = Integer.parseInt(sNumber);

                    if(Number%2 == 0){
                        Toast.makeText(Class210Activity.this, Number+" is an Even Number", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(Class210Activity.this, Number+" is an Odd Number", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    edNumber.setError("Input a Number");
                    Toast.makeText(Class210Activity.this, " Please Input a Number", Toast.LENGTH_SHORT).show();

                }
            }
        });

        showLargeInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1stNumber.length() > 0 && ed2ndNumber.length() > 0){
                    String sFirstNumber = ed1stNumber.getText().toString();
                    String sSecondNumber = ed2ndNumber.getText().toString();

                    float firstNumber = Float.parseFloat(sFirstNumber);
                    float secondNumber = Float.parseFloat(sSecondNumber);

                    if (firstNumber>secondNumber){
                        largeDisplay.setText("Large Number is: "+firstNumber);
                    }else {
                        largeDisplay.setText("Large Number is: "+secondNumber);
                    }
                }else {
                    ed1stNumber.setError("Please input a Number");
                    ed2ndNumber.setError("Please input a Number");
                }
            }
        });
    }
}