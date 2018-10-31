package com.example.amosh.tourguideapp_cairo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class historical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historical);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Salah El-Deen Castel", "Cairo", R.drawable.saladin));
        places.add(new Place("Pyramids", "Giza", R.drawable.pyramids));
        places.add(new Place("Vally Of The Kings", "Luxor", R.drawable.vally_of_kings));
        places.add(new Place("Karnak Temple", "Luxor", R.drawable.karnak));
        places.add(new Place("Abu Simple Temple", "Aswan", R.drawable.abu_simple));
        places.add(new Place("Deir el-Bahari", "Luxor", R.drawable.deir_bahari));
        places.add(new Place("Mortuary Temple of Hatshepsut", "Luxor", R.drawable.hatshipsoot));
        places.add(new Place("Egyption Museum", "Cairo", R.drawable.museum));
        places.add(new Place("Great Sphinx", "Giza", R.drawable.sphinx));
        places.add(new Place("Saint Catherine's Monastery", "South Sinai", R.drawable.saint_cat));


        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_historical);
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
