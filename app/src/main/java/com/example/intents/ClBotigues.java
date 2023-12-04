package com.example.intents;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ClBotigues extends AppCompatActivity implements View.OnClickListener{
    TextView TTel1, TPag1,TRes1, TTel2, TPag2,TRes2, TTel3, TPag3,TRes3, TTel4, TPag4,TRes4, TTel5, TPag5,TRes5;
    TextView[] tex;
    ImageView imgBotiga1, imgBotiga2, imgBotiga3, imgBotiga4, imgBotiga5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.botigues);
        setupSpinnerBasic();

        imgBotiga1 = findViewById(R.id.imgBotiga1);
        imgBotiga2 = findViewById(R.id.imgBotiga2);
        imgBotiga3 = findViewById(R.id.imgBotiga3);
        imgBotiga4 = findViewById(R.id.imgBotiga4);
        imgBotiga5 = findViewById(R.id.imgBotiga5);

        TTel1 = findViewById(R.id.telefon1);
        TPag1 = findViewById(R.id.web1);
        TRes1 = findViewById(R.id.resenyes1);

        //BOTIGA 2

        TTel2 = findViewById(R.id.telefon2);
        TPag2 = findViewById(R.id.web2);
        TRes2 = findViewById(R.id.resenyes2);

        //BOTIGA 3
        TTel3 = findViewById(R.id.telefon3);
        TPag3 = findViewById(R.id.web3);
        TRes3 = findViewById(R.id.resenyes3);

        //BOTIGA 4
        TTel4 = findViewById(R.id.telefon4);
        TPag4 = findViewById(R.id.web4);
        TRes4 = findViewById(R.id.resenyes4);

        //BOTIGA 5
        TTel5 = findViewById(R.id.telefon5);
        TPag5 = findViewById(R.id.web5);
        TRes5 = findViewById(R.id.resenyes5);

        tex = new TextView[]{TTel1, TPag1, TRes1, TTel2, TPag2, TRes2, TTel3, TPag3, TRes3, TTel4, TPag4, TRes4, TTel5, TPag5, TRes5};
        //Detectar clic botons:
        int i = 0;
        for (TextView vi : tex) {
            vi.setOnClickListener(this);
            vi.setTag(i);
            i++;
        }

        Glide.with(this)
                .load("data:image/png;base64,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")
                .into(imgBotiga1);

        Glide.with(this)
                .load("data:image/jpeg;base64,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")
                .into(imgBotiga2);

        Glide.with(this)
                .load("data:image/png;base64,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")
                .into(imgBotiga3);

        Glide.with(this)
                .load("data:image/jpeg;base64,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s9utVbbtSzGgklxU05GJIJBw3mg9eGCOuB2XUC1PWmz2wawHiXGB0Na0YbWU5DZMdj0cPUcOmEGRsmrtPX2ES2u70k2Rkx+IGyN9WHBH0hem4X+zW2IyXC60VMwdZZ2tz6ceKiVy2A3Rjz813qjnbngKmN0RA/q7y+FHsDv75MVt2tsLO8PiSH6i1v70GM2164t2rrhQU9m35KSgEn+UOaWiVz93kDxwN0cTjOTw6m77O7bUWnRFmoaxhjqI6ZpkY7mwn3sHzGcLX9FbJLDpieOtqC653CMhzJp2gMjcOrWccHzJOOmFQkHN+2TSNbpjVH2S2kPZRVM4nbLHzp6jOTntl3vA/R0VB0Ltist5pYqbUE8dtuTQA98nCGU9w7k30OPIlUmrpaetppKashjnglbuyRSNDmuHYgqS6k2EWusmfPYLjJb9459nmb4sY8mnIcB67yCuQTxVMEc9PKyWGRocySNwc1wPIgjmEWP0tbZbNpu2Wyd7Hy0lNHC9zM7ri0AZGV/EGVREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREH/2Q==")
                .into(imgBotiga4);

        Glide.with(this)
                .load("data:image/jpeg;base64,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AO12B9qmmiIKzWG6UVzipzEwVxuFRwc2wtDuIAntyQG+OSe9U+PZXSTXhzv0i8A82uqeR9wBW62Kw2rT1F5nZqKKlhzlwYMl573OPNx8SUHPW5k7Kbd2uqJSRHDV0sjyBnDWxxE8vYFWPhh0Z/fan6pJ/ovvqHa3T2obzU3avdXCpqC0v6KYNb6LQ0YGO5oWO+BTSfr3L6yPyoNh0zr7T2qK+ShtFTLJPHCZnCSBzAGAgE5I73BQ64SSbj7p9HE5xpampEUbmn4tNHnLh3ZaHO9rlYrHtfYbE+tfbprgx9ZSPpJHmcEtY8gktOOR9Ec16dJbdWHSVxfX2sVLqh0JhzPLxhrSQTgYHPkEGG+BXSX/AHH61/RTzdzb+h0jBb6u0dOaOoc6GYTScZbJjLcHxAd7l0UsVqawUOprPLa7m15p5C12Y3Yc0tIIIPZ1IJbc9QnUWwNXNM/iq6UwU1SSeZcyaLDj7Wlp9pK+nk+00FVYr7FUwskZJUNY4OGctMeCPZzW10W1un6Kz3K0wy3DzO49H07HTg843cTSOXI5HuWY0fo+2aQp6mC0moLKh4e/p5OI5Axy5BBFq7ZXVDK2oZQPon0jZXCB0sxD3Mz6Jdy68Yyi6JRAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREH//Z")
                .into(imgBotiga5);



    }

    @Override
    public void onClick (View v){
        if (v.getId() == R.id.web1) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mataro-parc.com/jd-sports/"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon1) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:687621467"));
            startActivity(intent);
        }

        if (v.getId() == R.id.resenyes1) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.esencialmediterraneo.com/mataro/tienda-chij16e-p-k1pbirujyjywhmsx0#comments"));
            startActivity(intent);
        }

        //BOTIGA 2

        if (v.getId() == R.id.web2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mataro-parc.com/zara/"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:937990111"));
            startActivity(intent);
        }

        if (v.getId() == R.id.resenyes2) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.esencialmediterraneo.com/mataro/tienda-chijb8lipxo1pbir2ninc4dri-0#comments"));
            startActivity(intent);
        }

        //BOTIGA 3

        if (v.getId() == R.id.web3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mataro-parc.com/guess/"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 932509138"));
            startActivity(intent);
        }

        if (v.getId() == R.id.resenyes3) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.esencialmediterraneo.com/mataro/tienda-chijxdh9lxo1pbir3dii2k9xkty#comments"));
            startActivity(intent);
        }

        //BOTIGA 4

        if (v.getId() == R.id.web4) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mataro-parc.com/mango/"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon4) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 937998894"));
            startActivity(intent);
        }

        if (v.getId() == R.id.resenyes4) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.esencialmediterraneo.com/mataro/tienda-chijg0dkoro1pbiraoymfeethqy#comments"));
            startActivity(intent);
        }

        //BOTIGA 5

        if (v.getId() == R.id.web5) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mataro-parc.com/pull-and-bear/"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon5) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:  937579468"));
            startActivity(intent);
        }

        if (v.getId() == R.id.resenyes5) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.esencialmediterraneo.com/mataro/tienda-chijn2iquho1pbirecyorqkui2c#comments"));
            startActivity(intent);
        }


    }
    private void setupSpinnerBasic() {
        Spinner spinner = findViewById(R.id.llistaBotigues);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.social_networks_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

}
