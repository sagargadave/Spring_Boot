package com.Marvellous.MarvellousPortal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck
{
    @GetMapping("HealthCheck")
    public String HealthCheck()
    {
        return "Every thing is OK";
    }

}
