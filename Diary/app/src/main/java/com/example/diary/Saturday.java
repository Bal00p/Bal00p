package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Saturday extends AppCompatActivity {
Button edit;

    TextView less1, less2, less3, less4, less5, less6, less7, less8, course1, course2, course3;
    TextView cab1, cab2, cab3, cab4, cab5, cab6, cab7, cab8, cabC1, cabC2, cabC3;
    TextView time1, time2, time3, time4, time5, time6, time7, time8, timeC1, timeC2, timeC3;
    TextView notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);

        less1 = (TextView)findViewById(R.id.sat_less_1);
        less2 = (TextView)findViewById(R.id.sat_less_2);
        less3 = (TextView)findViewById(R.id.sat_less_3);
        less4 = (TextView)findViewById(R.id.sat_less_4);
        less5 = (TextView)findViewById(R.id.sat_less_5);
        less6 = (TextView)findViewById(R.id.sat_less_6);
        less7 = (TextView)findViewById(R.id.sat_less_7);
        less8 = (TextView)findViewById(R.id.sat_less_8);
        course1 = (TextView)findViewById(R.id.sat_course_1);
        course2 = (TextView)findViewById(R.id.sat_course_2);
        course3 = (TextView)findViewById(R.id.sat_course_3);
        cab1 = (TextView)findViewById(R.id.sat_cab_less_1);
        cab2 = (TextView)findViewById(R.id.sat_cab_less_2);
        cab3 = (TextView)findViewById(R.id.sat_cab_less_3);
        cab4 = (TextView)findViewById(R.id.sat_cab_less_4);
        cab5 = (TextView)findViewById(R.id.sat_cab_less_5);
        cab6 = (TextView)findViewById(R.id.sat_cab_less_6);
        cab7 = (TextView)findViewById(R.id.sat_cab_less_7);
        cab8 = (TextView)findViewById(R.id.sat_cab_less_8);
        cabC1 = (TextView)findViewById(R.id.sat_cab_course_1);
        cabC2 = (TextView)findViewById(R.id.sat_cab_course_2);
        cabC3 = (TextView)findViewById(R.id.sat_cab_course_3);
        time1 = (TextView)findViewById(R.id.sat_time_less_1);
        time2 = (TextView)findViewById(R.id.sat_time_less_2);
        time3 = (TextView)findViewById(R.id.sat_time_less_3);
        time4 = (TextView)findViewById(R.id.sat_time_less_4);
        time5 = (TextView)findViewById(R.id.sat_time_less_5);
        time6 = (TextView)findViewById(R.id.sat_time_less_6);
        time7 = (TextView)findViewById(R.id.sat_time_less_7);
        time8 = (TextView)findViewById(R.id.sat_time_less_8);
        timeC1 = (TextView)findViewById(R.id.sat_time_course_1);
        timeC2 = (TextView)findViewById(R.id.sat_time_course_2);
        timeC3 = (TextView)findViewById(R.id.sat_time_course_3);
        notes = (TextView)findViewById(R.id.sat_notes);

        try {

            SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
            mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
            Toast.makeText(getApplicationContext(),"open base",Toast.LENGTH_SHORT);
            Cursor cursor = mybase.rawQuery("select day, lesson, cabinet, time from use", null);

            while (cursor.moveToNext()){
                String day = cursor.getString(0);
                String less = cursor.getString(1);
                String cab = cursor.getString(2);
                String time = cursor.getString(3);

                if(day.equals("sa1")){
                    less1.setText(less);
                    cab1.setText(cab);
                    time1.setText(time);
                }
                if(day.equals("sa2")){
                    less2.setText(less);
                    cab2.setText(cab);
                    time2.setText(time);
                }
                if(day.equals("sa3")){
                    less3.setText(less);
                    cab3.setText(cab);
                    time3.setText(time);
                }
                if(day.equals("sa4")) {
                    less4.setText(less);
                    cab4.setText(cab);
                    time4.setText(time);
                }
                if(day.equals("sa5")) {
                    less5.setText(less);
                    cab5.setText(cab);
                    time5.setText(time);
                }
                if(day.equals("sa6")) {
                    less6.setText(less);
                    cab6.setText(cab);
                    time6.setText(time);
                }
                if(day.equals("sa7")) {
                    less7.setText(less);
                    cab7.setText(cab);
                    time7.setText(time);
                }
                if(day.equals("sa8")){
                    less8.setText(less);
                    cab8.setText(cab);
                    time8.setText(time);
                }
                if(day.equals("sa9")){
                    course1.setText(less);
                    cabC1.setText(cab);
                    timeC1.setText(time);
                }
                if(day.equals("sa0")){
                    course2.setText(less);
                    cabC2.setText(cab);
                    timeC2.setText(time);
                }
                if(day.equals("sa_")){
                    course3.setText(less);
                    cabC3.setText(cab);
                    timeC3.setText(time);
                }
                if(day.equals("san")){
                    notes.setText(less);
                }
            }
            cursor.close();
            mybase.close();
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"ERR",Toast.LENGTH_SHORT);
        }

        edit = (Button)findViewById(R.id.btn_edit_sat);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_edit_sat:
                        Intent i = new Intent(Saturday.this, EditDayWeek.class);
                        String day = "СУББОТА";
                        i.putExtra("dotw",day);
                        startActivity(i);
                        finish();
                        break;
                }
            }
        };
        edit.setOnClickListener(listener);
    }
}
