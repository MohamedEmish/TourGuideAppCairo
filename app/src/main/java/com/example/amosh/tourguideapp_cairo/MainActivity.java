package com.example.amosh.tourguideapp_cairo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView historical = (TextView) findViewById(R.id.historical);

        // Set a click listener on that View
        historical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the historical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link historical}
                Intent hisoricalIntent = new Intent(MainActivity.this, historical.class);

                // Start the new activity
                startActivity(hisoricalIntent);
            }
        });

        TextView hotels = (TextView) findViewById(R.id.hotels);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the events category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link events}
                Intent eventsIntent = new Intent(MainActivity.this, hotels.class);

                // Start the new activity
                startActivity(eventsIntent);
            }
        });

        TextView markets = (TextView) findViewById(R.id.markets);

        // Set a click listener on that View
        markets.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the markets category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link markets}
                Intent marketsIntent = new Intent(MainActivity.this, markets.class);

                // Start the new activity
                startActivity(marketsIntent);
            }
        });

        TextView restaurant = (TextView) findViewById(R.id.restaurant);

        // Set a click listener on that View
        restaurant.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurant category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link historical}
                Intent restaurantIntent = new Intent(MainActivity.this, restaurant.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });


    }
}
