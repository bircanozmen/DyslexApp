package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FalseAnswer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_false_answer1);
    }
    public void tryagain (View view){
        Intent intent = new Intent(FalseAnswer1.this,TopicPage.class);
        startActivity(intent);
    }
}