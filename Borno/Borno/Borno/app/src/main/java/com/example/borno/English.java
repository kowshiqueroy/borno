package com.example.borno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);


        Button a=(Button) findViewById(R.id.buttona);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(English.this,Alphabets.class);
                startActivity(intent);
            }
        });

        Button n=(Button) findViewById(R.id.buttonn);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(English.this,Number.class);
                startActivity(intent);
            }
        });





    }
}