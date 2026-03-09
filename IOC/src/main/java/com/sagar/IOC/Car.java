package com.sagar.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    @Autowired
    Engine engine;

    @GetMapping("/car")
    public String Drive(){
        return engine.start() + "<br> Car is Driving";
    }
}
