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

import com.bumptech.glide.Glide;

public class ClHotel extends AppCompatActivity implements View.OnClickListener{
    ImageView imgHotel1, imgHotel2, imgHotel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);


        imgHotel1 = findViewById(R.id.imgHotel1);
        imgHotel2 = findViewById(R.id.imgHotel2);
        imgHotel3 = findViewById(R.id.imgHotel3);

        Glide.with(this)
                .load("https://www.urhciutatdemataro.com/wp-content/blogs.dir/1491/files/gallery_photos/Fotos-foto01.jpg")
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
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.urhciutatdemataro.com/es/"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon1) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:937 575 522"));
            startActivity(intent);
        }

        if (v.getId() == R.id.ubi1) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.53153167128203, 2.436998096397077"));
            startActivity(intent);
        }
        if (v.getId() == R.id.email2) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("mailto:info.urhmataro@urh-hoteliers.com"));
            startActivity(intent);
        }

        if (v.getId() == R.id.web2) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.guestreservations.com/new-hotel-colon/booking?gad_source=1&gclid=Cj0KCQiA67CrBhC1ARIsACKAa8QU0fFsvgFnSXt6H2OzcmmyO8WxPkr0otyvh44MPUwHEGpF-Tqov4EaAjPBEALw_wcB"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon2) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:911238107"));
            startActivity(intent);
        }

        if (v.getId() == R.id.ubi2) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.53795268216341, 2.4488264591326594"));
            startActivity(intent);
        }

        if (v.getId() == R.id.email3) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("mailto:esp-rrhh@hotelbb.com"));
            startActivity(intent);
        }

        if (v.getId() == R.id.web3) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.hotel-bb.com/es/hotel/barcelona-mataro?utm_source=google&utm_medium=cpc&utm_campaign=es_goo_brand_text_MaxConv_mix_Barcelona&utm_source=google&utm_medium=voila&utm_campaign=ES_Search_Generico_Barcelona&gad_source=1&gclid=Cj0KCQiA67CrBhC1ARIsACKAa8Q3B7ol6YT0FsnMPQKq3U2rd549N2fvDGi0fKmd0WyjXlNCJLsS7UoaAkYREALw_wcB"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon3) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:900 533 147"));
            startActivity(intent);
        }

        if (v.getId() == R.id.ubi3) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.527517971282464, 2.433522767561614"));
            startActivity(intent);
        }
    }

    private void setupSpinnerBasic() {
        Spinner spinner = findViewById(R.id.spinner_hotels);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.valoracio_hotels, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

}