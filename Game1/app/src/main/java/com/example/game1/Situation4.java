package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation4);
        TextView tx = (TextView)findViewById(R.id.textView42);
        TextView ch1 = (TextView)findViewById(R.id.textView43);
        TextView ch2 = (TextView)findViewById(R.id.textView44);
        TextView ch3 = (TextView)findViewById(R.id.textView45);
        TextView score = (TextView)findViewById(R.id.textView46);
        tx.setText(R.string.situation4);
        ch1.setText(R.string.ch41);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch42);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch43);
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
        follows+=500;
        money+=1000000;
        String position = "Worker";
        Intent i = new Intent(Situation4.this, Situation5.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        follows+=100;
        money-=1000000;
        String position = "Businessman";
        Intent i = new Intent(Situation4.this, Situation6.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        Intent i = new Intent(Situation4.this, End.class);
        i.putExtra("sit", 43);
        startActivity(i);
        finish();
    }
}
