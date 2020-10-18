package com.example.touchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        textView1 = findViewById(R.id.textView1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int X = (int) event.getX();
        int Y = (int) event.getY();

        int eventAction = event.getAction();
        switch (eventAction) {
            case MotionEvent.ACTION_DOWN:
                textView1.setText("ACTION_DOWN = " + "X: " + X + " Y: " + Y);
                break;
            case MotionEvent.ACTION_MOVE:
                textView1.setText("ACTION_MOVE = " + "X: " + X + " Y: " + Y);
                break;
            case MotionEvent.ACTION_UP:
                textView1.setText("ACTION_UP = " + "X: " + X + " Y: " + Y);
                break;
        }
        return true;
    }

}
