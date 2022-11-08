package com.devtammu.tammustudio;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Class207Activity extends AppCompatActivity {

    EditText edweight,edHeightFeet,edHeightInch,edCelsius,edFahrenheit;
    Button showInput,FarenshowInput,CelsiusshowInput;
    TextView bmiDisplay,farenDisplay,celsiusDisplay;
    String BMIresult,bmiCalculation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class207);

        getSupportActionBar().setTitle("BMI-Temp Calculator (Class 207)");
//        getSupportActionBar().setSubtitle("Tammu");
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        edweight = findViewById(R.id.edweight);
        edHeightFeet = findViewById(R.id.edHeightFeet);
        edHeightInch = findViewById(R.id.edHeightInch);
        showInput = findViewById(R.id.showInput);
        bmiDisplay = findViewById(R.id.bmiDisplay);


        edCelsius = findViewById(R.id.edCelsius);
        FarenshowInput = findViewById(R.id.FarenshowInput);
        farenDisplay = findViewById(R.id.farenDisplay);

        edFahrenheit = findViewById(R.id.edFahrenheit);
        CelsiusshowInput = findViewById(R.id.CelsiusshowInput);
        celsiusDisplay = findViewById(R.id.celsiusDisplay);


        showInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float fweight,fheightfeet,fheightinch,height,bmiindex;

                fweight = Float.parseFloat(edweight.getText().toString());
                fheightfeet = Float.parseFloat(edHeightFeet.getText().toString());
                fheightinch = Float.parseFloat(edHeightInch.getText().toString());


                height = (float) ((fheightfeet*0.3048)+(fheightinch*0.0254));

                bmiindex = fweight/(height*height);


                if(bmiindex < 18.4) {
                    BMIresult = "Underweight";
                }else if (bmiindex >= 18.5 && bmiindex <= 24.9){
                    BMIresult = "Normal";
                }else if (bmiindex >= 25 && bmiindex <= 39.9){
                    BMIresult = "Overweight";
                }else {
                    BMIresult = "Obese";
                }

                bmiCalculation = "Your BMI is: "+bmiindex+"\n"+ BMIresult;

                bmiDisplay.setText(bmiCalculation);






            }
        });

        FarenshowInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float fCelsius = Float.parseFloat(edCelsius.getText().toString());

                float Celsius = (float) (fCelsius*1.8000+32.00);

                farenDisplay.setText("Fahrenheit: "+Celsius+"°F");

            }
        });

        CelsiusshowInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ffahrenheit = Float.parseFloat(edFahrenheit.getText().toString());
                float Fahrenheit = (float) ((ffahrenheit-32)/1.8000);

                celsiusDisplay.setText("Celsius: "+Fahrenheit+"°C");
            }
        });

    }
}