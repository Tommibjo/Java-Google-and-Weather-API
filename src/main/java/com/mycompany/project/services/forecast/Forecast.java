/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project.services.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mycompany.project.services.forecast.main.Main;
import com.mycompany.project.services.forecast.weather.Weather;
import java.util.ArrayList;

/**
 *
 * @author tommib
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String base;
    private Main main;
    private ArrayList<Weather> weather;

    public Forecast() {
        System.out.println("Weather constructori");
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return this.main;
    }

    public void setAtmosphere(Main main) {
        this.main = main;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Forecast{" + "base=" + base + ", main=" + main + ", weather=" + weather + '}';
    }

}
