package com.example.carrentalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }public void handleClick(View view) {
        Log.i("event-click","landing button clicked");
        Intent i = new Intent(LandingPage.this, RentalListings.class);
        startActivity(i);
    }
}
