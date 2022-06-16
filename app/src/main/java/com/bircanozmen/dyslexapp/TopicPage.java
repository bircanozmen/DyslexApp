package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopicPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_page);
    }
    public void clock (View view){
        Intent intent = new Intent(TopicPage.this,ClockQuestion1.class);
        startActivity(intent);
    }
    public void seaons (View view){
        Intent intent = new Intent(TopicPage.this,SeasonInfo1.class);
        startActivity(intent);
    }
    public void days (View view){
        Intent intent = new Intent(TopicPage.this,DaysInfo1.class);
        startActivity(intent);
    }
    public void months (View view){
        Intent intent = new Intent(TopicPage.this,MonthsInfo1.class);
        startActivity(intent);
    }
    public void numbers (View view){
        Intent intent = new Intent(TopicPage.this,LookAtNumber1.class);
        startActivity(intent);
    }
    public void words (View view){
        Intent intent = new Intent(TopicPage.this,SpellingQuestion1.class);
        startActivity(intent);
    }
    public void directions (View view){
        Intent intent = new Intent(TopicPage.this,DirectionsInfo1.class);
        startActivity(intent);
    }
    public void multiplication (View view){
        Intent intent = new Intent(TopicPage.this,MultiplicationInfo1.class);
        startActivity(intent);
    }
    public void images (View view){
        Intent intent = new Intent(TopicPage.this,ImageQuestion1.class);
        startActivity(intent);
    }
    public void back (View view){
        Intent intent = new Intent(TopicPage.this,Welcome_Page.class);
        startActivity(intent);
    }
}