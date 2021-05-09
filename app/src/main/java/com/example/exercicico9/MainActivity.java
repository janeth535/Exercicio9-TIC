package com.example.exercicico9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_euros;
    Button txt_kwanza, txt_real, txt_dolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_euros = findViewById(R.id.txt_valorEuros);
        txt_dolar = findViewById(R.id.txt_dolar);
        txt_real = findViewById(R.id.txt_real);
        txt_kwanza = findViewById(R.id.txt_kwanza);

        txt_kwanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             double vEuros = Double.parseDouble(txt_euros.getText().toString());
             double vKwanza = vEuros * 795.29;
                Toast.makeText(MainActivity.this,vEuros+"€ são " + vKwanza + "Kz",Toast.LENGTH_SHORT).show();
            }
        });

        txt_real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double vEuros = Double.parseDouble(txt_euros.getText().toString());
                double vReal = vEuros * 4.4;
                Toast.makeText(MainActivity.this, vEuros+"€ são " + vReal + "R€", Toast.LENGTH_SHORT).show();

            }
        });

        txt_dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double vEuros = Double.parseDouble(txt_euros.getText().toString());
                double vDolar = vEuros * 1.20;
                Toast.makeText(MainActivity.this, vEuros+"€ são " + vDolar + "€", Toast.LENGTH_SHORT).show();

            }
        });

    }
}