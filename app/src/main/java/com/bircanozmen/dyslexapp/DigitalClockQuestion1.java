package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DigitalClockQuestion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_clock_question1);
    }
    public void a (View view){
        Intent intent = new Intent(DigitalClockQuestion1.this,TrueAnswer1.class);
        startActivity(intent);

    }
    public void b (View view){
        Intent intent = new Intent(DigitalClockQuestion1.this,FalseAnswer1.class);
        startActivity(intent);

    }
}