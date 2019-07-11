/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project.controllers;

import com.mycompany.project.services.GmailService;
import com.mycompany.project.services.WeatherService;
import java.io.IOException;
import java.security.GeneralSecurityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author tommib
 */
@Controller
public class HomeController {

    @Autowired
    private WeatherService weatherService;
  

    @GetMapping("/")
    public String home(Model model) throws GeneralSecurityException, IOException {
        model.addAttribute("tempature", this.weatherService.getTemp());
        model.addAttribute("picture", "http://openweathermap.org/img/wn/" + this.weatherService.getIconId() + "@2x.png");
        this.weatherService.getIconId(); 
        GmailService.gmailTest();
        return "home";
    }
}
