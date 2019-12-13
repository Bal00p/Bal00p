package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation7);
        TextView tx = (TextView)findViewById(R.id.textView72);
        TextView ch1 = (TextView)findViewById(R.id.textView73);
        TextView ch2 = (TextView)findViewById(R.id.textView74);
        TextView ch3 = (TextView)findViewById(R.id.textView75);
        TextView score = (TextView)findViewById(R.id.textView76);
        tx.setText(R.string.situation7);
        ch1.setText(R.string.ch71);
        ch1.setTextColor(Color.BLUE);
        ch2.setText(R.string.ch72);
        ch2.setTextColor(Color.BLUE);
        ch3.setText(R.string.ch73);
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

        follows+=30000;
        money+=70000000;
        String position = "Businessman";
        Intent i = new Intent(Situation7.this, Situation8.class);
        i.putExtra("fol", follows);
        i.putExtra("pos", position);
        i.putExtra("mon", money);
        startActivity(i);
        finish();
    }
    public void naClick2(View v){
        Intent i = new Intent(Situation7.this, End.class);
        i.putExtra("sit", 72);
        startActivity(i);
        finish();
    }
    public void naClick3(View v){
        Intent i = new Intent(Situation7.this, End.class);
        i.putExtra("sit", 73);
        startActivity(i);
        finish();
    }
}
