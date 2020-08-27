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

    // 1) Maak in de map een nieuwe controller noem deze BankController
    // 2) Maak een endpoint met POST om een account voor een klant aan te maken
    // 3) maak een service class aan wanneer Zdoat je vanuit de Post binnen komt in de controller ga je door naar de service, in de service wordt
    // aan de hand van de gegevens een user Object aangemaakt, daarna retour
    // Goed bezig! Zijn de kleine basis stappen, waar het naar toe gaat weet ik ook niet :-)

    // Voor Later:
    // 4) Model Customer , welke properties heeft een klant nodig?  voornaam achternaam postcode adres wooenplaats huisnummer  bankrekeningNummer


}
