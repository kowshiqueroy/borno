package com.example.borno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class S extends AppCompatActivity {
Button S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

        final MediaPlayer vs1= MediaPlayer.create(this, R.raw.va1);
        final MediaPlayer vs2= MediaPlayer.create(this, R.raw.va2);
        final MediaPlayer vs3= MediaPlayer.create(this, R.raw.va3);
        final MediaPlayer vs4= MediaPlayer.create(this, R.raw.va4);
        final MediaPlayer vs5= MediaPlayer.create(this, R.raw.va5);
        final MediaPlayer vs6= MediaPlayer.create(this, R.raw.va6);
        final MediaPlayer vs7= MediaPlayer.create(this, R.raw.va7);
        final MediaPlayer vs8= MediaPlayer.create(this, R.raw.va8);
        final MediaPlayer vs9= MediaPlayer.create(this, R.raw.va9);
        final MediaPlayer vs10= MediaPlayer.create(this, R.raw.va10);
        final MediaPlayer vs11= MediaPlayer.create(this, R.raw.va11);


        S1=(Button)findViewById(R.id.S1);
        S1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vs1.start();


            }
        });

        S2=(Button)findViewById(R.id.S2);
        S2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs2.start();
            }
        });

        S3=(Button)findViewById(R.id.S3);
        S3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs3.start();
            }
        });

        S4=(Button)findViewById(R.id.S4);
        S4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs4.start();
            }
        });

        S5=(Button)findViewById(R.id.S5);
        S5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs5.start();
            }
        });

        S6=(Button)findViewById(R.id.S6);
        S6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs6.start();
            }
        });

        S7=(Button)findViewById(R.id.S7);
        S7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs7.start();
            }
        });

        S8=(Button)findViewById(R.id.S8);
        S8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs8.start();
            }
        });

        S9=(Button)findViewById(R.id.S9);
        S9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs9.start();
            }
        });

        S10=(Button)findViewById(R.id.S10);
        S10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs10.start();
            }
        });

        S11=(Button)findViewById(R.id.S11);
        S11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs11.start();
            }
        });










    }
}