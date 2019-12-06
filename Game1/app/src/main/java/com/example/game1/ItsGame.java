package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItsGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_its_game);
    }
    TextView tx = (TextView)findViewById(R.id.textView2);
    TextView ch1 = (TextView)findViewById(R.id.button3);
    TextView ch2 = (TextView)findViewById(R.id.button4);
    TextView ch3 = (TextView)findViewById(R.id.button5);
    Button btn1 = (Button)findViewById(R.id.button3);
    Button btn2 = (Button)findViewById(R.id.button4);
    Button btn3 = (Button)findViewById(R.id.button5);
    TextView score = (TextView)findViewById(R.id.textView6);
    //===game===
    public static int money=0;
    public  static int follows=0;
    public static String position = "Kid";

    public class Story {
        public void begin() {
            tx.setText(R.string.begin);
            tx.setTextColor(Color.RED);
            ch1.setText("");
            ch2.setText("");
            ch3.setText("");
        }

        public void situation1() {
            tx.setText(R.string.situation1);
            ch1.setText(R.string.ch11);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch12);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch13);
            ch3.setTextColor(Color.BLUE);
        }

        public void situation2() {
            tx.setText(R.string.situation2);
            ch1.setText(R.string.ch21);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch22);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch23);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation3() {
            tx.setText(R.string.situation3);
            ch1.setText(R.string.ch31);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch32);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch33);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation4() {
            tx.setText(R.string.situation4);
            ch1.setText(R.string.ch41);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch42);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch43);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation5() {
            tx.setText(R.string.situation1);
            ch1.setText(R.string.ch51);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch52);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch53);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation6() {
            tx.setText(R.string.situation1);
            ch1.setText(R.string.ch61);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch62);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch63);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation7() {
            tx.setText(R.string.situation1);
            ch1.setText(R.string.ch71);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch72);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch73);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation8() {
            tx.setText(R.string.situation1);
            ch1.setText(R.string.ch81);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch82);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch83);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation9() {
            tx.setText(R.string.situation1);
            ch1.setText(R.string.ch91);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch92);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch93);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation10() {
            tx.setText(R.string.situation1);
            ch1.setText(R.string.ch101);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch102);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch103);
            ch3.setTextColor(Color.BLUE);
        }
        public void situation11() {
            tx.setText(R.string.situation1);
            ch1.setText(R.string.ch111);
            ch1.setTextColor(Color.BLUE);
            ch2.setText(R.string.ch112);
            ch2.setTextColor(Color.BLUE);
            ch3.setText(R.string.ch113);
            ch3.setTextColor(Color.BLUE);
        }
        public void score() {
            score.setText("["+position + ", " + money + ", " + follows+"]");
            score.setTextColor(Color.DKGRAY);
        }
    }
    class Main {
        public void naClick1() {
            Story story = new Story();
            story.begin();
            story.score();
        }
    }
}
