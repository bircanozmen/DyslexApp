package com.bircanozmen.dyslexapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class NewPasswordPage extends AppCompatActivity {

    EditText mail, password;
    String txtmail,txtpassword;
    FirebaseAuth mAuth;
    FirebaseUser mUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password_page);
        mail =(EditText) findViewById(R.id.mail);
        password = (EditText)findViewById(R.id.password);
        mAuth = FirebaseAuth.getInstance();
    }
    public void login (View view){
        txtmail = mail.getText().toString();
        txtpassword=password.getText().toString();
        if (!TextUtils.isEmpty(txtmail)&& !TextUtils.isEmpty(txtpassword)) {
            mAuth.signInWithEmailAndPassword(txtmail, txtpassword)
                    .addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            mUser = mAuth.getCurrentUser();
                            Intent intent = new Intent(NewPasswordPage.this,Welcome_Page.class);
                            startActivity(intent);

                        }
                    }).addOnFailureListener(this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(NewPasswordPage.this, e.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    });

        }else
            Toast.makeText(NewPasswordPage.this,"e-Mail and Password Can't be Empty!", Toast.LENGTH_SHORT).show();
    }

}