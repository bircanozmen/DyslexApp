package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MultiplicationInfo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_info1);
    }
    public void submit  (View view){
        Intent intent = new Intent(MultiplicationInfo1.this,MultiplicationQuestion1.class);
        startActivity(intent);

    }

}