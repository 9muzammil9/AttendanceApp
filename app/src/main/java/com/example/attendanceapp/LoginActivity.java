package com.example.attendanceapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (ContextCompat.checkSelfPermission(
                this, Manifest.permission.CAMERA) ==
                PackageManager.PERMISSION_GRANTED) {
        } else {
            // You can directly ask for the permission.
            requestPermissions(new String[] { Manifest.permission.CAMERA },
                    0);
        }
        if (ContextCompat.checkSelfPermission(
                this, Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED) {
        } else {
            // You can directly ask for the permission.
            requestPermissions(new String[] { Manifest.permission.ACCESS_FINE_LOCATION },
                    0);
        }
//        getLocation();
    }

//    public void getLocation(){
//        GpsTracker gpsTracker = new GpsTracker(LoginActivity.this);
//        if(gpsTracker.canGetLocation()){
//            double latitude = gpsTracker.getLatitude();
//            double longitude = gpsTracker.getLongitude();
//            String tvLatitude = String.valueOf(latitude);
//            String tvLongitude = String.valueOf(longitude);
////            Toast.makeText(this,tvLatitude, Toast.LENGTH_LONG).show();
////            Toast.makeText(this,tvLongitude, Toast.LENGTH_LONG).show();
//        }else{
//            gpsTracker.showSettingsAlert();
//        }
//    }

    public void login(View View) {
        startActivity(new Intent(LoginActivity.this, CheckInCheckOut.class));
        finish();
    }

    public void signup(View View) {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
        finish();
    }

}