package com.example.intents;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ClHotel extends AppCompatActivity implements View.OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        setupSpinnerBasic();
    }

    private void setupSpinnerBasic() {
        Spinner spinner = findViewById(R.id.spinner_hotels);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.valoracio_hotels, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

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

    public void onClick(View v) {
        if (v.getId() == R.id.email1) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("mailto:exemple@gmail.com"));
            startActivity(intent);
        }

        if (v.getId() == R.id.web1) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon1) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:647328384"));
            startActivity(intent);
        }

        if (v.getId() == R.id.ubi1) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.3, 20.3"));
            startActivity(intent);
        }
    }

}