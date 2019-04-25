package com.example.carrentalapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.*;

public class RentalListings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_listings);

        String[] rentalList = {
                "Avis",
                "Budget",
                "Dollar",
                "Sixt",
                "Thrifty"
        };

        ListView listView = findViewById(R.id.rentalList);
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, rentalList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("http://avis.com")));
                        break;
                    case 1:
                        startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("http://budget.com")));
                        break;
                    case 2:
                        startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("http://dollar.com")));
                        break;
                    case 3:
                        startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("http://sixt.com")));
                        break;
                    case 4:
                        startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("http://thrifty.com")));
                        break;
                }
            }
        });
    }


}
