package org.merion.weatherapi;

import org.merion.weatherapi.dto.CurrentResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("/v1/current.json")
    Call<CurrentResponse> current(@Query("key") String key, @Query("q") String q);
    //Call<CurrentResponse> current(@Query("key") String key, @Query("q") String q, @Query("aqi") String aqi);


}
