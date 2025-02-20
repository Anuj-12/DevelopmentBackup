package com.hello.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose a "/" endpoint that will return "Hello World!"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Jumping jacks for 10 hours!!";
    }

    // expose a "fortune" endpoint

    @GetMapping("/fortune")
    public String getFortune(){
        return "Its your lucky day";
    }
}
