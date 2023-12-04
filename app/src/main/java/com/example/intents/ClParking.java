package com.example.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ClParking extends AppCompatActivity implements View.OnClickListener{

    ImageView imgmatparc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking);

        imgmatparc = findViewById(R.id.matparc);
        imgmatparc.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.matparc) {
            Intent pag = new Intent(this, MainActivity.class);
            startActivity(pag);
        }
    }
}
