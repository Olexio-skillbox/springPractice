package org.merion.weatherapi;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
// import okhttp3.Response;
import org.merion.weatherapi.dto.CurrentResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import retrofit2.Response;
@RestController
public class WeatherController {
    @GetMapping("/api/v1/weather-in-city")
    public CurrentResponse weatherInCity(@RequestParam(required = false) String query, HttpServletRequest request) {
        String q = query;
        if (q == null) {
            q = request.getRemoteAddr();
        }
        // Response<WeatherResponse> response = Weather.instance().current(Weather.KEY, q);
        try {
            Response<CurrentResponse> response = Weather.instance().current(Weather.KEY, q).execute();
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
