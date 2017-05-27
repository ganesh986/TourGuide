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
        places.add(new Informations(R.drawable.piazza,"Piazza del Popolo","","Piazza del Popolo, 48121, Faenza, Italia","",""));
        places.add(new Informations(R.drawable.oriolo,"Torre di Oriolo","","Oriolo, 48018, Faenza, Italia","+39 0546 25231","http://www.torredioriolo.it/"));
        places.add(new Informations(R.drawable.fontana,"Fontana di Piazza della Libertà","","Piazza della Libertà, 48018, Faenza, Italia","","http://www.comune.faenza.ra.it/Amministrazione/Comunicati-stampa/La-Fontana-monumentale-di-Faenza"));
        places.add(new Informations(R.drawable.duomo,"Duomo di Faenza","","Piazza Undici Febbraio 9, 48018, Faenza, Italia","+39 0546 664510",""));
        places.add(new Informations(R.drawable.orologio,"Torre dell'Orologio","","Piazza Del Popolo, 48018, Faenza, Italia","",""));
        places.add(new Informations(R.drawable.masini,"Teatro Comunale A. Masini","","Piazza Nenni, Faenza, Italia","+39 0546 21306","http://teatromasini.racine.ra.it/homemasini.html"));
        places.add(new Informations(R.drawable.commenda,"Chiesa Della Commenda","","Corso Europa, 107, 48018, Faenza, Italia","",""));
        places.add(new Informations(R.drawable.lombardi,"Apicoltura Lombardi","","Via Mercanta 11/B, 48018, Faenza, Italia","+39 0546 47155","http://www.mielelombardi.it/"));
        places.add(new Informations(R.drawable.chiavi,"Porta delle Chiavi","","Via Forlivese 3, 48018, Faenza, Italia","+39 0546 25231",""));
        places.add(new Informations(R.drawable.ippolito,"Chiesa dei Ss. Ippolito e Lorenzo","","Via Sant'Ippolito 27, 48018, Faenza, Italia","+39 0546 21681",""));

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
