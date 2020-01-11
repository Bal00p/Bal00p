package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.Button;

public class Timetable extends AppCompatActivity {
    Button btn_mon, btn_tue, btn_wed, btn_thu, btn_fri, btn_sat, btn_sun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        btn_mon = (Button)findViewById(R.id.btnMon);
        btn_tue = (Button)findViewById(R.id.btnTue);
        btn_wed = (Button)findViewById(R.id.btnWed);
        btn_thu = (Button)findViewById(R.id.btnThu);
        btn_fri = (Button)findViewById(R.id.btnFri);
        btn_sat = (Button)findViewById(R.id.btnSat);
        btn_sun = (Button)findViewById(R.id.btnSun);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                switch (v.getId()){
                    case R.id.btnMon:
                        i = new Intent(Timetable.this, Monday.class);
                        startActivity(i);
                        break;
                    case R.id.btnTue:
                        i = new Intent(Timetable.this, Tuesday.class);
                        startActivity(i);
                        break;
                    case R.id.btnWed:
                        i = new Intent(Timetable.this, Wednesday.class);
                        startActivity(i);
                        break;
                    case R.id.btnThu:
                        i = new Intent(Timetable.this, Thursday.class);
                        startActivity(i);
                        break;
                    case R.id.btnFri:
                        i = new Intent(Timetable.this, Friday.class);
                        startActivity(i);
                        break;
                    case R.id.btnSat:
                        i = new Intent(Timetable.this, Saturday.class);
                        startActivity(i);
                        break;
                    case R.id.btnSun:
                        i = new Intent(Timetable.this, Sunday.class);
                        startActivity(i);
                        break;
                }
            }
        };
        btn_mon.setOnClickListener(listener);
        btn_tue.setOnClickListener(listener);
        btn_wed.setOnClickListener(listener);
        btn_thu.setOnClickListener(listener);
        btn_fri.setOnClickListener(listener);
        btn_sat.setOnClickListener(listener);
        btn_sun.setOnClickListener(listener);
    }
}
