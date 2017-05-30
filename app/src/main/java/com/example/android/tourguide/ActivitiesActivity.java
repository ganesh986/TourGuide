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
        activities.add(new Informations(R.drawable.viale, R.string.Activities1, R.string.empty, R.string.ActiV1, R.string.ActiP1, R.string.ActiW1));
        activities.add(new Informations(R.drawable.spider, R.string.Activities2, R.string.empty, R.string.ActiV2, R.string.ActiP2, R.string.empty));
        activities.add(new Informations(R.drawable.clandestino, R.string.Activities3, R.string.empty, R.string.ActiV3, R.string.ActiP3, R.string.ActiW3));
        activities.add(new Informations(R.drawable.caffe_delle_rose, R.string.Activities4, R.string.empty, R.string.ActiV4, R.string.ActiP4, R.string.empty));
        activities.add(new Informations(R.drawable.molinella, R.string.Activities5, R.string.empty, R.string.ActiV5, R.string.ActiP5, R.string.empty));
        activities.add(new Informations(R.drawable.giradischiclub, R.string.Activities6, R.string.empty, R.string.ActiV6, R.string.ActiP6, R.string.ActiW6));

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
