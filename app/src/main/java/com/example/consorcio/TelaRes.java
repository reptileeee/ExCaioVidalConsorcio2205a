package com.example.consorcio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TelaRes extends AppCompatActivity {
    EditText valpago;
    EditText saldodev;
    String respagoc;
    String resdevc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_res);
        valpago = (EditText) findViewById(R.id.eTxtResValPago);
        saldodev = (EditText) findViewById(R.id.eTxtResSaldoDev);
        Intent intent = getIntent();
        respagoc = intent.getStringExtra(MainActivity.MESSAGE1);
        resdevc = intent.getStringExtra(MainActivity.MESSAGE2);
        valpago.setText(respagoc);
        saldodev.setText(resdevc);
    }
}
