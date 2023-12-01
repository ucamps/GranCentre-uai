package com.example.intents;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class ClRestaurant extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurants);
    }

    @Override
    public void onClick(View view) {

    }
}