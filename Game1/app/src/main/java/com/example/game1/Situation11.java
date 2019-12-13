package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation11);
        TextView tx = (TextView)findViewById(R.id.textView112);
        TextView ch1 = (TextView)findViewById(R.id.textView113);
        TextView ch2 = (TextView)findViewById(R.id.textView114);
        TextView ch3 = (TextView)findViewById(R.id.textView115);
        TextView score = (TextView)findViewById(R.id.textView116);
        tx.setText(R.string.situation11);
        ch1.setText(R.string.ch111);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch112);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch113);
        ch3.setTextColor(Color.BLUE);
        follows = getIntent().getIntExtra("fol", follows);
        position = getIntent().getStringExtra("pos");
        money_s = getIntent().getStringExtra("mon");
        score.setText("["+position + ", $= " + money_s + ", " + follows+" :) ]");
        score.setTextColor(Color.DKGRAY);
    }

    //===game===
    public static String money_s;
    public  static int follows;
    public static String position;

    public void naClick1(View v){
        Intent i = new Intent(Situation11.this, End.class);
        i.putExtra("sit", 111);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        Intent i = new Intent(Situation11.this, End.class);
        i.putExtra("sit", 112);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        Intent i = new Intent(Situation11.this, End.class);
        i.putExtra("sit", 113);
        startActivity(i);
        finish();
    }
}
