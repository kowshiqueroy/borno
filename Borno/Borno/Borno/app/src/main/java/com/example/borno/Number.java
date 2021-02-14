package com.example.borno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class Number extends AppCompatActivity {
Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        final MediaPlayer ve1= MediaPlayer.create(this, R.raw.ve1);
        final MediaPlayer ve2= MediaPlayer.create(this, R.raw.ve2);
        final MediaPlayer ve3= MediaPlayer.create(this, R.raw.ve3);
        final MediaPlayer ve4= MediaPlayer.create(this, R.raw.ve4);
        final MediaPlayer ve5= MediaPlayer.create(this, R.raw.ve5);
        final MediaPlayer ve6= MediaPlayer.create(this, R.raw.ve6);
        final MediaPlayer ve7= MediaPlayer.create(this, R.raw.ve7);
        final MediaPlayer ve8= MediaPlayer.create(this, R.raw.ve8);
        final MediaPlayer ve9= MediaPlayer.create(this, R.raw.ve9);
        final MediaPlayer ve0= MediaPlayer.create(this, R.raw.ve0);


        n0=(Button)findViewById(R.id.n0);
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve0.start();
            }
        });

        n1=(Button)findViewById(R.id.n1);
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve1.start();
            }
        });
        n2=(Button)findViewById(R.id.n2);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve2.start();
            }
        });

        n3=(Button)findViewById(R.id.n3);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve3.start();
            }
        });

        n4=(Button)findViewById(R.id.n4);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve4.start();
            }
        });

        n5=(Button)findViewById(R.id.n5);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve5.start();
            }
        });

        n6=(Button)findViewById(R.id.n6);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve6.start();
            }
        });

        n7=(Button)findViewById(R.id.n7);
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve7.start();
            }
        });

        n8=(Button)findViewById(R.id.n8);
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve8.start();
            }
        });

        n9=(Button)findViewById(R.id.n9);
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve9.start();
            }
        });












    }
}