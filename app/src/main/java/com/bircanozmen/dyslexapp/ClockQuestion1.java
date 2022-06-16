package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClockQuestion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_question1);
    }
    public void analog (View view){
        Intent intent = new Intent(ClockQuestion1.this,AnalogClockQuestion1.class);
        startActivity(intent);

    }
    public void digital (View view2){
        Intent intent = new Intent(ClockQuestion1.this,DigitalClockQuestion1.class);
        startActivity(intent);

    }
}