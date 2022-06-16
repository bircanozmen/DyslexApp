package com.bircanozmen.dyslexapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp1 extends AppCompatActivity {

    EditText text2, text3, text4;
    String txtusername, txtmail,txtpassword;
    FirebaseAuth mAuth;
    FirebaseUser mUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up1);
text2=(EditText) findViewById(R.id.text2);
      text3= (EditText) findViewById(R.id.text3);
        text4 = (EditText)findViewById(R.id.text4);
        mAuth = FirebaseAuth.getInstance();
    }
    public void signup (View view){
        txtusername=text2.getText().toString();
        txtmail = text3.getText().toString();
        txtpassword=text4.getText().toString();
        if (!TextUtils.isEmpty(txtmail)&& !TextUtils.isEmpty(txtpassword)&& !TextUtils.isEmpty(txtusername)){
            mAuth.createUserWithEmailAndPassword(txtmail,txtpassword)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                                Toast.makeText(SignUp1.this,"Registration Successful",Toast.LENGTH_SHORT).show();
                            else
                                Toast.makeText(SignUp1.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    });
        }else
            Toast.makeText(this,"e-Mail and Password Can't be Empty!",Toast.LENGTH_SHORT).show();

    }
    public void login(View view){
        Intent intent = new Intent(SignUp1.this,LogInPage.class);
        startActivity(intent);
    }
}