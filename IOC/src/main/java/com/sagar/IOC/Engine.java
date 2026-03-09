package com.sagar.IOC;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    String start() {
        return "Engine Started ";
    }
}