package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClMapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa);
        Button btInici = findViewById(R.id.btInici);


    }

    public void canviarPagina(View view) {
        Intent pag = new Intent(this, MainActivity.class);
        startActivity(pag);

    }



}