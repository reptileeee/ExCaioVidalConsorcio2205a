package com.example.consorcio;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE1 = "com.example.consorcio.MESSAGE1";
    public static final String MESSAGE2 = "com.example.consorcio.MESSAGE2";
    EditText total;
    EditText pago;
    EditText val;
    EditText sas;
    int totalc;
    int pagoc;
    double valc;
    double respagoc;
    double resdevc;
    double restotalprest;
    String res1;
    String res2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total = (EditText) findViewById(R.id.eTxtTotal);
        pago = (EditText) findViewById(R.id.eTxtQtdPago);
        val = (EditText) findViewById(R.id.eTxtValPrest);
        sas = (EditText) findViewById(R.id.eTxtResValPago2);
    }

    public void Calc(View view){
        int totalc = Integer.parseInt(total.getText().toString());
        int pagoc = Integer.parseInt(pago.getText().toString());
        double valc = Double.parseDouble(val.getText().toString());

        respagoc = pagoc * valc;
        restotalprest = totalc * valc;
        resdevc = respagoc - resdevc;


        res1 = String.valueOf(respagoc);
        res2 = String.valueOf(resdevc);

        Intent intent = new Intent(this, TelaRes.class);
        intent.putExtra(MESSAGE2,res1);
        intent.putExtra(MESSAGE1,res2);
        startActivity(intent);
    }
}
