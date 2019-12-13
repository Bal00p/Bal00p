package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation1);


        TextView tx = (TextView) findViewById(R.id.textView12);
        TextView ch1 = (TextView) findViewById(R.id.textView13);
        TextView ch2 = (TextView) findViewById(R.id.textView14);
        TextView ch3 = (TextView) findViewById(R.id.textView15);
        TextView score = (TextView) findViewById(R.id.textView16);
        score.setText("["+position + ", $= " + money + ", " + follows+" :) ]");
        score.setTextColor(Color.DKGRAY);
        tx.setText(R.string.situation1);
        ch1.setText(R.string.ch11);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch12);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch13);
        ch3.setTextColor(Color.BLUE);
        money = 0;
        follows = 0;

    }


    //===game===
    private static int money;
    private static int follows;
    private static String position = "Kid";

    public void naClick1(View v) {
        follows += 400;
        String position = "Student";
        Intent i = new Intent(Situation1.this, Situation2.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }

    public void naClick2(View v) {
        Intent i = new Intent(Situation1.this, End.class);
        i.putExtra("sit", 12);
        startActivity(i);
        finish();
    }

    public void naClick3(View v) {
        follows += 10;
        String position = "Student";
        Intent i = new Intent(Situation1.this, Situation2.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
}