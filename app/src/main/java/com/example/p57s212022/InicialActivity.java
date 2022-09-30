package com.example.p57s212022;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InicialActivity extends AppCompatActivity {

    Handler manejador = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        manejador.postDelayed(autocambiar,5000);
    }

    Runnable autocambiar = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(InicialActivity.this, PrincipalActivity.class);
            startActivity(intent);
            finish();
        }
    };
}