package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    ImageView btRestaurant, btCartelera, btHotel, btParking, btBotigues, btMapa;
    ImageView[] img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btRestaurant = findViewById(R.id.restaurante);
        btCartelera = findViewById(R.id.movies);
        btHotel = findViewById(R.id.hoteles);
        btParking= findViewById(R.id.parking);
        btBotigues = findViewById(R.id.botiga);
        btBotigues = findViewById(R.id.mapa);
        img = new ImageView[]{btRestaurant, btCartelera, btBotigues,btMapa};
        //Detectar clic botons:
        int i=0;
        for(ImageView vi : img ){
            vi.setOnClickListener(this);
            vi.setTag(i);
            i++;
        }


 //
    }
    @Override
    public void onClick(View v) {
        //Redireccionar a una altre Activity:
        if (v.getId() == R.id.restaurante) {
            Intent pag = new Intent(MainActivity.this, ClRestaurant.class);
            startActivity(pag);
        } else {
            if (v.getId() == R.id.movies) {
                Intent pag = new Intent(this, ClCartelera.class);
                startActivity(pag);
            } else {
                if (v.getId() == R.id.hoteles) {
                    Intent intent = new Intent(this, ClHotel.class);
                    startActivity(intent);
                } else {
                    if (v.getId() == R.id.parking) {
                        Intent intent = new Intent(this, ClParking.class);
                        startActivity(intent);
                    } else {
                        if (v.getId() == R.id.botiga) {
                            Intent pag = new Intent(MainActivity.this, ClBotigues.class);
                            startActivity(pag);
                        } else {
                            if (v.getId() == R.id.mapa) {
                                Intent pag = new Intent(this, ClMapa.class);
                                startActivity(pag);
                            }
                        }
                    }
                }
            }
        }
    }
}