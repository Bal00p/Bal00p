package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DZ extends AppCompatActivity {
    TextView tomorrow, less1, less2, less3, less4, less5, less6, less7, less8, dz_less1, dz_less2, dz_less3, dz_less4, dz_less5, dz_less6, dz_less7, dz_less8;
    EditText edit_dz;
    Spinner lessons;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz);

        tomorrow = (TextView)findViewById(R.id.textDay);
        less1 = (TextView)findViewById(R.id.less1);
        less2 = (TextView)findViewById(R.id.less2);
        less3 = (TextView)findViewById(R.id.less3);
        less4 = (TextView)findViewById(R.id.less4);
        less5 = (TextView)findViewById(R.id.less5);
        less6 = (TextView)findViewById(R.id.less6);
        less7 = (TextView)findViewById(R.id.less7);
        less8 = (TextView)findViewById(R.id.less8);
        dz_less1 = (TextView)findViewById(R.id.dz_less1);
        dz_less2 = (TextView)findViewById(R.id.dz_less2);
        dz_less3 = (TextView)findViewById(R.id.dz_less3);
        dz_less4 = (TextView)findViewById(R.id.dz_less4);
        dz_less5 = (TextView)findViewById(R.id.dz_less5);
        dz_less6 = (TextView)findViewById(R.id.dz_less6);
        dz_less7 = (TextView)findViewById(R.id.dz_less7);
        dz_less8 = (TextView)findViewById(R.id.dz_less8);
        edit_dz = (EditText)findViewById(R.id.editDZ);
        lessons = (Spinner)findViewById(R.id.spinner);
        done = (Button)findViewById(R.id.button);

        Calendar date = new GregorianCalendar();
        date.add(Calendar.DAY_OF_WEEK,1);
        char[] arr = date.getTime().toString().toCharArray();
        String tomorrowDay = null;
        String today = null;
        if (arr[0]=='M'){
            tomorrowDay = "mon";
            today = "sun";
        }
        if (arr[0]=='T' && arr[1]=='u'){
            tomorrowDay = "tue";
            today = "mon";
        }
        if (arr[0]=='W'){
            tomorrowDay = "wed";
            today = "tue";
        }
        if (arr[0]=='T' && arr[1]=='h'){
            tomorrowDay = "thu";
            today = "wed";
        }
        if (arr[0]=='F'){
            tomorrowDay = "fri";
            today = "thu";
        }
        if (arr[0]=='S' && arr[1]=='a'){
            tomorrowDay = "sat";
            today = "fri";
        }
        if (arr[0]=='S' && arr[1]=='u'){
            tomorrowDay = "sun";
            today = "sat";
        }

        final SQLiteDatabase dzbase = openOrCreateDatabase("dzcache",MODE_PRIVATE,null);
        dzbase.execSQL("CREATE TABLE IF NOT EXISTS dzweek(num VARCHAR(30), less VARCHAR(20), dz VARCHAR(100), day VARCHAR(20), date INT)");
        final Cursor cursor = dzbase.rawQuery("select num, less, dz, day, date from dzweek",null);

        ContentValues row1 = new ContentValues();
        ContentValues row2 = new ContentValues();
        ContentValues row3 = new ContentValues();
        ContentValues row4 = new ContentValues();
        ContentValues row5 = new ContentValues();
        ContentValues row6 = new ContentValues();
        ContentValues row7 = new ContentValues();
        ContentValues row8 = new ContentValues();
        ContentValues row9 = new ContentValues();
        ContentValues row10 = new ContentValues();
        ContentValues row11 = new ContentValues();
        ContentValues row12 = new ContentValues();
        ContentValues row13 = new ContentValues();
        ContentValues row14 = new ContentValues();
        ContentValues row15 = new ContentValues();
        ContentValues row16 = new ContentValues();
        ContentValues row17 = new ContentValues();

        if (cursor.moveToNext()){

        }else{
            row1.put("num",1);
            row2.put("num",2);
            row3.put("num",3);
            row4.put("num",4);
            row5.put("num",5);
            row6.put("num",6);
            row7.put("num",7);
            row8.put("num",8);
            row9.put("num",9);
            row10.put("num",10);
            row11.put("num",11);
            row12.put("num",12);
            row13.put("num",13);
            row14.put("num",14);
            row15.put("num",15);
            row16.put("num",16);
            row17.put("num",17);

            row1.put("less","");
            row2.put("less","");
            row3.put("less","");
            row4.put("less","");
            row5.put("less","");
            row6.put("less","");
            row7.put("less","");
            row8.put("less","");
            row9.put("less","");
            row10.put("less","");
            row11.put("less","");
            row12.put("less","");
            row13.put("less","");
            row14.put("less","");
            row15.put("less","");
            row16.put("less","");
            row17.put("less","");

            row1.put("dz","");
            row2.put("dz","");
            row3.put("dz","");
            row4.put("dz","");
            row5.put("dz","");
            row6.put("dz","");
            row7.put("dz","");
            row8.put("dz","");
            row9.put("dz","");
            row10.put("dz","");
            row11.put("dz","");
            row12.put("dz","");
            row13.put("dz","");
            row14.put("dz","");
            row15.put("dz","");
            row16.put("dz","");
            row17.put("dz","");

            row1.put("day","");
            row2.put("day","");
            row3.put("day","");
            row4.put("day","");
            row5.put("day","");
            row6.put("day","");
            row7.put("day","");
            row8.put("day","");
            row9.put("day","");
            row10.put("day","");
            row11.put("day","");
            row12.put("day","");
            row13.put("day","");
            row14.put("day","");
            row15.put("day","");
            row16.put("day","");
            row17.put("day","");

            row1.put("date", 0);
            row2.put("date", 0);
            row3.put("date", 0);
            row4.put("date", 0);
            row5.put("date", 0);
            row6.put("date", 0);
            row7.put("date", 0);
            row8.put("date", 0);
            row9.put("date", 0);
            row10.put("date", 0);
            row11.put("date", 0);
            row12.put("date", 0);
            row13.put("date", 0);
            row14.put("date", 0);
            row15.put("date", 0);
            row16.put("date", 0);
            row17.put("date", 0);

            dzbase.insert("dzweek", null, row1);
            dzbase.insert("dzweek", null, row2);
            dzbase.insert("dzweek", null, row3);
            dzbase.insert("dzweek", null, row4);
            dzbase.insert("dzweek", null, row5);
            dzbase.insert("dzweek", null, row6);
            dzbase.insert("dzweek", null, row7);
            dzbase.insert("dzweek", null, row8);
            dzbase.insert("dzweek", null, row9);
            dzbase.insert("dzweek", null, row10);
            dzbase.insert("dzweek", null, row11);
            dzbase.insert("dzweek", null, row12);
            dzbase.insert("dzweek", null, row13);
            dzbase.insert("dzweek", null, row14);
            dzbase.insert("dzweek", null, row15);
            dzbase.insert("dzweek", null, row16);
            dzbase.insert("dzweek", null, row17);
        }

        SQLiteDatabase mybase = openOrCreateDatabase("cache.txt",MODE_PRIVATE,null);
        mybase.execSQL("CREATE TABLE IF NOT EXISTS use(day VARCHAR(5), lesson VARCHAR(20), cabinet VARCHAR(10), time VARCHAR(15))");
        final Cursor cursor2 = mybase.rawQuery("select day, lesson, cabinet, time from use", null);
        while (cursor2.moveToNext()) {
            String day = cursor2.getString(0);
            String less = cursor2.getString(1);
            char[] arr2 = day.toCharArray();
            if (arr[0]==arr2[0] && arr[1]==arr2[1]){
                if (arr2[2]=='1'){
                    row1.put("less",less);
                    less1.setText(less);
                }
                if (arr2[2]=='2'){
                    row2.put("less",less);
                    less2.setText(less);
                }
                if (arr2[2]=='3'){
                    row3.put("less",less);
                    less3.setText(less);
                }
                if (arr2[2]=='4'){
                    row4.put("less",less);
                    less4.setText(less);
                }
                if (arr2[2]=='5'){
                    row5.put("less",less);
                    less5.setText(less);
                }
                if (arr2[2]=='6'){
                    row6.put("less",less);
                    less6.setText(less);
                }
                if (arr2[2]=='7'){
                    row7.put("less",less);
                    less7.setText(less);
                }
                if (arr2[2]=='8'){
                    row8.put("less",less);
                    less8.setText(less);
                }
            }
        }
        while (cursor.moveToNext()){
            String day = cursor.getString(3);
            String dz = cursor.getString(2);
            String less = cursor.getString(1);
            if (day.equals(tomorrowDay)){
                if (less.equals(less1.getText().toString())){
                    dz_less1.setText(dz);
                }
                if (less.equals(less2.getText().toString())){
                    dz_less2.setText(dz);
                }
                if (less.equals(less3.getText().toString())){
                    dz_less3.setText(dz);
                }
                if (less.equals(less3.getText().toString())){
                    dz_less3.setText(dz);
                }
                if (less.equals(less4.getText().toString())){
                    dz_less4.setText(dz);
                }
                if (less.equals(less5.getText().toString())){
                    dz_less5.setText(dz);
                }
                if (less.equals(less6.getText().toString())){
                    dz_less6.setText(dz);
                }
                if (less.equals(less7.getText().toString())){
                    dz_less7.setText(dz);
                }
                if (less.equals(less8.getText().toString())){
                    dz_less8.setText(dz);
                }
            }
        }
        //заполнил массив уникальных названий уроков
        final String[] arr_less = new String[17];
        int count = 0;
        while (cursor2.moveToNext()){
            String less = cursor2.getString(1);
            boolean b = true;
            for (String x:arr_less){
                if (less.equals(x)){
                    b = false;
                }
            }
            if (b){
                arr_less[count] = less;
                count++;
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr_less);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lessons.setAdapter(adapter);
        lessons.setPrompt("Выберите урок");

        final String finalTomorrowDay = tomorrowDay;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button:
                        String selecting = lessons.getSelectedItem().toString();

                        //создам базу со списком всех предметов, потом будут ставить в строку предмета его день недели задания и по этому дню буду находить дз на завтра
                        final String[] choose = new String[1];
                        lessons.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                choose[0] = arr_less[position];
                            }
                            public void onNothingSelected(AdapterView<?> arg0){}
                        });

                        boolean b2 = false;
                        int h = 7;
                        Calendar data2 = new GregorianCalendar();
                        while (cursor2.moveToNext()){
                            String less = cursor2.getString(1);
                            String day = cursor2.getString(0);
                            if (day.equals(finalTomorrowDay)){
                                b2 = true;
                            }
                            if (b2){
                                if (choose[0].equals(less)){
                                    data2.add(Calendar.DAY_OF_WEEK,(h/7));
                                    ContentValues row_dz = new ContentValues();
                                    row_dz.put("dz", edit_dz.getText().toString());
                                    dzbase.update("dzcache",row_dz, "less = ? OR day = ?",new String[]{choose[0],data2.toString()});
                                }
                                h++;
                            }
                        }


                }
            }
        };
        done.setOnClickListener(listener);

    }
}
