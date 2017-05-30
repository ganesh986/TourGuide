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
        shopping.add(new Informations(R.drawable.silvagni, R.string.Shopping1, R.string.ShopD1, R.string.ShopV1, R.string.ShopP1, R.string.ShopW1));
        shopping.add(new Informations(R.drawable.gatti, R.string.Shopping2, R.string.Shopping1, R.string.ShopV2, R.string.ShopP2, R.string.ShopW2));
        shopping.add(new Informations(R.drawable.vignoli, R.string.Shopping3, R.string.ShopD3, R.string.ShopV3, R.string.ShopP3, R.string.ShopW3));
        shopping.add(new Informations(R.drawable.contadina, R.string.Shopping4, R.string.empty, R.string.ShopV4, R.string.ShopP4, R.string.empty));
        shopping.add(new Informations(R.drawable.papadopulu, R.string.Shopping5, R.string.empty, R.string.ShopV5, R.string.ShopP5, R.string.ShopW5));
        shopping.add(new Informations(R.drawable.parmigiano, R.string.Shopping6, R.string.empty, R.string.ShopV6, R.string.ShopP6, R.string.ShopW6));
        shopping.add(new Informations(R.drawable.chocolat, R.string.Shopping7, R.string.empty, R.string.ShopV7, R.string.ShopP7, R.string.empty));
        shopping.add(new Informations(R.drawable.bacchini, R.string.Shopping8, R.string.empty, R.string.ShopV8, R.string.ShopP8, R.string.ShopW8));

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
