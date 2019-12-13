package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation5);
        TextView tx = (TextView)findViewById(R.id.textView52);
        TextView ch1 = (TextView)findViewById(R.id.textView53);
        TextView ch2 = (TextView)findViewById(R.id.textView54);
        TextView ch3 = (TextView)findViewById(R.id.textView55);
        TextView score = (TextView)findViewById(R.id.textView56);
        tx.setText(R.string.situation5);
        ch1.setText(R.string.ch51);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch52);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch53);
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
        Intent i = new Intent(Situation5.this, End.class);
        i.putExtra("sit", 51);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        Intent i = new Intent(Situation5.this, End.class);
        i.putExtra("sit", 52);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        follows+=100;
        money-=1000000;
        String position = "Businessman";
        Intent i = new Intent(Situation5.this, Situation6.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
}
