package com.example.borno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class So extends AppCompatActivity {
    Button So1, So2, So3, So4, So5, So6, So7, So8, So9, So0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so);

        final MediaPlayer vc0= MediaPlayer.create(this, R.raw.vc0);
        final MediaPlayer vc1= MediaPlayer.create(this, R.raw.vc1);
        final MediaPlayer vc2= MediaPlayer.create(this, R.raw.vc2);
        final MediaPlayer vc3= MediaPlayer.create(this, R.raw.vc3);
        final MediaPlayer vc4= MediaPlayer.create(this, R.raw.vc4);
        final MediaPlayer vc5= MediaPlayer.create(this, R.raw.vc5);
        final MediaPlayer vc6= MediaPlayer.create(this, R.raw.vc6);
        final MediaPlayer vc7= MediaPlayer.create(this, R.raw.vc7);
        final MediaPlayer vc8= MediaPlayer.create(this, R.raw.vc8);
        final MediaPlayer vc9= MediaPlayer.create(this, R.raw.vc9);



        So1=(Button)findViewById(R.id.So1);
        So1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc1.start();
            }
        });
        So2=(Button)findViewById(R.id.So2);
        So2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc2.start();
            }
        });

        So3=(Button)findViewById(R.id.So3);
        So3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc3.start();
            }
        });

        So4=(Button)findViewById(R.id.So4);
        So4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc4.start();
            }
        });

        So5=(Button)findViewById(R.id.So5);
        So5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc5.start();
            }
        });

        So6=(Button)findViewById(R.id.So6);
        So6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc6.start();
            }
        });

        So7=(Button)findViewById(R.id.So7);
        So7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc7.start();
            }
        });

        So8=(Button)findViewById(R.id.So8);
        So8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc8.start();
            }
        });

        So9=(Button)findViewById(R.id.So9);
        So9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc9.start();
            }
        });

        So0=(Button)findViewById(R.id.So0);
        So0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vc0.start();
            }
        });


    }
}