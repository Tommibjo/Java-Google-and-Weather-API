/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project.services.forecast.main;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author tommib
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {

    private double temp;
    private int pressure;
    private int humidity;
    private double temp_min;
    private double temp_max;

    public Main(){
        System.out.println("Atmosphere construktori");
    }
    
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    @Override
    public String toString() {
        return "Atmosphere{" + "temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", temp_min=" + temp_min + ", temp_max=" + temp_max + '}';
    }

}
