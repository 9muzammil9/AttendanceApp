package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View View) {
        startActivity(new Intent(LoginActivity.this, CheckInCheckOut.class));
        finish();
    }

    public void signup(View View) {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
        finish();
    }

}