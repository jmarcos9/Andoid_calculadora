package com.example.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button soma, sub, div, mult, igual;
    TextView result;

    double armazena = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        soma = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mult = findViewById(R.id.mult);
        igual = findViewById(R.id.equals);
        result = findViewById(R.id.result);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Número não pode ficar em branco", Toast.LENGTH_LONG).show();
                } else {
                    double a = Double.parseDouble(number1.getText().toString());
                    double b = Double.parseDouble(number2.getText().toString());
                    armazena = a + b;
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Número não pode ficar em branco", Toast.LENGTH_LONG).show();
                } else {
                    double a = Double.parseDouble(number1.getText().toString());
                    double b = Double.parseDouble(number2.getText().toString());
                    armazena = a - b;
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Número não pode ficar em branco", Toast.LENGTH_LONG).show();
                } else {
                    double a = Double.parseDouble(number1.getText().toString());
                    double b = Double.parseDouble(number2.getText().toString());
                    armazena = a * b;
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Número não pode ficar em branco", Toast.LENGTH_LONG).show();
                } else {
                    double a = Double.parseDouble(number1.getText().toString());
                    double b = Double.parseDouble(number2.getText().toString());
                    armazena = a / b;
                }
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String y = String.valueOf(armazena);
                result.setText(y);
                armazena = 0;
            }
        });
    }
}