package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation6);
        TextView tx = (TextView)findViewById(R.id.textView62);
        TextView ch1 = (TextView)findViewById(R.id.textView63);
        TextView ch2 = (TextView)findViewById(R.id.textView64);
        TextView ch3 = (TextView)findViewById(R.id.textView65);
        TextView score = (TextView)findViewById(R.id.textView66);
        tx.setText(R.string.situation6);
        ch1.setText(R.string.ch61);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch62);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch63);
        ch3.setTextColor(Color.BLUE);
        follows = getIntent().getIntExtra("fol", follows);
        position = getIntent().getStringExtra("pos");
        money = getIntent().getIntExtra("mon", money);
        score.setText("["+position + ", $= " + money + ", " + follows+" :) ]");
        score.setTextColor(Color.DKGRAY);
    }

    //===game===
    public static int money;
    public  static int follows;
    public static String position;

    public void naClick1(View v){
        follows+=100;
        money-=100000;
        String position = "Businessman";
        Intent i = new Intent(Situation6.this, Situation7.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        follows+=5000;
        money-=5000000;
        String position = "Businessman";
        Intent i = new Intent(Situation6.this, Situation7.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        follows+=200;
        money+=1000000;
        String position = "Businessman";
        Intent i = new Intent(Situation6.this, Situation7.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
}
