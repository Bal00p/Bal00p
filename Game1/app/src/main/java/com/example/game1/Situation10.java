package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation10);
        TextView tx = (TextView)findViewById(R.id.textView102);
        TextView ch1 = (TextView)findViewById(R.id.textView103);
        TextView ch2 = (TextView)findViewById(R.id.textView104);
        TextView ch3 = (TextView)findViewById(R.id.textView105);
        TextView score = (TextView)findViewById(R.id.textView106);
        tx.setText(R.string.situation10);
        ch1.setText(R.string.ch101);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch102);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch103);
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
        follows+=1000000000;
        String money_s = "A lot of";
        String position = "President";
        Intent i = new Intent(Situation10.this, Situation11.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money_s);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        Intent i = new Intent(Situation10.this, End.class);
        i.putExtra("sit", 102);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        Intent i = new Intent(Situation10.this, End.class);
        i.putExtra("sit", 103);
        startActivity(i);
        finish();
    }
}
