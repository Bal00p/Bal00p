package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation2);
        TextView tx = (TextView)findViewById(R.id.textView22);
        TextView ch1 = (TextView)findViewById(R.id.textView23);
        TextView ch2 = (TextView)findViewById(R.id.textView24);
        TextView ch3 = (TextView)findViewById(R.id.textView25);
        TextView score = (TextView)findViewById(R.id.textView26);

        tx.setText(R.string.situation2);
        ch1.setText(R.string.ch21);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch22);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch23);
        ch3.setTextColor(Color.BLUE);

        follows = getIntent().getIntExtra("fol", follows);
        money = getIntent().getIntExtra("mon", money);
        position = getIntent().getStringExtra("pos");
        score.setText("["+position + ", $= " + money + ", " + follows+" :) ]");
        score.setTextColor(Color.DKGRAY);
    }
    //===game===
    private int money;
    private int follows;
    private String position = "Student";

    public void naClick1(View v){
        follows+=100;
        String position = "Graduate";
        Intent i = new Intent(Situation2.this, Situation3.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        follows+=500;
        String position = "Graduate";
        Intent i = new Intent(Situation2.this, Situation3.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        follows+=10;
        String position = "Graduate";
        Intent i = new Intent(Situation2.this, Situation3.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
}
