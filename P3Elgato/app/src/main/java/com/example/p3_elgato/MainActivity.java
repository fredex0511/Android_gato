package com.example.p3_elgato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int turno = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView ganadas1 = (TextView) findViewById(R.id.ganadas1);
        TextView ganadas2 = (TextView) findViewById(R.id.ganadas2);
        TextView btn1 = (TextView) findViewById(R.id.btn1);
        TextView btn2 = (TextView) findViewById(R.id.btn2);
        TextView btn3 = (TextView) findViewById(R.id.btn3);
        TextView btn4 = (TextView) findViewById(R.id.btn4);
        TextView btn5 = (TextView) findViewById(R.id.btn5);
        TextView btn6 = (TextView) findViewById(R.id.btn6);
        TextView btn7 = (TextView) findViewById(R.id.btn7);
        TextView btn8 = (TextView) findViewById(R.id.btn8);
        TextView btn9 = (TextView) findViewById(R.id.btn9);
        TextView ganadorg = (TextView) findViewById(R.id.ganadorg);

        View.OnClickListener asignarsigno = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView botonpresionado = (TextView) v;
                if (turno == 0){
                    botonpresionado.setText("X");
                    turno = 1;
                } else {
                    botonpresionado.setText("0");
                    turno = 0;
                }
            }
        };

        btn1.setOnClickListener(asignarsigno);
        btn2.setOnClickListener(asignarsigno);
        btn3.setOnClickListener(asignarsigno);
        btn4.setOnClickListener(asignarsigno);
        btn5.setOnClickListener(asignarsigno);
        btn6.setOnClickListener(asignarsigno);
        btn7.setOnClickListener(asignarsigno);
        btn8.setOnClickListener(asignarsigno);
        btn9.setOnClickListener(asignarsigno);
    }
}

