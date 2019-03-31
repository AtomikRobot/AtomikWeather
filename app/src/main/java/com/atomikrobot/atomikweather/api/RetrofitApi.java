package com.atomikrobot.atomikweather.api;

import android.util.Log;

import com.atomikrobot.atomikweather.models.CitiesModel;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RetrofitApi {
    private Retrofit retrofit;
    private WeatherApi service;
    private int cnt = 20;
    private String apId = "400a953282e0a1803b95952e29a741ad";
    private String lang = "fr";
    private String units = "metric";


    public RetrofitApi () {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(WeatherApi.class);
    }


    public CitiesModel GetAllHeros (double lat, double lon) {
        Call<CitiesModel> getHeros = service.getCities(lat, lon, lang, cnt, units, apId);

        try {
            Response<CitiesModel> response = getHeros.execute();
            if (response.isSuccessful()) {
                return (CitiesModel) response.body();
            }

        } catch (IOException e) {
            Log.e("errorNews", e.getMessage());
        }
        return null;
    }




    private interface WeatherApi {
        @GET("find")
        Call<CitiesModel> getCities(@Query("lat") double lat, @Query("lon") double lon, @Query("lang") String lang, @Query("cnt") int cnt, @Query("units") String units, @Query("appid") String appid);
    }
}
