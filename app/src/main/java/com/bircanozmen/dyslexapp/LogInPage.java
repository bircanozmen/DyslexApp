package com.bircanozmen.dyslexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LogInPage extends AppCompatActivity {

    EditText mail, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
    }
        public void login (View view){
            Intent intent = new Intent(LogInPage.this,Welcome_Page.class);
            startActivity(intent);
        mail =(EditText) findViewById(R.id.mailgir);
        password = (EditText)findViewById(R.id.password);
    }
}