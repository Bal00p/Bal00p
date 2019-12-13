package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation9);
        TextView tx = (TextView)findViewById(R.id.textView92);
        TextView ch1 = (TextView)findViewById(R.id.textView93);
        TextView ch2 = (TextView)findViewById(R.id.textView94);
        TextView ch3 = (TextView)findViewById(R.id.textView95);
        TextView score = (TextView)findViewById(R.id.textView96);
        tx.setText(R.string.situation9);
        ch1.setText(R.string.ch91);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch92);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch93);
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
        Intent i = new Intent(Situation9.this, End.class);
        i.putExtra("sit", 91);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        Intent i = new Intent(Situation9.this, End.class);
        i.putExtra("sit", 92);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        Intent i = new Intent(Situation9.this, End.class);
        i.putExtra("sit", 93);
        startActivity(i);
        finish();
    }
}
