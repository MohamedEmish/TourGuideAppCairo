package com.example.amosh.tourguideapp_cairo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class markets extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.markets);
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Khan el-Khalili", "El-Gamaleya, Qism El-Gamaleya, Cairo", R.drawable.khanel));
        places.add(new Place("Metro Market", "1 Youssef Kamel, ZAMALEK، Cairo", R.drawable.metromarket));
        places.add(new Place("Alfa Market", "El-Malek El-Fadl, Abu Al Feda, Zamalek, Cairo", R.drawable.alfamarket));
        places.add(new Place("El Sorour Market", "2 Al Sayeda Khadega, Sherif, As Sahel, Cairo", R.drawable.sourormarket));
        places.add(new Place("Aswan Market", "Sheyakhah Thalethah, Qism Aswan, Aswan"));
        places.add(new Place("Aswan Old Souks", "Sheyakhah Thalethah, Qism Aswan, Aswan"));
        places.add(new Place("Luxor Market", "El-Souk, Luxor City, Luxor"));
        places.add(new Place("Savoy tourism market", "Kornish Al Nile, Luxor City, Luxor"));


        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_markets);
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
