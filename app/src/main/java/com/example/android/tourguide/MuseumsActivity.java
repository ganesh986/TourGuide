package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Create a list of Museum
        ArrayList<Informations> museums = new ArrayList<Informations>();
        museums.add(new Informations(R.drawable.international_ceramic, R.string.Museum1, R.string.empty, R.string.MusV1, R.string.MusP1, R.string.MusW1));
        museums.add(new Informations(R.drawable.palazzo_milzetti_museo, R.string.Museum2, R.string.MusD2, R.string.MusV2, R.string.MusP2, R.string.MusW2));
        museums.add(new Informations(R.drawable.pinacoteca, R.string.Museum3, R.string.empty, R.string.MusV3, R.string.MusP3, R.string.MusW3));
        museums.add(new Informations(R.drawable.zauli, R.string.Museum4, R.string.empty, R.string.MusV4, R.string.MusP4, R.string.MusW4));
        museums.add(new Informations(R.drawable.casa_bendandi, R.string.Museum5, R.string.empty, R.string.MusV5, R.string.MusP5, R.string.MusW5));
        museums.add(new Informations(R.drawable.gatti, R.string.Museum6, R.string.empty, R.string.MusV6, R.string.MusP6, R.string.MusW6));
        museums.add(new Informations(R.drawable.diocesano, R.string.Museum7, R.string.empty, R.string.MusV7, R.string.MusP7, R.string.MusW7));
        museums.add(new Informations(R.drawable.laderchi, R.string.Museum8, R.string.MusD8, R.string.MusV8, R.string.MusP8, R.string.MusW8));
        museums.add(new Informations(R.drawable.scienze_naturali, R.string.Museum9, R.string.empty, R.string.MusV9, R.string.MusP9, R.string.MusW9));
        museums.add(new Informations(R.drawable.tramonti, R.string.Museum10, R.string.empty, R.string.MusV10, R.string.MusP10, R.string.MusW10));

        // Create an {@link Informations}, whose data source is a list of {@link Information}s. The
        // adapter knows how to create list items for each item in the list.
        InformationAdapter adapter = new InformationAdapter(this, museums, R.color.category_museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
