package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MonthsQuestion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months_question1);
    }
    public void a (View view){
        Intent intent = new Intent(MonthsQuestion1.this,FalseAnswer1.class);
        startActivity(intent);

    }
    public void b (View view){
        Intent intent = new Intent(MonthsQuestion1.this,TrueAnswer1.class);
        startActivity(intent);

    }
}