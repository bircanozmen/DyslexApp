package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LookAtNumber1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_at_number1);
    }
    public void gonumber (View view){
        Intent intent = new Intent(LookAtNumber1.this,NumberQuestion1.class);
        startActivity(intent);

    }
    public void gobackward (View view){
        Intent intent = new Intent(LookAtNumber1.this,BackwardNumberQuestion1.class);
        startActivity(intent);

    }
}