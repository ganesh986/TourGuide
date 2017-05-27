package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Create a list of Activities
        ArrayList<Informations> activities = new ArrayList<Informations>();
        activities.add(new Informations(R.drawable.viale,"Cafè Del Viale","","P.zza C. Battisti 1, 48018, Faenza, Italia","+39 0546 28346","http://www.cafedelviale.com/"));
        activities.add(new Informations(R.drawable.spider, "Spider","","Via renaccio, 48018, Faenza, Italia","+39 0546 664963",""));
        activities.add(new Informations(R.drawable.clandestino, "Clan Destino","","Viale Baccarini 23, 48018, Faenza, Italia","+39 0546 681327","http://clandestinoangusto.it/"));
        activities.add(new Informations(R.drawable.caffe_delle_rose, "Caffè delle Rose","","Corso Giacomo Matteotti 25/A, 48018, Faenza, Italia","+39 0546 560711",""));
        activities.add(new Informations(R.drawable.molinella, "Caffe Della Molinella","","Corso Giuseppe Mazzini 26, 48018, Faenza, Italia","+39 0546 28679",""));
        activities.add(new Informations(R.drawable.giradischiclub, "Giradischi Club","","Viale Alfredo Baccarini 27, 48018, Faenza, Italia","+39 335 431 130","http://www.giradischiclub.it/"));

        // Create an {@link Informations}, whose data source is a list of {@link Information}s. The
        // adapter knows how to create list items for each item in the list.
        InformationAdapter adapter = new InformationAdapter(this, activities, R.color.category_activities);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}
