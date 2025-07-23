package com.example.testapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CityModel> cityModels = new ArrayList<>();

    int[] cityImage = {R.drawable.capital_city, R.drawable.city};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setupCityModel();

        SC_RecyclerViewAdapter adapter = new SC_RecyclerViewAdapter(this, cityModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setupCityModel() {
        String[] cityNames = getResources().getStringArray(R.array.serbiaCities);
        String[] regNumbers = getResources().getStringArray(R.array.regNumber);

        for (int i = 0; i < cityNames.length; i++) {
            int imageRes;

            if (cityNames[i].equals("Belgrade")) {
                imageRes = R.drawable.capital_city;
            } else {
                imageRes = R.drawable.city;
            }

            cityModels.add(new CityModel(imageRes, regNumbers[i], cityNames[i]));
        }
    }
}

