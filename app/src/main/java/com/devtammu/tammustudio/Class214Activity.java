package com.devtammu.tammustudio;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Class214Activity extends AppCompatActivity {
    EditText ed1stDiviNumber,edLeapYear,edDaysNum,edBangla,edEnglish,edMath,edScience,edICT,edBillNum;
    TextView divisibleDisplay,LeapYearDisplay,weekDaysDisplay,CGPADisplay,billDisplay;
    Button showDivisibleInput,showLeapInput,showDaysInput,showCGPAInput,showBillInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class214);

        getSupportActionBar().setTitle("HW (214.1 - 214.5)");
//        getSupportActionBar().setSubtitle("Tammu");
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        ed1stDiviNumber = findViewById(R.id.ed1stDiviNumber);
        divisibleDisplay = findViewById(R.id.divisibleDisplay);
        showDivisibleInput = findViewById(R.id.showDivisibleInput);

        edLeapYear = findViewById(R.id.edLeapYear);
        LeapYearDisplay = findViewById(R.id.LeapYearDisplay);
        showLeapInput = findViewById(R.id.showLeapInput);

        edDaysNum = findViewById(R.id.edDaysNum);
        weekDaysDisplay = findViewById(R.id.weekDaysDisplay);
        showDaysInput = findViewById(R.id.showDaysInput);

        edBangla = findViewById(R.id.edBangla);
        edEnglish = findViewById(R.id.edEnglish);
        edMath = findViewById(R.id.edMath);
        edScience = findViewById(R.id.edScience);
        edICT = findViewById(R.id.edICT);
        CGPADisplay = findViewById(R.id.CGPADisplay);
        showCGPAInput = findViewById(R.id.showCGPAInput);

        edBillNum = findViewById(R.id.edBillNum);
        billDisplay = findViewById(R.id.billDisplay);
        showBillInput = findViewById(R.id.showBillInput);


        //On Click Start//
        showDivisibleInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1stDiviNumber.length() > 0){
                    String Sed1stDiviNumber = ed1stDiviNumber.getText().toString();
                    int FirstDiviNumber = (int) Integer.parseInt(Sed1stDiviNumber);

                    if (FirstDiviNumber%5 == 0 && FirstDiviNumber%11 == 0 ){
                        divisibleDisplay.setText("The Number is Divisible by 5 and 11");
                    }else {
                        divisibleDisplay.setText("The Number is NOT Divisible by 5 and 11");
                    }
                }else {
                    divisibleDisplay.setTextColor(Color.RED);
                    divisibleDisplay.setText("Please Enter a Number");
                    ed1stDiviNumber.setError("Please Enter a Number");
                }
            }
        });

        showLeapInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edLeapYear.length() > 0 ){

                    int LeapYear = Integer.parseInt(edLeapYear.getText().toString());

                    if (LeapYear % 4 == 0){
                        LeapYearDisplay.setText(LeapYear+" is Leap Year");
                    }else {
                        LeapYearDisplay.setText(LeapYear+" is not Leap Year");
                    }
                }else {
                    LeapYearDisplay.setTextColor(Color.RED);
                    LeapYearDisplay.setText("Please Enter a Year");
                    edLeapYear.setError("Please Enter a Year");
                }
            }
        });

        showDaysInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edDaysNum.length() > 0 && edDaysNum.length() <= 6){
                    int DaysNum = Integer.parseInt(edDaysNum.getText().toString());

                    if (DaysNum == 1){
                        weekDaysDisplay.setText("Sunday");
                    }if (DaysNum == 2){
                        weekDaysDisplay.setText("Monday");
                    }if (DaysNum == 3){
                        weekDaysDisplay.setText("Tuesday");
                    }if (DaysNum == 4){
                        weekDaysDisplay.setText("Wednesday");
                    }if (DaysNum == 5){
                        weekDaysDisplay.setText("Thursday");
                    }if (DaysNum == 6){
                        weekDaysDisplay.setText("Friday");
                    }if ((DaysNum == 7)){
                        weekDaysDisplay.setText("Saturday");
                    }
                }else {
                    weekDaysDisplay.setTextColor(Color.RED);
                    weekDaysDisplay.setText("Please Enter a Number Between (1-7)");
                    edDaysNum.setError("Please Enter a Number Between (1-7)");
                }
            }
        });

        showCGPAInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edBangla.length() > 0 && edEnglish.length() > 0 && edMath.length() > 0 && edScience.length() > 0 && edICT.length() > 0){

                    float Bangla = (float) Float.parseFloat(edBangla.getText().toString());
                    float English = (float) Float.parseFloat(edEnglish.getText().toString());
                    float Math = (float) Float.parseFloat(edMath.getText().toString());
                    float Science = (float) Float.parseFloat(edScience.getText().toString());
                    float ICT = (float) Float.parseFloat(edICT.getText().toString());

                    float subPercentage = (float) ((Bangla+English+Math+Science+ICT)/5.00);

                    if (subPercentage >=80 ){
                        CGPADisplay.setText("Your CGPA A+");
                    }else if (subPercentage >=75 && subPercentage <=79  ){
                        CGPADisplay.setText("Your CGPA A");
                    }else if (subPercentage >=70 && subPercentage <=74  ){
                        CGPADisplay.setText("Your CGPA A-");
                    }else if (subPercentage >=65 && subPercentage <=69  ){
                        CGPADisplay.setText("Your CGPA B+");
                    }else if (subPercentage >=60 && subPercentage <=64  ){
                        CGPADisplay.setText("Your CGPA B");
                    }else if (subPercentage >=55 && subPercentage <=59  ){
                        CGPADisplay.setText("Your CGPA B-");
                    }else if (subPercentage >=50 && subPercentage <=54  ){
                        CGPADisplay.setText("Your CGPA C+");
                    }else if (subPercentage >=45 && subPercentage <=49  ){
                        CGPADisplay.setText("Your CGPA C");
                    }else if (subPercentage >=40 && subPercentage <=44  ){
                        CGPADisplay.setText("Your CGPA D");
                    }else{
                        CGPADisplay.setTextColor(Color.RED);
                        CGPADisplay.setText("Your CGPA F");
                    }
                }else {
                    CGPADisplay.setTextColor(Color.RED);
                    CGPADisplay.setText("Please Fill Up All Box");
                }
            }
        });

        showBillInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edBillNum.length() > 0){

                    float BillUnit = (float) Float.parseFloat(edBillNum.getText().toString());
                    float bill= 0;

                    if (BillUnit <= 50 ){
                        bill = (float) (BillUnit*0.50);
                    }else if (BillUnit <= 150){
                        bill = (float) (25 + (BillUnit-50) * 0.75);
                    }else if (BillUnit <= 250){
                        bill = (float) (25 + 75 + (BillUnit-150) * 1.20);
                    }else {
                        bill = (float) (25 + 75 + 120 + (BillUnit-250) * 1.50);
                    }
                    billDisplay.setText("Your Bill "+(bill+bill*0.20)+" Taka");
                } else {
                    billDisplay.setText("Please Input Bill Unit");
                    edBillNum.setError("Please Input Bill Unit");
                }

            }
        });
        //On Click End//




    }
}