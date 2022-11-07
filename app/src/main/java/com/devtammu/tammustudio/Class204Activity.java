package com.devtammu.tammustudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Class204Activity extends AppCompatActivity {

    EditText edBuy,edSell,edBuyH,edProfitH;
    TextView profitDisplay,homeProfitDisplay;
    Button showInput,homeShowInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class204);

        edBuy = findViewById(R.id.edBuy);
        edSell = findViewById(R.id.edSell);
        profitDisplay = findViewById(R.id.profitDisplay);
        showInput = findViewById(R.id.showInput);

        edBuyH = findViewById(R.id.edBuyH);
        edProfitH = findViewById(R.id.edProfitH);
        homeProfitDisplay = findViewById(R.id.homeProfitDisplay);
        homeShowInput = findViewById(R.id.homeShowInput);


        showInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float buyPrice, sellPrice, profit,profitPercent;

                String sBuy = edBuy.getText().toString();
                buyPrice = Float.parseFloat(sBuy);

                String sSell = edSell.getText().toString();
                sellPrice = Float.parseFloat(sSell);

                profit = sellPrice - buyPrice;
                profitPercent = profit/buyPrice*100;

                profitDisplay.setText("Profit is: " +profit+ " Taka"+"\nProfit % is: "+profitPercent+"%");

            }
        });

        homeShowInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float buyPriceH,profitPercent,profitPercentCon,sellPriceH,totalProfit;

                String sbuyPrice = edBuyH.getText().toString();
                buyPriceH = Float.parseFloat(sbuyPrice);

                String sProfitPercent = edProfitH.getText().toString();
                profitPercent = Float.parseFloat(sProfitPercent);

                profitPercentCon = buyPriceH*(profitPercent/100);

                sellPriceH = buyPriceH+profitPercentCon;
                totalProfit = sellPriceH - buyPriceH;

                homeProfitDisplay.setText("Selling Price is: " +sellPriceH+" Taka" +"\nTotal Profit is: "+totalProfit);

            }
        });

    }
}