package com.sagar.IOC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    private final Engine eng;

    public Car(Engine eng) {
        this.eng = eng;
    }

    @GetMapping("/car")
    public String drive() {
        return eng.start() + "<br>Car is Driving";
    }
}