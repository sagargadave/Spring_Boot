package com.Marvellous.dependency;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    @GetMapping("laptop")
    public  String LaptopInformation()
    {
        return "it is a laptop having ... configuration";
    }
}