package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation3);

        TextView tx = (TextView)findViewById(R.id.textView32);
        TextView ch1 = (TextView)findViewById(R.id.textView33);
        TextView ch2 = (TextView)findViewById(R.id.textView34);
        TextView ch3 = (TextView)findViewById(R.id.textView35);
        TextView score = (TextView)findViewById(R.id.textView36);
        tx.setText(R.string.situation3);
        ch1.setText(R.string.ch31);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch32);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch33);
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
    public static String position = "Graduate";

    public void naClick1(View v){
        follows+=300;
        money+=550000;
        String position = "Student-practice";
        Intent i = new Intent(Situation3.this, Situation4.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        follows+=10;
        money+=50000;
        String position = "Student";
        Intent i = new Intent(Situation3.this, Situation4.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        follows+=50;
        money+=150000;
        String position = "Student";
        Intent i = new Intent(Situation3.this, Situation4.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
}
