package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Create a list of places of interest
        ArrayList<Informations> places = new ArrayList<Informations>();
        places.add(new Informations(R.drawable.piazza, R.string.Places1, R.string.empty, R.string.PlaV1, R.string.empty, R.string.empty));
        places.add(new Informations(R.drawable.oriolo, R.string.Places2, R.string.empty, R.string.PlaV2, R.string.PlaP2, R.string.PlaW2));
        places.add(new Informations(R.drawable.fontana, R.string.Places3, R.string.empty, R.string.PlaV3, R.string.empty, R.string.PlaW3));
        places.add(new Informations(R.drawable.duomo, R.string.Places4, R.string.empty, R.string.PlaV4, R.string.PlaP4, R.string.empty));
        places.add(new Informations(R.drawable.orologio, R.string.Places5, R.string.empty, R.string.PlaV5, R.string.empty, R.string.empty));
        places.add(new Informations(R.drawable.masini, R.string.Places6, R.string.empty, R.string.PlaV6, R.string.PlaP6, R.string.PlaW6));
        places.add(new Informations(R.drawable.commenda, R.string.Places7, R.string.empty, R.string.PlaV7, R.string.empty, R.string.empty));
        places.add(new Informations(R.drawable.lombardi, R.string.Places8, R.string.empty, R.string.PlaV8, R.string.PlaP8, R.string.PlaW8));

        // Create an {@link Informations}, whose data source is a list of {@link Information}s. The
        // adapter knows how to create list items for each item in the list.
        InformationAdapter adapter = new InformationAdapter(this, places, R.color.category_places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
