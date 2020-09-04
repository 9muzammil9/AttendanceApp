package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CheckInCheckOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in_check_out);
    }

    public void checkInCheckOut(View View) {
        startActivity(new Intent(CheckInCheckOut.this, Scan.class));
    }

    public void attendance(View View) {
        startActivity(new Intent(CheckInCheckOut.this, Attendance.class));
    }

}