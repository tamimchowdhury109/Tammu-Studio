package com.devtammu.tammustudio;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Class218Activity extends AppCompatActivity {

    EditText edGold,edSilver,edStone,edCashTaka,edGiveLoan,edTreasure,edDepositMoney,edInvestCultivation,edTakeLoan,edJobEarn,edBusinessEarn,edHouseEarn,edAgriEarn,edOtherEarn;
    TextView ZakatDisplay,TaxDisplay;
    Button inputZakat,inputTax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class218);

        getSupportActionBar().setTitle("যাকাত ক্যালকুলেটর - ট্যাক্স পরিমাপ");
        getSupportActionBar().setSubtitle("HW (218)");
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        edGold = findViewById(R.id.edGold);
        edSilver = findViewById(R.id.edSilver);
        edStone = findViewById(R.id.edStone);
        edCashTaka = findViewById(R.id.edCashTaka);
        edGiveLoan = findViewById(R.id.edGiveLoan);
        edTreasure = findViewById(R.id.edTreasure);
        edDepositMoney = findViewById(R.id.edDepositMoney);
        edInvestCultivation = findViewById(R.id.edInvestCultivation);
        edTakeLoan = findViewById(R.id.edTakeLoan);
        inputZakat = findViewById(R.id.inputZakat);
        ZakatDisplay = findViewById(R.id.ZakatDisplay);

        edJobEarn = findViewById(R.id.edJobEarn);
        edBusinessEarn = findViewById(R.id.edBusinessEarn);
        edHouseEarn = findViewById(R.id.edHouseEarn);
        edAgriEarn = findViewById(R.id.edAgriEarn);
        edOtherEarn = findViewById(R.id.edOtherEarn);
        inputTax = findViewById(R.id.inputTax);
        TaxDisplay = findViewById(R.id.TaxDisplay);


        inputZakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (edGold.length()>0 && edSilver.length()>0 && edStone.length()>0 && edCashTaka.length()>0 && edGiveLoan.length()>0 && edTreasure.length()>0 && edDepositMoney.length()>0 && edInvestCultivation.length()>0 && edTakeLoan.length()> 0){

                    float Gold = Float.parseFloat(edGold.getText().toString());
                    float Silver = Float.parseFloat(edSilver.getText().toString());
                    float Stone = Float.parseFloat(edStone.getText().toString());
                    float CashTaka = Float.parseFloat(edCashTaka.getText().toString());
                    float GiveLoan = Float.parseFloat(edGiveLoan.getText().toString());
                    float Treasure = Float.parseFloat(edTreasure.getText().toString());
                    float DepositMoney = Float.parseFloat(edDepositMoney.getText().toString());
                    float InvestCultivation = Float.parseFloat(edInvestCultivation.getText().toString());
                    float TakaLoan = Float.parseFloat(edTakeLoan.getText().toString());

                    int totalAsset = (int) ((Gold+Silver+Stone+CashTaka+GiveLoan+Treasure+DepositMoney+InvestCultivation)-TakaLoan);

                    if (totalAsset >= 43228){
                        ZakatDisplay.setText("আপনার মোট সম্পদের পরিমাণ "+totalAsset+" টাকা"+"\n\nআপনার যাকাত এর পরিমাণ হলো " +totalAsset*0.025+" টাকা");
                    }else {
                        ZakatDisplay.setText("আপনার উপর যাকাত ফরজ হই নি");
                    }
                }else {
                    if (edGold.length()<=0){
                        edGold.setError("স্বর্ণের মূল্য দিন");
                    }else if (edSilver.length()<=0){
                        edSilver.setError("রূপার মূল্য দিন");
                    }else if (edStone.length()<=0){
                        edStone.setError("মূল্যবান পাথর এর মূল্য দিন");
                    }else if (edCashTaka.length()<=0){
                        edCashTaka.setError("নগদ টাকার পরিমাণ দিন");
                    }else if (edGiveLoan.length()<=0){
                        edGiveLoan.setError("মোট কত ঋণ দিয়েছেন/বিনিয়োগ/তহবিল/শেয়ার এর পরিমাণ দিন");
                    }else if (edTreasure.length()<=0){
                        edTreasure.setError("মোট সম্পদের মূল্য দিন");
                    }else if (edDepositMoney.length()<=0){
                        edDepositMoney.setError("ব্যবসায় বিনিয়োগকৃত টাকার পরিমাণ দিন");
                    }else if (edInvestCultivation.length()<=0){
                        edInvestCultivation.setError("মোট প্রাণী/মাছ চাষ/পোল্ট্রি সম্পদের টাকার পরিমাণ দিন");
                    }else if (edTakeLoan.length()<=0){
                        edTakeLoan.setError("কত টাকা ঋণ/ধার নিয়েছেন তার পরিমাণ দিন");
                    }

                }
            }
        });

        inputTax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (edOtherEarn.length()>0 && edBusinessEarn.length()>0 && edHouseEarn.length()>0 && edAgriEarn.length()>0 && edOtherEarn.length()>0){
                float JobEarn = Float.parseFloat(edJobEarn.getText().toString());
                float BusinessEarn = Float.parseFloat(edBusinessEarn.getText().toString());
                float HouseEarn = Float.parseFloat(edHouseEarn.getText().toString());
                float AgriEarn = Float.parseFloat(edAgriEarn.getText().toString());
                float OtherEarn = Float.parseFloat(edOtherEarn.getText().toString());

                int allEarn = (int) (JobEarn+BusinessEarn+HouseEarn+AgriEarn+OtherEarn);
                int earn = 0;

                if (allEarn <= 300000){
                    earn = allEarn*0;
                }else if (allEarn <= 400000 ){
                    earn = (int) ((allEarn - 300000) * 0.05);
                }else if (allEarn <= 700000 ) {
                    earn = (int) (5000+ (allEarn - 400000) * 0.10);
                }else if (allEarn <= 1100000 ) {
                    earn = (int) (5000+30000+(allEarn - 700000) * 0.15);
                }else if (allEarn <= 1600000){
                    earn = (int) (5000+30000+60000+(allEarn - 1100000) * 0.20);
                }else if (allEarn <= 1700000){
                    earn = (int) (5000+30000+60000+100000+(allEarn - 1600000) * 0.25);
                }else {
                    earn = (int) (5000+30000+60000+100000+25000+(allEarn - 1700000) * 0.25);
                }

                TaxDisplay.setText("আপনার ট্যাক্স হচ্ছে " +earn+" টাকা");

                }else {
                    TaxDisplay.setText("দয়া করে সব পূরণ করুন");
                }


////                }else if (allEarn > 400000 && allEarn <= 1100000 ){
////                    TaxDisplay.setText("আপনার ট্যাক্স দিতে হবে " +(int) ((allEarn-700000) * 0.15)+ " টাকা");
////                }else if (allEarn > 400000 && allEarn <= 1600000 ){
////                    TaxDisplay.setText("আপনার ট্যাক্স দিতে হবে " +(int) ((allEarn-1100000) * 0.20)+ " টাকা");
////                }else if (allEarn > 400000 && allEarn <= 1700000 ){
////                    TaxDisplay.setText("আপনার ট্যাক্স দিতে হবে " +(int) ((allEarn-1600000) * 0.25)+ " টাকা");
//                }else {
//                    TaxDisplay.setText("Hi ");
//                }
            }
        });


    }
}