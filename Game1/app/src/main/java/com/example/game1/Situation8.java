package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation8);
        TextView tx = (TextView)findViewById(R.id.textView82);
        TextView ch1 = (TextView)findViewById(R.id.textView83);
        TextView ch2 = (TextView)findViewById(R.id.textView84);
        TextView ch3 = (TextView)findViewById(R.id.textView85);
        TextView score = (TextView)findViewById(R.id.textView86);
        tx.setText(R.string.situation8);
        ch1.setText(R.string.ch81);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch82);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch83);
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
        follows+=100000;
        money+=100000000;
        String position = "Politician";
        Intent i = new Intent(Situation8.this, Situation10.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        follows+=10000000;
        money+=1000000000;
        String position = "Monopolist";
        Intent i = new Intent(Situation8.this, Situation9.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        Intent i = new Intent(Situation8.this, End.class);
        i.putExtra("sit", 83);
        startActivity(i);
        finish();
    }
}
