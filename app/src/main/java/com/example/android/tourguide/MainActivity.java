/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the museum category
        TextView museum = (TextView) findViewById(R.id.museum);

        // Set a click listener on that View
        museum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Museums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumsIntent);
            }
        });

        // Find the View that shows the places category
        TextView places = (TextView) findViewById(R.id.places);

        // Set a click listener on that View
        places.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Places View is clicked on.
            @Override
            public void onClick(View view) {
                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesIntent);
            }
        });

        // Find the View that shows the shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping View is clicked on.
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });

        // Find the View that shows the activities category
        TextView activities = (TextView) findViewById(R.id.activities);

        // Set a click listener on that View
        activities.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activities View is clicked on.
            @Override
            public void onClick(View view) {
                Intent activitiesIntent = new Intent(MainActivity.this, ActivitiesActivity.class);
                startActivity(activitiesIntent);
            }
        });
    }

}
