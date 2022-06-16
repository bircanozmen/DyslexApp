package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaysInfo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_info1);
    }
    public void submit (View view){
        Intent intent = new Intent(DaysInfo1.this,DaysQuestion1.class);
        startActivity(intent);

    }

}