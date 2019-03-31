package com.atomikrobot.atomikweather;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.atomikrobot.atomikweather.models.weatherModel;
import com.squareup.picasso.Picasso;

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String nameCity = intent.getStringExtra("name");
        String weather = intent.getStringExtra("weather");
        float temp = intent.getFloatExtra("temp", 0.1f);
        String icon = intent.getStringExtra("icon");

        setTitle(nameCity);
        TextView weatherView = (TextView) findViewById(R.id.weather);
        weatherView.setText(weather);

        TextView tempView = (TextView) findViewById(R.id.temp);
        tempView.setText(temp+"°C");

        ImageView iconView = (ImageView) findViewById(R.id.weather_icon);
        Picasso.get().load("http://openweathermap.org/img/w/"+icon+".png").into(iconView);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
