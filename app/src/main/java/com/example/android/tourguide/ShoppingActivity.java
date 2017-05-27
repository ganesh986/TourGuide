package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Create a list of shopping place
        ArrayList<Informations> shopping = new ArrayList<Informations>();
        shopping.add(new Informations(R.drawable.silvagni,"La Vecchia Faenza","Ceramiche Artistiche Laura Silvagni","Via S. Ippolito 23/a, 48018, Faenza, Italia","+39 0546 26357","http://www.lavecchiafaenza.it/"));
        shopping.add(new Informations(R.drawable.gatti,"Ceramica Gatti 1928","","Via Pompignoli 4, 48018, Faenza, Italia","+39 0546 634301","http://www.ceramicagatti.it/"));
        shopping.add(new Informations(R.drawable.vignoli,"Bottega Vignoli","Ceramic Laboratory & Show Room","Via Fermi 30, 48018, Faenza, Italia","+39 0546 621076","https://www.ceramichevignoli.com/"));
        shopping.add(new Informations(R.drawable.contadina,"La contadina di Romagna","","Via Emilia Ponente 59, Faenza, Italia","+39 347 358 8155",""));
        shopping.add(new Informations(R.drawable.papadopulu,"Ceramiche Ifigenia Papadopulu","","Via Paolo Costa, 4, 48018, Faenza, Italia","+39 348 839 3757","http://ifigeniapapadopulu.com/"));
        shopping.add(new Informations(R.drawable.parmigiano,"Casa del Parmigiano dal 1974","","Piazza Martiri della Liberta n. 28, 48018, Faenza, Italia","+39 0546 29770","http://www.casadelparmigianofaenza.it/"));
        shopping.add(new Informations(R.drawable.chocolat,"Chocolat Passion","","Via Naviglio 30/A, 48018, Faenza, Italia","+39 0546 667595",""));
        shopping.add(new Informations(R.drawable.bacchini,"Ceramiche Artistiche Bacchini Marianna","","Via Barilotti 3, 48018, Faenza, Italia","+39 0546 662563","http://www.ceramichefaenza.it/"));

        // Create an {@link Informations}, whose data source is a list of {@link Information}s. The
        // adapter knows how to create list items for each item in the list.
        InformationAdapter adapter = new InformationAdapter(this, shopping, R.color.category_shopping);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
