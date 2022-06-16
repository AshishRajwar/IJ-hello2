package com.example.hello2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class hello2Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello2")
    public String getHello()  {
        if (true) {
            return "Hello 22";
        } else {
            return "HELLOO 2";
        }
    }

    @GetMapping("/hello2to3")
    public String getHello23()  {
        return restTemplate.getForObject("http://thirdservice/hello3", String.class);
    }
}
