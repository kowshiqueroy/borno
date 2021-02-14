package com.example.borno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bangla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);


        Button s=(Button) findViewById(R.id.buttons);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Bangla.this,S.class);
                startActivity(intent);
            }
        });


        Button b=(Button) findViewById(R.id.buttonb);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Bangla.this,B.class);
                startActivity(intent);
            }
        });


        Button so=(Button) findViewById(R.id.buttonso);
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Bangla.this,So.class);
                startActivity(intent);
            }
        });




    }
}