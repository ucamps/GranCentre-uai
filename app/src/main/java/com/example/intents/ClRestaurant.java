package com.example.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatActivity;

public class ClRestaurant extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurants);
        setupSpinnerBasic();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.pag) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.educem.com"));
            startActivity(intent);
        }

        if (v.getId() == R.id.tel) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:647328384"));
            startActivity(intent);
        }

      /*  if (v.getId() == R.id.) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("mailto:exemple@gmail.com"));
            startActivity(intent);
        }*/

        if (v.getId() == R.id.ubi) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.3, 20.3"));
            startActivity(intent);
        }
    }
    private void setupSpinnerBasic() {
        Spinner spinner = findViewById(R.id.spinner_basic);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.social_networks_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
