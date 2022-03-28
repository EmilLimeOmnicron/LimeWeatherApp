package com.example.limeweather;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.EditText;
import android.widget.TextView;


/*
* step 1: enter city and country
* step 2: output weather data
*
*
* task: required on screen, input for city, country
* view for weather
* show toast if error inputting city/country/etc
*
* */



//d2615bee9c9e5bd50dbe79d8ffcf310a
//https://api.openweathermap.org/data/2.5/weather?q={city name},{state code}&appid={API key}
//https://api.openweathermap.org/data/2.5/weather?q={city name},{state code},{country code}&appid={API key}
//example: https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid={API key}
public class MainActivity extends AppCompatActivity {
    //private static final String url =
    EditText editCity, editCountry;
    TextView result;

    //JSONObject json =

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}