package com.example.testeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Continuacao extends AppCompatActivity {
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continuacao);

        textViewResultado = (TextView) findViewById(R.id.textViewResultado);

        Intent intent = getIntent();
        Float imc = intent.getFloatExtra("imcresult", 0);

        textViewResultado.setText(imc.toString());
    }
}