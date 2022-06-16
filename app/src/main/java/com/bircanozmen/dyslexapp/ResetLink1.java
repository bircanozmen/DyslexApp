package com.bircanozmen.dyslexapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ResetLink1 extends AppCompatActivity {

    EditText mail;
    FirebaseAuth mAuth;
  //  ProgressBar progressBar;
    TextView resetbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_link1);
        mAuth = FirebaseAuth.getInstance();
        mail = (EditText) findViewById(R.id.mail);
        resetbutton = (TextView) findViewById(R.id.resetbutton);

        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
    }
        public void reset (){
 String email= mail.getText().toString().trim();

 if(email.isEmpty()){
     mail.setError("e-mail is required!");
     mail.requestFocus();
     return;
 }
if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
    mail.setError("Please enter the valid e mail!");
    mail.requestFocus();
    return;
}
//progressBar.setVisibility(View.VISIBLE);
mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
    @Override
    public void onComplete(@NonNull Task<Void> task) {
        if(task.isSuccessful()){
            Toast.makeText(ResetLink1.this, "Check your email to reset your password!", Toast.LENGTH_SHORT).show();
            mail.getText().clear();
            Intent intent = new Intent(ResetLink1.this,NewPasswordPage.class);
            startActivity(intent);
        } else{
            Toast.makeText(ResetLink1.this, "Try again! Somethig went wrong!", Toast.LENGTH_SHORT).show();}
    }

});
    }
}