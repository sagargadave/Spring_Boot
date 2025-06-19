package com.Marvellous.Ganesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PPA
{
    @GetMapping("/")
    public String demo()
    {
        return "Jay Ganesh...";

    }
}