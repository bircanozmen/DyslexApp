package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrueAnswer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_answer1);
    }
    public void otherquestions (View view){
        Intent intent = new Intent(TrueAnswer1.this,TopicPage.class);
        startActivity(intent);
    }
}