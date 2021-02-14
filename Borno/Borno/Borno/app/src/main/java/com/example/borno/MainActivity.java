package com.example.borno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;



public class MainActivity extends AppCompatActivity {


    private static int SP_T_O=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable(){

        @Override
            public void run() {

            Intent homeIntent= new Intent(MainActivity.this,home.class);
            startActivity(homeIntent);
            finish();

        }



        },SP_T_O);

    }
}