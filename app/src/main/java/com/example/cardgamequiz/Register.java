package com.example.cardgamequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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

        person = new Person(firstName, lastName, dateOfBirth, emailAddress, password);
    }
}
