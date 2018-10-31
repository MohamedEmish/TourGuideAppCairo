package com.example.amosh.tourguideapp_cairo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Lotus Hotel Cairo", "12 Talaat Harb, Ismailia, Qasr an Nile, Cairo \n02 25750966"));
        places.add(new Place("Iberotel Luxor", "26 Street 28, Mit Akaba, Al Agouzah, Giza \n095 2380925"));
        places.add(new Place("Eatabe Luxor Hotel", "Cornish El Nile Street, Luxor\n095 2374944"));
        places.add(new Place("Steigenberger Nile Palace", "85111, Khaled Ibn Al Walid, Luxor\n095 2366999"));
        places.add(new Place("Marhaba Aswan Hotel", "Corniche El Nil St.، DOWNTOWN، Qism Aswan\n097 2440102"));
        places.add(new Place("Hotel Isis Corniche", "Corniche El Nile Aswan\n097 2315100"));
        places.add(new Place("Amarante Pyramids", "29 Abou Hazem Street Of, Pyrmids Road, Giza\n0100 004 4481"));
        places.add(new Place("Indiana Hotel", "16 Adel Hussein Rostom, Ad Doqi A, Ad Doqi, Giza\n02 33354422"));

        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_hotels);
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
