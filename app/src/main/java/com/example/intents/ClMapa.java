package com.example.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ClMapa extends AppCompatActivity implements View.OnClickListener{

    ImageView imgLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa);
        setupSpinnerBasic();
        imgLogo = findViewById(R.id.logo);

        imgLogo.setOnClickListener(this);
    }

    private void setupSpinnerBasic() {
        Spinner spinner = findViewById(R.id.llistaBotigues);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.social_networks_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onClick (View v) {
        if (v.getId() == R.id.logo) {
            Intent pag = new Intent(this, MainActivity.class);
            startActivity(pag);
        }
    }
}