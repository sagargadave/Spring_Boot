package com.Marvellous.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Laptop
{
    //Field Injection
    @Autowired
    Hardisk hobj;

    @Autowired
    RAM robj;

    @GetMapping("laptop")
    public  String LaptopInformation()
    {
        String h = hobj.getHardisk();
        String r = robj.GETRAM();

        String data = "Laptop configuration: " +h+" & "+r;
        return data;
    }
}