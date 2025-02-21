package com.learnspring.springcoredemo.rest;

import com.learnspring.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency

    private Coach myCoach;

    @Autowired
    public void setCoach(Coach myCoach){
        this.myCoach = myCoach;
    }

    // Going on this endpoint calls the getDailyWorkout method of the coach object

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
