package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class HotelsActivity extends AppCompatActivity {

    Button btEmail1, btWeb1, btTelefon1;
    Button btEmail2, btWeb2, btTelefon2;
    Button btEmail3, btWeb3, btTelefon3;
    ImageView imgHotel1, imgHotel2, imgHotel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);


        imgHotel1 = findViewById(R.id.imgHotel1);
        imgHotel2 = findViewById(R.id.imgHotel2);
        imgHotel3 = findViewById(R.id.imgHotel3);

        Glide.with(this)
                .load("")
                .error(R.drawable.ic_error_foreground)
                .into(imgHotel1);

        Glide.with(this)
                .load("")
                .error(R.drawable.ic_error_foreground)
                .into(imgHotel2);

        Glide.with(this)
                .load("")
                .error(R.drawable.ic_error_foreground)
                .into(imgHotel3);
    }

}