package com.example.acer.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int Ascore = 0;
    private int Bscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
    public void submitOrder(View view) {
        displayPrice();
    }

    public void subtractQuantity(View view) {
        display(-1);
    }

    public void addQuantity(View view) {
        display(1);
    }

    /**
     * This method displays the given quantity value on the screen.

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_view);
        int quant = Integer.parseInt(quantityTextView.getText().toString()) + number;
        if (quant>0)
            quantityTextView.setText("" + quant);
    }

    private void displayPrice(){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_view);
        int quant = Integer.parseInt(quantityTextView.getText().toString()) * 5;
        TextView priceView = (TextView) findViewById(R.id.price_view);
        priceView.setText("The price is $" + quant + " for "+ quantityTextView.getText().toString()+" coffees");
    }*/

    private void displayAscore(){
        TextView TeamAview = (TextView) findViewById(R.id.teamA_score);
        TeamAview.setText(""+Ascore);
    }

    private void displayBscore(){
        TextView TeamBview = (TextView) findViewById(R.id.teamB_score);
        TeamBview.setText(""+Bscore);
    }

    public void addTeamA(View v){
    switch(v.getId()){
        case (R.id.a1):
            Ascore += 1;
           break;
        case (R.id.a2):
            Ascore += 2;
            break;
        case (R.id.a3):
            Ascore += 3;
            break;
    }
    displayAscore();
    }

    public void addTeamB(View v){
        switch(v.getId()){
            case (R.id.b1):
                Bscore += 1;
                break;
            case (R.id.b2):
                Bscore += 2;
                break;
            case (R.id.b3):
                Bscore += 3;
                break;
        }
        displayBscore();
    }

    public void reset(View v){
        Ascore = 0;
        Bscore = 0;
        displayAscore();
        displayBscore();
    }
}
