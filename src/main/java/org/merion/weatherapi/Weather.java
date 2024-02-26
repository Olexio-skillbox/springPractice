package org.merion.weatherapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Weather {
    public static final String HOST = "https://api.weatherapi.com";
    public static final String KEY = "d785dbc38ccc4706a8d124354240602";
    private static WeatherApi api;
    public static WeatherApi init() {
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(WeatherApi.class);
    }
    public static WeatherApi instance() {
        if (api == null) {api = init();}
        return api;
    }

}
