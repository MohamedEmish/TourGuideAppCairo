package com.example.amosh.tourguideapp_cairo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant);


        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Zitouni", "1089 Corniche El Nil, Cairo" + "\n02 27916877", R.drawable.zitouni));
        places.add(new Place("Felfela", "15 Hoda Shaarawy, Bab Al Louq, Qasr an Nile, Cairo" + "\n02 23955557", R.drawable.felfela));
        places.add(new Place("Zööba", "26th of July Corridor, Al Gabalayah, Zamalek, Cairo" + "\n0127 480 0551", R.drawable.zooba));
        places.add(new Place("Ristorante Tuscany", "16 Saray El Gezira Street, Cairo" + "\n02 27283000", R.drawable.ristorante));
        places.add(new Place("Bella", "1089 Corniche El Nil, Cairo" + "\n02 27916875", R.drawable.bella));
        places.add(new Place("1886 RESTAURANT", "Corniche el Nile street, Luxor" + "\n11432", R.drawable.lux1));
        places.add(new Place("Sunrise Restaurant & Bar", "Kaled Ebn Elwaled St, Luxor" + "\n0127 008 5503", R.drawable.sunrise));
        places.add(new Place("Aswan Moon", "Sheyakhah Thalethah, Qism Aswan" + "\n2454109", R.drawable.aswanmon));


        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_restaurant);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Place} object at the given position the user clicked on
                Place place = places.get(position);
            }
        });
    }
}
