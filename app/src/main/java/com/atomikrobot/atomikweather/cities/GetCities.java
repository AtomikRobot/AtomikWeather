package com.atomikrobot.atomikweather.cities;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.atomikrobot.atomikweather.R;
import com.atomikrobot.atomikweather.api.RetrofitApi;
import com.atomikrobot.atomikweather.models.CitiesModel;


public class GetCities extends AsyncTask<Void, Void, Void> {
    private Activity activity;
    private CitiesModel CityList;
    private ListView listView;
    private RetrofitApi retrofitApi;
    private double lat;
    private double lon;

    public GetCities(Activity a, double latitude, double longitude) { ;
        this.activity = a;

        this.retrofitApi = new RetrofitApi();
        this.lat = latitude;
        this.lon = longitude;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        CityList = retrofitApi.GetAllHeros(lat, lon);



        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);


        RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.location_layout);
        relativeLayout.setVisibility(View.GONE);

        LinearLayout linearLayout = (LinearLayout) activity.findViewById(R.id.list_layout);
        linearLayout.setVisibility(View.VISIBLE);

        CitiesAdapter citiesAdapter = new CitiesAdapter(activity, R.layout.list_cities, CityList.getList(), lat, lon);

        this.listView = (ListView) activity.findViewById(R.id.list_city);
        this.listView.setAdapter(citiesAdapter);

    }
}
