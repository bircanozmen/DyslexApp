package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DirectionsInfo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions_info1);
    }
    public void submit (View view){
        Intent intent = new Intent(DirectionsInfo1.this,DirectionQuestion1.class);
        startActivity(intent);

    }

}