package com.anava.practice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot";
    }

    // Maak nu een GET methode, dit betekend dat ik niet via POSTMAN de waarde kan opvragen met een PUT POST
    // Jou gemaakte methode kun je POST GET PUT ETC benaderen probeer dit veiliger te maken

    // Ik krijg een METHOD NOT SUPPORTED of BAD REQUEST als ik een PUT of POST probeer, maar om het veiliger te maken
    // dacht ik om de redirect te verwijderen, is dat een goede keuze?

    @GetMapping("/get")
    public String mapping() {
        return "Get Mapping test";
    }

    // Maak een POST Mapping
    // Wanneer ik dan een getal mee geef in de url moet ik deze x2 terug krijgen.
    // Bijvoorbeeld ik geef getal 2
    // wil ik antwoord 4 terug

    @PostMapping("/{number}")
    public int multiply(@PathVariable int number) {
        return (number*2);
    }

}
