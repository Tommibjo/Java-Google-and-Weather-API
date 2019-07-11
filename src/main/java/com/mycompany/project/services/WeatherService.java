/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project.services;

import com.mycompany.project.services.forecast.Forecast;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author tommib
 */
@Service
public class WeatherService {

    private RestTemplate restTemplate;
    private Forecast weather;
    private final String WEATHER_API_URL = "http://api.openweathermap.org/data/2.5/weather?q=Kirkkonummi,fin&units=metric&appid=e5a8feebdc44050a1aaec2b8cd07bf25";

    public WeatherService() {
        this.restTemplate = new RestTemplate();
        this.weather = this.restTemplate.getForObject(WEATHER_API_URL, Forecast.class);
    }

    public int getTemp() {
        return (int)this.weather.getMain().getTemp();
    }

    public String getIconId() {
        return this.weather.getWeather().get(0).getIcon();
    }
}
