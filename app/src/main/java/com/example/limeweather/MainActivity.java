package com.example.limeweather;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;



/*
* step 1: enter city and country
* step 2: output weather data
*
*
* task: required on screen, input for city, country
* view for weather
* show toast if error inputting city/country/etc
* method to get json object and parse the json
*
* */



//
//https://api.openweathermap.org/data/2.5/weather?q={city name},{state code}&appid={API key}
//https://api.openweathermap.org/data/2.5/weather?q={city name},{state code},{country code}&appid={API key}
//example: https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid={API key}
public class MainActivity extends AppCompatActivity {
   //"https://api.openweathermap.org/data/2.5/weather?q="
    JSONObject jsonObject = new JSONObject();
    EditText editCity, editCountry;
    TextView result;

    //use URL to get json


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public String addLocationToURL(String url) {
return url;
    }

}
