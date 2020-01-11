package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditDayWeek extends AppCompatActivity {
    TextView tv_day;
    Button done;

    EditText less1, less2, less3, less4, less5, less6, less7, less8, course1, course2, course3;
    EditText cab1, cab2, cab3, cab4, cab5, cab6, cab7, cab8, cabC1, cabC2, cabC3;
    EditText time1, time2, time3, time4, time5, time6, time7, time8, timeC1, timeC2, timeC3;
    EditText notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_day_week);

        less1 = (EditText) findViewById(R.id.edit_less_1);
        less2 = (EditText) findViewById(R.id.edit_less_2);
        less3 = (EditText) findViewById(R.id.edit_less_3);
        less4 = (EditText) findViewById(R.id.edit_less_4);
        less5 = (EditText) findViewById(R.id.edit_less_5);
        less6 = (EditText) findViewById(R.id.edit_less_6);
        less7 = (EditText) findViewById(R.id.edit_less_7);
        less8 = (EditText) findViewById(R.id.edit_less_8);
        course1 = (EditText) findViewById(R.id.edit_course_1);
        course2 = (EditText) findViewById(R.id.edit_course_2);
        course3 = (EditText) findViewById(R.id.edit_course_3);
        cab1 = (EditText) findViewById(R.id.edit_cab_less_1);
        cab2 = (EditText) findViewById(R.id.edit_cab_less_2);
        cab3 = (EditText) findViewById(R.id.edit_cab_less_3);
        cab4 = (EditText) findViewById(R.id.edit_cab_less_4);
        cab5 = (EditText) findViewById(R.id.edit_cab_less_5);
        cab6 = (EditText) findViewById(R.id.edit_cab_less_6);
        cab7 = (EditText) findViewById(R.id.edit_cab_less_7);
        cab8 = (EditText) findViewById(R.id.edit_cab_less_8);
        cabC1 = (EditText) findViewById(R.id.edit_cab_course_1);
        cabC2 = (EditText) findViewById(R.id.edit_cab_course_2);
        cabC3 = (EditText) findViewById(R.id.edit_cab_course_3);
        time1 = (EditText) findViewById(R.id.edit_time_less_1);
        time2 = (EditText) findViewById(R.id.edit_time_less_2);
        time3 = (EditText) findViewById(R.id.edit_time_less_3);
        time4 = (EditText) findViewById(R.id.edit_time_less_4);
        time5 = (EditText) findViewById(R.id.edit_time_less_5);
        time6 = (EditText) findViewById(R.id.edit_time_less_6);
        time7 = (EditText) findViewById(R.id.edit_time_less_7);
        time8 = (EditText) findViewById(R.id.edit_time_less_8);
        timeC1 = (EditText) findViewById(R.id.edit_time_course_1);
        timeC2 = (EditText) findViewById(R.id.edit_time_course_2);
        timeC3 = (EditText) findViewById(R.id.edit_time_course_3);
        notes = (EditText) findViewById(R.id.edit_notes);




        String day = getIntent().getStringExtra("dotw");
        tv_day = (TextView)findViewById(R.id.this_day);
        done = (Button)findViewById(R.id.btn_done);
        tv_day.setText(day);

        if (tv_day.getText().toString().equals("ПОНЕДЕЛЬНИК")){

            try {

                SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
                mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
                Toast.makeText(getApplicationContext(),"open base",Toast.LENGTH_SHORT);
                Cursor cursor = mybase.rawQuery("select day, lesson, cabinet, time from use", null);

                while (cursor.moveToNext()){
                    String dayT = cursor.getString(0);
                    String less = cursor.getString(1);
                    String cab = cursor.getString(2);
                    String time = cursor.getString(3);

                    if(dayT.equals("mo1")){
                        less1.setText(less);
                        cab1.setText(cab);
                        time1.setText(time);
                    }
                    if(dayT.equals("mo2")){
                        less2.setText(less);
                        cab2.setText(cab);
                        time2.setText(time);
                    }
                    if(dayT.equals("mo3")){
                        less3.setText(less);
                        cab3.setText(cab);
                        time3.setText(time);
                    }
                    if(dayT.equals("mo4")) {
                        less4.setText(less);
                        cab4.setText(cab);
                        time4.setText(time);
                    }
                    if(dayT.equals("mo5")) {
                        less5.setText(less);
                        cab5.setText(cab);
                        time5.setText(time);
                    }
                    if(dayT.equals("mo6")) {
                        less6.setText(less);
                        cab6.setText(cab);
                        time6.setText(time);
                    }
                    if(dayT.equals("mo7")) {
                        less7.setText(less);
                        cab7.setText(cab);
                        time7.setText(time);
                    }
                    if(dayT.equals("mo8")){
                        less8.setText(less);
                        cab8.setText(cab);
                        time8.setText(time);
                    }
                    if(dayT.equals("mo9")){
                        course1.setText(less);
                        cabC1.setText(cab);
                        timeC1.setText(time);
                    }
                    if(dayT.equals("mo0")){
                        course2.setText(less);
                        cabC2.setText(cab);
                        timeC2.setText(time);
                    }
                    if(dayT.equals("mo_")){
                        course3.setText(less);
                        cabC3.setText(cab);
                        timeC3.setText(time);
                    }
                    if(dayT.equals("mon")){
                        notes.setText(less);
                    }
                }
                cursor.close();
                mybase.close();

            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"ERR",Toast.LENGTH_SHORT);
            }
        }
        if (tv_day.getText().toString().equals("ВТОРНИК")){
            {

                try {

                    SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
                    mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
                    Toast.makeText(getApplicationContext(),"open base",Toast.LENGTH_SHORT);
                    Cursor cursor = mybase.rawQuery("select day, lesson, cabinet, time from use", null);

                    while (cursor.moveToNext()){
                        String dayT = cursor.getString(0);
                        String less = cursor.getString(1);
                        String cab = cursor.getString(2);
                        String time = cursor.getString(3);

                        if(dayT.equals("tu1")){
                            less1.setText(less);
                            cab1.setText(cab);
                            time1.setText(time);
                        }
                        if(dayT.equals("tu2")){
                            less2.setText(less);
                            cab2.setText(cab);
                            time2.setText(time);
                        }
                        if(dayT.equals("tu3")){
                            less3.setText(less);
                            cab3.setText(cab);
                            time3.setText(time);
                        }
                        if(dayT.equals("tu4")) {
                            less4.setText(less);
                            cab4.setText(cab);
                            time4.setText(time);
                        }
                        if(dayT.equals("tu5")) {
                            less5.setText(less);
                            cab5.setText(cab);
                            time5.setText(time);
                        }
                        if(dayT.equals("tu6")) {
                            less6.setText(less);
                            cab6.setText(cab);
                            time6.setText(time);
                        }
                        if(dayT.equals("tu7")) {
                            less7.setText(less);
                            cab7.setText(cab);
                            time7.setText(time);
                        }
                        if(dayT.equals("tu8")){
                            less8.setText(less);
                            cab8.setText(cab);
                            time8.setText(time);
                        }
                        if(dayT.equals("tu9")){
                            course1.setText(less);
                            cabC1.setText(cab);
                            timeC1.setText(time);
                        }
                        if(dayT.equals("mtu0")){
                            course2.setText(less);
                            cabC2.setText(cab);
                            timeC2.setText(time);
                        }
                        if(dayT.equals("tu_")){
                            course3.setText(less);
                            cabC3.setText(cab);
                            timeC3.setText(time);
                        }
                        if(dayT.equals("tun")){
                            notes.setText(less);
                        }
                    }
                    cursor.close();
                    mybase.close();

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERR",Toast.LENGTH_SHORT);
                }
            }
        }
        if (tv_day.getText().toString().equals("СРЕДА")){
            {

                try {

                    SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
                    mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
                    Toast.makeText(getApplicationContext(),"open base",Toast.LENGTH_SHORT);
                    Cursor cursor = mybase.rawQuery("select day, lesson, cabinet, time from use", null);

                    while (cursor.moveToNext()){
                        String dayT = cursor.getString(0);
                        String less = cursor.getString(1);
                        String cab = cursor.getString(2);
                        String time = cursor.getString(3);

                        if(dayT.equals("we1")){
                            less1.setText(less);
                            cab1.setText(cab);
                            time1.setText(time);
                        }
                        if(dayT.equals("we2")){
                            less2.setText(less);
                            cab2.setText(cab);
                            time2.setText(time);
                        }
                        if(dayT.equals("we3")){
                            less3.setText(less);
                            cab3.setText(cab);
                            time3.setText(time);
                        }
                        if(dayT.equals("we4")) {
                            less4.setText(less);
                            cab4.setText(cab);
                            time4.setText(time);
                        }
                        if(dayT.equals("we5")) {
                            less5.setText(less);
                            cab5.setText(cab);
                            time5.setText(time);
                        }
                        if(dayT.equals("we6")) {
                            less6.setText(less);
                            cab6.setText(cab);
                            time6.setText(time);
                        }
                        if(dayT.equals("we7")) {
                            less7.setText(less);
                            cab7.setText(cab);
                            time7.setText(time);
                        }
                        if(dayT.equals("we8")){
                            less8.setText(less);
                            cab8.setText(cab);
                            time8.setText(time);
                        }
                        if(dayT.equals("we9")){
                            course1.setText(less);
                            cabC1.setText(cab);
                            timeC1.setText(time);
                        }
                        if(dayT.equals("we0")){
                            course2.setText(less);
                            cabC2.setText(cab);
                            timeC2.setText(time);
                        }
                        if(dayT.equals("we_")){
                            course3.setText(less);
                            cabC3.setText(cab);
                            timeC3.setText(time);
                        }
                        if(dayT.equals("wen")){
                            notes.setText(less);
                        }
                    }
                    cursor.close();
                    mybase.close();

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERR",Toast.LENGTH_SHORT);
                }
            }
        }
        if (tv_day.getText().toString().equals("ЧЕТВЕРГ")){
            {

                try {

                    SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
                    mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
                    Toast.makeText(getApplicationContext(),"open base",Toast.LENGTH_SHORT);
                    Cursor cursor = mybase.rawQuery("select day, lesson, cabinet, time from use", null);

                    while (cursor.moveToNext()){
                        String dayT = cursor.getString(0);
                        String less = cursor.getString(1);
                        String cab = cursor.getString(2);
                        String time = cursor.getString(3);

                        if(dayT.equals("th1")){
                            less1.setText(less);
                            cab1.setText(cab);
                            time1.setText(time);
                        }
                        if(dayT.equals("th2")){
                            less2.setText(less);
                            cab2.setText(cab);
                            time2.setText(time);
                        }
                        if(dayT.equals("th3")){
                            less3.setText(less);
                            cab3.setText(cab);
                            time3.setText(time);
                        }
                        if(dayT.equals("th4")) {
                            less4.setText(less);
                            cab4.setText(cab);
                            time4.setText(time);
                        }
                        if(dayT.equals("th5")) {
                            less5.setText(less);
                            cab5.setText(cab);
                            time5.setText(time);
                        }
                        if(dayT.equals("th6")) {
                            less6.setText(less);
                            cab6.setText(cab);
                            time6.setText(time);
                        }
                        if(dayT.equals("th7")) {
                            less7.setText(less);
                            cab7.setText(cab);
                            time7.setText(time);
                        }
                        if(dayT.equals("th8")){
                            less8.setText(less);
                            cab8.setText(cab);
                            time8.setText(time);
                        }
                        if(dayT.equals("th9")){
                            course1.setText(less);
                            cabC1.setText(cab);
                            timeC1.setText(time);
                        }
                        if(dayT.equals("th0")){
                            course2.setText(less);
                            cabC2.setText(cab);
                            timeC2.setText(time);
                        }
                        if(dayT.equals("th_")){
                            course3.setText(less);
                            cabC3.setText(cab);
                            timeC3.setText(time);
                        }
                        if(dayT.equals("thn")){
                            notes.setText(less);
                        }
                    }
                    cursor.close();
                    mybase.close();

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERR",Toast.LENGTH_SHORT);
                }
            }
        }
        if (tv_day.getText().toString().equals("ПЯТНИЦА")){
            {

                try {

                    SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
                    mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
                    Toast.makeText(getApplicationContext(),"open base",Toast.LENGTH_SHORT);
                    Cursor cursor = mybase.rawQuery("select day, lesson, cabinet, time from use", null);

                    while (cursor.moveToNext()){
                        String dayT = cursor.getString(0);
                        String less = cursor.getString(1);
                        String cab = cursor.getString(2);
                        String time = cursor.getString(3);

                        if(dayT.equals("fr1")){
                            less1.setText(less);
                            cab1.setText(cab);
                            time1.setText(time);
                        }
                        if(dayT.equals("fr2")){
                            less2.setText(less);
                            cab2.setText(cab);
                            time2.setText(time);
                        }
                        if(dayT.equals("fr3")){
                            less3.setText(less);
                            cab3.setText(cab);
                            time3.setText(time);
                        }
                        if(dayT.equals("fr4")) {
                            less4.setText(less);
                            cab4.setText(cab);
                            time4.setText(time);
                        }
                        if(dayT.equals("fr5")) {
                            less5.setText(less);
                            cab5.setText(cab);
                            time5.setText(time);
                        }
                        if(dayT.equals("fr6")) {
                            less6.setText(less);
                            cab6.setText(cab);
                            time6.setText(time);
                        }
                        if(dayT.equals("fr7")) {
                            less7.setText(less);
                            cab7.setText(cab);
                            time7.setText(time);
                        }
                        if(dayT.equals("fr8")){
                            less8.setText(less);
                            cab8.setText(cab);
                            time8.setText(time);
                        }
                        if(dayT.equals("fr9")){
                            course1.setText(less);
                            cabC1.setText(cab);
                            timeC1.setText(time);
                        }
                        if(dayT.equals("fr0")){
                            course2.setText(less);
                            cabC2.setText(cab);
                            timeC2.setText(time);
                        }
                        if(dayT.equals("fr_")){
                            course3.setText(less);
                            cabC3.setText(cab);
                            timeC3.setText(time);
                        }
                        if(dayT.equals("frn")){
                            notes.setText(less);
                        }
                    }
                    cursor.close();
                    mybase.close();

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERR",Toast.LENGTH_SHORT);
                }
            }
        }
        if (tv_day.getText().toString().equals("СУББОТА")){
            {

                try {

                    SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
                    mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
                    Toast.makeText(getApplicationContext(),"open base",Toast.LENGTH_SHORT);
                    Cursor cursor = mybase.rawQuery("select day, lesson, cabinet, time from use", null);

                    while (cursor.moveToNext()){
                        String dayT = cursor.getString(0);
                        String less = cursor.getString(1);
                        String cab = cursor.getString(2);
                        String time = cursor.getString(3);

                        if(dayT.equals("sa1")){
                            less1.setText(less);
                            cab1.setText(cab);
                            time1.setText(time);
                        }
                        if(dayT.equals("sa2")){
                            less2.setText(less);
                            cab2.setText(cab);
                            time2.setText(time);
                        }
                        if(dayT.equals("sa3")){
                            less3.setText(less);
                            cab3.setText(cab);
                            time3.setText(time);
                        }
                        if(dayT.equals("sa4")) {
                            less4.setText(less);
                            cab4.setText(cab);
                            time4.setText(time);
                        }
                        if(dayT.equals("sa5")) {
                            less5.setText(less);
                            cab5.setText(cab);
                            time5.setText(time);
                        }
                        if(dayT.equals("sa6")) {
                            less6.setText(less);
                            cab6.setText(cab);
                            time6.setText(time);
                        }
                        if(dayT.equals("sa7")) {
                            less7.setText(less);
                            cab7.setText(cab);
                            time7.setText(time);
                        }
                        if(dayT.equals("sa8")){
                            less8.setText(less);
                            cab8.setText(cab);
                            time8.setText(time);
                        }
                        if(dayT.equals("sa9")){
                            course1.setText(less);
                            cabC1.setText(cab);
                            timeC1.setText(time);
                        }
                        if(dayT.equals("sa0")){
                            course2.setText(less);
                            cabC2.setText(cab);
                            timeC2.setText(time);
                        }
                        if(dayT.equals("sa_")){
                            course3.setText(less);
                            cabC3.setText(cab);
                            timeC3.setText(time);
                        }
                        if(dayT.equals("san")){
                            notes.setText(less);
                        }
                    }
                    cursor.close();
                    mybase.close();

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERR",Toast.LENGTH_SHORT);
                }
            }
        }
        if (tv_day.getText().toString().equals("ВОСКРЕСЕНЬЕ")){
            {

                try {

                    SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
                    mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
                    Toast.makeText(getApplicationContext(),"open base",Toast.LENGTH_SHORT);
                    Cursor cursor = mybase.rawQuery("select day, lesson, cabinet, time from use", null);

                    while (cursor.moveToNext()){
                        String dayT = cursor.getString(0);
                        String less = cursor.getString(1);
                        String cab = cursor.getString(2);
                        String time = cursor.getString(3);

                        if(dayT.equals("su1")){
                            less1.setText(less);
                            cab1.setText(cab);
                            time1.setText(time);
                        }
                        if(dayT.equals("su2")){
                            less2.setText(less);
                            cab2.setText(cab);
                            time2.setText(time);
                        }
                        if(dayT.equals("su3")){
                            less3.setText(less);
                            cab3.setText(cab);
                            time3.setText(time);
                        }
                        if(dayT.equals("su4")) {
                            less4.setText(less);
                            cab4.setText(cab);
                            time4.setText(time);
                        }
                        if(dayT.equals("su5")) {
                            less5.setText(less);
                            cab5.setText(cab);
                            time5.setText(time);
                        }
                        if(dayT.equals("su6")) {
                            less6.setText(less);
                            cab6.setText(cab);
                            time6.setText(time);
                        }
                        if(dayT.equals("su7")) {
                            less7.setText(less);
                            cab7.setText(cab);
                            time7.setText(time);
                        }
                        if(dayT.equals("su8")){
                            less8.setText(less);
                            cab8.setText(cab);
                            time8.setText(time);
                        }
                        if(dayT.equals("su9")){
                            course1.setText(less);
                            cabC1.setText(cab);
                            timeC1.setText(time);
                        }
                        if(dayT.equals("su0")){
                            course2.setText(less);
                            cabC2.setText(cab);
                            timeC2.setText(time);
                        }
                        if(dayT.equals("su_")){
                            course3.setText(less);
                            cabC3.setText(cab);
                            timeC3.setText(time);
                        }
                        if(dayT.equals("sun")){
                            notes.setText(less);
                        }
                    }
                    cursor.close();
                    mybase.close();

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERR",Toast.LENGTH_SHORT);
                }
            }
        }

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_done:
                        SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
                        mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(3), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
                        try {
                            ContentValues str1 = new ContentValues();
                            str1.put("lesson", less1.getText().toString());
                            str1.put("cabinet", cab1.getText().toString());
                            str1.put("time", time1.getText().toString());
                            ContentValues str2 = new ContentValues();
                            str2.put("lesson", less2.getText().toString());
                            str2.put("cabinet", cab2.getText().toString());
                            str2.put("time", time2.getText().toString());
                            ContentValues str3 = new ContentValues();
                            str3.put("lesson", less3.getText().toString());
                            str3.put("cabinet", cab3.getText().toString());
                            str3.put("time", time3.getText().toString());
                            ContentValues str4 = new ContentValues();
                            str4.put("lesson", less4.getText().toString());
                            str4.put("cabinet", cab4.getText().toString());
                            str4.put("time", time4.getText().toString());
                            ContentValues str5 = new ContentValues();
                            str5.put("lesson", less5.getText().toString());
                            str5.put("cabinet", cab5.getText().toString());
                            str5.put("time", time5.getText().toString());
                            ContentValues str6 = new ContentValues();
                            str6.put("lesson", less6.getText().toString());
                            str6.put("cabinet", cab6.getText().toString());
                            str6.put("time", time6.getText().toString());
                            ContentValues str7 = new ContentValues();
                            str7.put("lesson", less7.getText().toString());
                            str7.put("cabinet",cab7.getText().toString());
                            str7.put("time", time7.getText().toString());
                            ContentValues str8 = new ContentValues();
                            str8.put("lesson", less8.getText().toString());
                            str8.put("cabinet", cab8.getText().toString());
                            str8.put("time", time8.getText().toString());
                            ContentValues str9 = new ContentValues();
                            str9.put("lesson", course1.getText().toString());
                            str9.put("cabinet", cabC1.getText().toString());
                            str9.put("time", timeC1.getText().toString());
                            ContentValues str10 = new ContentValues();
                            str10.put("lesson", course2.getText().toString());
                            str10.put("cabinet", cabC2.getText().toString());
                            str10.put("time", timeC2.getText().toString());
                            ContentValues str11 = new ContentValues();
                            str11.put("lesson", course3.getText().toString());
                            str11.put("cabinet", cabC3.getText().toString());
                            str11.put("time", timeC3.getText().toString());
                            ContentValues str12 = new ContentValues();
                            str12.put("lesson", notes.getText().toString());
                            str12.put("cabinet", "");
                            str12.put("time", "");

                            if (tv_day.getText().toString().equals("ПОНЕДЕЛЬНИК")){
                                mybase.update("use",str1,"day = ?",new String[]{"mo1"});
                                mybase.update("use",str2,"day = ?",new String[]{"mo2"});
                                mybase.update("use",str3,"day = ?",new String[]{"mo3"});
                                mybase.update("use",str4,"day = ?",new String[]{"mo4"});
                                mybase.update("use",str5,"day = ?",new String[]{"mo5"});
                                mybase.update("use",str6,"day = ?",new String[]{"mo6"});
                                mybase.update("use",str7,"day = ?",new String[]{"mo7"});
                                mybase.update("use",str8,"day = ?",new String[]{"mo8"});
                                mybase.update("use",str9,"day = ?",new String[]{"mo9"});
                                mybase.update("use",str10,"day = ?",new String[]{"mo0"});
                                mybase.update("use",str11,"day = ?",new String[]{"mo_"});
                                mybase.update("use",str12,"day = ?",new String[]{"mon"});
                                mybase.close();
                                Intent i = new Intent(EditDayWeek.this, Monday.class);
                                startActivity(i);
                                mybase.close();
                                finish();
                            }
                            if (tv_day.getText().toString().equals("ВТОРНИК")){
                                mybase.update("use",str1,"day = ?",new String[]{"tu1"});
                                mybase.update("use",str2,"day = ?",new String[]{"tu2"});
                                mybase.update("use",str3,"day = ?",new String[]{"tu3"});
                                mybase.update("use",str4,"day = ?",new String[]{"tu4"});
                                mybase.update("use",str5,"day = ?",new String[]{"tu5"});
                                mybase.update("use",str6,"day = ?",new String[]{"tu6"});
                                mybase.update("use",str7,"day = ?",new String[]{"tu7"});
                                mybase.update("use",str8,"day = ?",new String[]{"tu8"});
                                mybase.update("use",str9,"day = ?",new String[]{"tu9"});
                                mybase.update("use",str10,"day = ?",new String[]{"tu0"});
                                mybase.update("use",str11,"day = ?",new String[]{"tu_"});
                                mybase.update("use",str12,"day = ?",new String[]{"tun"});
                                mybase.close();
                                Intent i = new Intent(EditDayWeek.this, Tuesday.class);
                                startActivity(i);
                                mybase.close();
                                finish();
                            }
                            if (tv_day.getText().toString().equals("СРЕДА")){
                                mybase.update("use",str1,"day = ?",new String[]{"we1"});
                                mybase.update("use",str2,"day = ?",new String[]{"we2"});
                                mybase.update("use",str3,"day = ?",new String[]{"we3"});
                                mybase.update("use",str4,"day = ?",new String[]{"we4"});
                                mybase.update("use",str5,"day = ?",new String[]{"we5"});
                                mybase.update("use",str6,"day = ?",new String[]{"we6"});
                                mybase.update("use",str7,"day = ?",new String[]{"we7"});
                                mybase.update("use",str8,"day = ?",new String[]{"we8"});
                                mybase.update("use",str9,"day = ?",new String[]{"we9"});
                                mybase.update("use",str10,"day = ?",new String[]{"we0"});
                                mybase.update("use",str11,"day = ?",new String[]{"we_"});
                                mybase.update("use",str12,"day = ?",new String[]{"wen"});
                                mybase.close();
                                Intent i = new Intent(EditDayWeek.this, Wednesday.class);
                                startActivity(i);
                                mybase.close();
                                finish();
                            }
                            if (tv_day.getText().toString().equals("ЧЕТВЕРГ")){
                                mybase.update("use",str1,"day = ?",new String[]{"th1"});
                                mybase.update("use",str2,"day = ?",new String[]{"th2"});
                                mybase.update("use",str3,"day = ?",new String[]{"th3"});
                                mybase.update("use",str4,"day = ?",new String[]{"th4"});
                                mybase.update("use",str5,"day = ?",new String[]{"th5"});
                                mybase.update("use",str6,"day = ?",new String[]{"th6"});
                                mybase.update("use",str7,"day = ?",new String[]{"th7"});
                                mybase.update("use",str8,"day = ?",new String[]{"th8"});
                                mybase.update("use",str9,"day = ?",new String[]{"th9"});
                                mybase.update("use",str10,"day = ?",new String[]{"th0"});
                                mybase.update("use",str11,"day = ?",new String[]{"th_"});
                                mybase.update("use",str12,"day = ?",new String[]{"thn"});
                                mybase.close();
                                Intent i = new Intent(EditDayWeek.this, Thursday.class);
                                startActivity(i);
                                mybase.close();
                                finish();
                            }
                            if (tv_day.getText().toString().equals("ПЯТНИЦА")){
                                mybase.update("use",str1,"day = ?",new String[]{"fr1"});
                                mybase.update("use",str2,"day = ?",new String[]{"fr2"});
                                mybase.update("use",str3,"day = ?",new String[]{"fr3"});
                                mybase.update("use",str4,"day = ?",new String[]{"fr4"});
                                mybase.update("use",str5,"day = ?",new String[]{"fr5"});
                                mybase.update("use",str6,"day = ?",new String[]{"fr6"});
                                mybase.update("use",str7,"day = ?",new String[]{"fr7"});
                                mybase.update("use",str8,"day = ?",new String[]{"fr8"});
                                mybase.update("use",str9,"day = ?",new String[]{"fr9"});
                                mybase.update("use",str10,"day = ?",new String[]{"fr0"});
                                mybase.update("use",str11,"day = ?",new String[]{"fr_"});
                                mybase.update("use",str12,"day = ?",new String[]{"frn"});
                                mybase.close();
                                Intent i = new Intent(EditDayWeek.this, Friday.class);
                                startActivity(i);
                                mybase.close();
                                finish();
                            }
                            if (tv_day.getText().toString().equals("СУББОТА")){
                                mybase.update("use",str1,"day = ?",new String[]{"sa1"});
                                mybase.update("use",str2,"day = ?",new String[]{"sa2"});
                                mybase.update("use",str3,"day = ?",new String[]{"sa3"});
                                mybase.update("use",str4,"day = ?",new String[]{"sa4"});
                                mybase.update("use",str5,"day = ?",new String[]{"sa5"});
                                mybase.update("use",str6,"day = ?",new String[]{"sa6"});
                                mybase.update("use",str7,"day = ?",new String[]{"sa7"});
                                mybase.update("use",str8,"day = ?",new String[]{"sa8"});
                                mybase.update("use",str9,"day = ?",new String[]{"sa9"});
                                mybase.update("use",str10,"day = ?",new String[]{"sa0"});
                                mybase.update("use",str11,"day = ?",new String[]{"sa_"});
                                mybase.update("use",str12,"day = ?",new String[]{"san"});
                                mybase.close();
                                Intent i = new Intent(EditDayWeek.this, Saturday.class);
                                startActivity(i);
                                mybase.close();
                                finish();
                            }
                            if (tv_day.getText().toString().equals("ВОСКРЕСЕНЬЕ")){
                                mybase.update("use",str1,"day = ?",new String[]{"su1"});
                                mybase.update("use",str2,"day = ?",new String[]{"su2"});
                                mybase.update("use",str3,"day = ?",new String[]{"su3"});
                                mybase.update("use",str4,"day = ?",new String[]{"su4"});
                                mybase.update("use",str5,"day = ?",new String[]{"su5"});
                                mybase.update("use",str6,"day = ?",new String[]{"su6"});
                                mybase.update("use",str7,"day = ?",new String[]{"su7"});
                                mybase.update("use",str8,"day = ?",new String[]{"su8"});
                                mybase.update("use",str9,"day = ?",new String[]{"su9"});
                                mybase.update("use",str10,"day = ?",new String[]{"su0"});
                                mybase.update("use",str11,"day = ?",new String[]{"su_"});
                                mybase.update("use",str12,"day = ?",new String[]{"sun"});
                                mybase.close();
                                Intent i = new Intent(EditDayWeek.this, Sunday.class);
                                startActivity(i);
                                mybase.close();
                                finish();
                            }
                        }catch (Exception e){
                            Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_SHORT);
                        }
                        break;
                }
            }
        };
        done.setOnClickListener(listener);
    }
}
