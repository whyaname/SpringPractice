package com.anava.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot";
    }

    // Maak nu een GET methode, dit betekend dat ik niet via POSTMAN de waarde kan opvragen met een PUT POST
    // Jou gemaakte methode kun je POST GET PUT ETC benaderen probeer dit veiliger te maken


    // Maak een POST Mapping
    // Wanneer ik dan een getal mee geef in de url moet ik deze x2 terug krijgen.
    // Bijvoorbeeld ik geef getal 2
    // wil ik antwoord 4 terug

    // Zorg dat de Controller class in de packge controller komt

    // Hernoem de PractiveApplication naar Application

    // Goed gemaakt!
}
