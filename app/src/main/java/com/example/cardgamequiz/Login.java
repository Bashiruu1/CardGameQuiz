package com.example.cardgamequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText email, password;
    Button login;
    Person person;
    String realPasswrod, realEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email_address);
        password = findViewById(R.id.password);
        realPasswrod = password.getText().toString();
        login = findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realEmail = email.getText().toString();
                realPasswrod = password.getText().toString();
                if (realEmail != "johndoe@gmail.com" && realPasswrod != "password") {
                    startActivity(new Intent(Login.this, QuizRules.class));
                    startActivity(new Intent(Login.this, QuizRules.class));
                } else {
                    Toast.makeText(Login.this, "Please enter johndoe@gmail.com for email and password for password", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
