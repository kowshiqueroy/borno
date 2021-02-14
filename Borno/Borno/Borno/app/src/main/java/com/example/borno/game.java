package com.example.borno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class game extends AppCompatActivity {
Button op1,op2,op3,op4,op5,op6,op7,op8,op9,op10,op11,op12,op13,op14,op15,op16,op17,op18,op19,op20,op21,op22,op23,op24,op25,op26;

   TextView textView;
   TextView result;

   int count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        textView=(TextView) findViewById(R.id.t);
        result=(TextView) findViewById(R.id.result);



        op1=(Button)findViewById(R.id.op1);
        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==1) {

                    textView.setText("B");
                    count++;

                    result.setText("Right");


                }
                else {

                    result.setText("Worng");

                }


            }
        });

        op2=(Button)findViewById(R.id.op2);
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==2) {

                    textView.setText("C");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op3=(Button)findViewById(R.id.op3);
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==3) {

                    textView.setText("D");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op4=(Button)findViewById(R.id.op4);
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==4) {

                    textView.setText("E");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op5=(Button)findViewById(R.id.op5);
        op5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==5) {

                    textView.setText("F");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op6=(Button)findViewById(R.id.op6);
        op6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==6) {

                    textView.setText("G");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op7=(Button)findViewById(R.id.op7);
        op7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==7) {

                    textView.setText("H");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });



        op8=(Button)findViewById(R.id.op8);
        op8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==8) {

                    textView.setText("I");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op9=(Button)findViewById(R.id.op9);
        op9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==9) {

                    textView.setText("J");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op10=(Button)findViewById(R.id.op10);
        op10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==10) {

                    textView.setText("K");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op11=(Button)findViewById(R.id.op11);
        op11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==11) {

                    textView.setText("L");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op12=(Button)findViewById(R.id.op12);
        op12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==12) {

                    textView.setText("M");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op13=(Button)findViewById(R.id.op13);
        op13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==13) {

                    textView.setText("N");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op14=(Button)findViewById(R.id.op14);
        op14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==14) {

                    textView.setText("O");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op15=(Button)findViewById(R.id.op15);
        op15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==15) {

                    textView.setText("P");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op16=(Button)findViewById(R.id.op16);
        op16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==16) {

                    textView.setText("Q");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op17=(Button)findViewById(R.id.op17);
        op17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==17) {

                    textView.setText("R");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op18=(Button)findViewById(R.id.op18);
        op18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==18) {

                    textView.setText("S");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op19=(Button)findViewById(R.id.op19);
        op19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==19) {

                    textView.setText("T");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op20=(Button)findViewById(R.id.op20);
        op20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==20) {

                    textView.setText("U");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op21=(Button)findViewById(R.id.op21);
        op21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==21) {

                    textView.setText("V");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op22=(Button)findViewById(R.id.op22);
        op22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==22) {

                    textView.setText("W");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op23=(Button)findViewById(R.id.op23);
        op23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==23) {

                    textView.setText("X");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op24=(Button)findViewById(R.id.op24);
        op24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==24) {

                    textView.setText("Y");
                    count++;

                    result.setText("Right");
                }
                else {

                    result.setText("Worng");

                }

            }
        });

        op25=(Button)findViewById(R.id.op25);
        op25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==25) {

                    textView.setText("Z");
                    count++;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });


        op26=(Button)findViewById(R.id.op26);
        op26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==26) {

                    textView.setText("A");
                    count=1;
                    result.setText("Right");

                }
                else {

                    result.setText("Worng");

                }

            }
        });



    }
}