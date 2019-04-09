package com.example.cardgamequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class Register extends AppCompatActivity {

    String firstName;
    String lastName;
    String emailAddress;
    String dateOfBirth;
    String password;
    Button registerButton;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstName = findViewById(R.id.first_name).toString();
        lastName = findViewById(R.id.last_name).toString();
        emailAddress = findViewById(R.id.email_address).toString();
        dateOfBirth = findViewById(R.id.date_of_birth).toString();
        password = findViewById(R.id.password).toString();
        registerButton = findViewById(R.id.register_button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                    Checks to see if first name has at least three characters, last name with 1. date of birth has to have 8 characters
                    email has to have 1 character, password has to be at least 1 character. if the user fails to meet these requirements then
                    then a toast is sent to make the user enter the require information.
                 */
                if (firstName.length() < 3 || lastName.length() < 1 || dateOfBirth.length() < 8 || emailAddress.length() < 1 || password.length() < 1) {
                    Toast.makeText(getApplicationContext(), "Please enter the required information", Toast.LENGTH_LONG).show();
                } else {
                    startActivity(new Intent(Register.this, Login.class));
                }
            }
        });
    }
}
