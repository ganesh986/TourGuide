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
        museums.add(new Informations(R.drawable.international_ceramic, "Museo Internazionale delle Ceramiche","prova","Viale Baccarini 19, 48018, Faenza, Italia","+39 0546 697311","http://www.micfaenza.org/"));
        museums.add(new Informations(R.drawable.palazzo_milzetti_museo, "Palazzo Milzetti ","Museo Nazionale dell'età Neoclassica in Romagna","Via Giulio Cesare Tonducci 15, 48018, Faenza, Italia","+39 0546 26493","https://palazzomilzetti.jimdo.com/"));
        museums.add(new Informations(R.drawable.pinacoteca, "Pinacoteca Comunale di Faenza","","Via Santa Maria Dell'Angelo 9, 48018, Faenza, Italia","+39 0546 680251","http://pinacotecafaenza.racine.ra.it/ita/contatti.htm"));
        museums.add(new Informations(R.drawable.zauli, "Museo Carlo Zauli","","Via della Croce 6, 48018, Faenza, Italia","+39 0546 22123","http://www.museozauli.it/"));
        museums.add(new Informations(R.drawable.casa_bendandi, "Museo-Casa Bendandi  ","","Via Baldassarre Manara 17, 48018, Faenza, Italia","+39 338 818 8688","http://www.comune.faenza.ra.it/Citta/Da-vedere-in-citta/Pinacoteca-e-Musei/Museo-Casa-Bendandi-e-Osservatorio-geofisico-comunale"));
        museums.add(new Informations(R.drawable.gatti, "Ceramica Gatti 1928","","Via Pompignoli 4, 48018, Faenza, Italia","+39 0546 634301","http://www.ceramicagatti.it/"));
        museums.add(new Informations(R.drawable.diocesano, "Museo Diocesano","","Palazzo Vescovile, 48018, Faenza, Italia","+39 0546 21642","http://www.comune.faenza.ra.it/Citta/Da-vedere-in-citta/Pinacoteca-e-Musei/Museo-Diocesano"));
        museums.add(new Informations(R.drawable.laderchi, "Palazzo Ladrechi","Museo del Risorgimento e dell'Età Contemporanea","Corso Giuseppe Garibaldi 2, 48018, Faenza, Italia","+39 0546 691710","http://www.comune.faenza.ra.it/Citta/Da-vedere-in-citta/Pinacoteca-e-Musei/Museo-del-Risorgimento-e-dell-Eta-Contemporanea"));
        museums.add(new Informations(R.drawable.scienze_naturali, "Museo Civico Di Scienze Naturali","","Via Medaglie d'Oro 51, 48018, Faenza, Italia","+39 3381600208","http://www.comune.faenza.ra.it/Citta/Da-vedere-in-citta/Pinacoteca-e-Musei/Museo-Civico-di-Scienze-Naturali"));
        museums.add(new Informations(R.drawable.tramonti, "Museo Tramonti Guerrino","","Via Fratelli Rosselli 8, 48018, Faenza, Italia","+39 392 301 1196","http://www.tramontiguerrino.it/"));

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
