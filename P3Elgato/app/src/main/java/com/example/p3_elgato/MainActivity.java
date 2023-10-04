package com.example.p3_elgato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    char turno = 'X';
    TextView [] botones = new TextView[9];
    int contador1 = 0;
    int contador2 = 0;
     boolean verificarwin(TextView [] botones) {
        for (int i = 0; i < 3; i++) {
            int inicio = i * 3;
            if (botones[inicio].getText().equals(botones[inicio + 1].getText()) &&
                    botones[inicio].getText().equals(botones[inicio + 2].getText()) &&
                    !botones[inicio].getText().toString().isEmpty()) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (botones[i].getText().equals(botones[i + 3].getText()) &&
                    botones[i].getText().equals(botones[i + 6].getText()) &&
                    !botones[i].getText().toString().isEmpty()) {
                return true;
            }
        }

        if (botones[0].getText().equals(botones[4].getText()) &&
                botones[0].getText().equals(botones[8].getText()) &&
                !botones[0].getText().toString().isEmpty()) {
            return true;
        }

        if (botones[2].getText().equals(botones[4].getText()) &&
                botones[2].getText().equals(botones[6].getText()) &&
                !botones[2].getText().toString().isEmpty()) {
            return true;
        }

        return false;
    }

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

        botones[0]=btn1;
        botones[1]=btn1;
        botones[2]=btn1;
        botones[3]=btn1;
        botones[4]=btn1;
        botones[5]=btn1;
        botones[6]=btn1;
        botones[7]=btn1;
        botones[8]=btn1;

        View.OnClickListener asignarsigno = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView botonpresionado = (TextView) v;
                if (turno == 'X'){
                    botonpresionado.setText("X");
                    turno = 'O';
                } else{
                    botonpresionado.setText("0");
                    turno = 'X';
                }
                botonpresionado.setEnabled(false);
                if(verificarwin(botones)){
                    ganadorg.setText(turno + "!!");
                    if(turno == 'X'){
                        ganadorg.setText("O!!");
                        contador2 = contador2 +1;
                        ganadas2.setText(contador2);
                    } else if (turno == 'O') {
                        ganadorg.setText("X!!");
                        contador1 = contador1 +1;
                        ganadas1.setText(contador1);
                    }
                }else{
                    ganadorg.setText("Empate");
                    
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

