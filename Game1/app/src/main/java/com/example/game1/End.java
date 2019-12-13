package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class End extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        TextView tv_e = (TextView)findViewById(R.id.textView2e);
        int sit = 0;
        sit = getIntent().getIntExtra("sit", sit);
        if (sit == 12){
            tv_e.setText(R.string.end12);
        }
        if (sit == 43){
            tv_e.setText(R.string.end43);
        }
        if (sit == 51){
            tv_e.setText(R.string.end51);
        }
        if (sit == 52){
            tv_e.setText(R.string.end52);
        }
        if (sit == 72){
            tv_e.setText(R.string.end72);
        }
        if (sit == 73){
            tv_e.setText(R.string.end73);
        }
        if (sit == 83){
            tv_e.setText(R.string.end83);
        }
        if (sit == 91){
            tv_e.setText(R.string.end91);
        }
        if (sit == 92){
            tv_e.setText(R.string.end92);
        }
        if (sit == 93){
            tv_e.setText(R.string.end93);
        }
        if (sit == 102){
            tv_e.setText(R.string.end102);
        }
        if (sit == 103){
            tv_e.setText(R.string.end103);
        }
        if (sit == 111){
            tv_e.setText(R.string.end111);
        }
        if (sit == 112){
            tv_e.setText(R.string.end112);
        }
        if (sit == 113){
            tv_e.setText(R.string.end113);
        }
    }
    public void naClick(View v){
        Intent i = new Intent(End.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
