package com.hello.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // injecting properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    // Inject properties for coach.name and team.name
    @Value("${team.name}")
    private String teamName;

    // expose an endpoint to get team info

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach : " + coachName + ", Team : " + teamName;
    }

    // expose a "/" endpoint that will return "Hello World!"

    @GetMapping("/")
    public String sayHello(){
        return "Hello there everyone!!";
    }
}
