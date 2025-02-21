package com.learnspring.springcoredemo.rest;

import com.learnspring.springcoredemo.common.BadmintonCoach;
import com.learnspring.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("badmintonCoach") Coach myCoach,
                          @Qualifier("badmintonCoach") Coach anotherCoach){
        System.out.println("In constructor : " + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    // Going on this endpoint calls the getDailyWorkout method of the coach object

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Is myCoach == anotherCoach : " + (myCoach == anotherCoach);
    }
}
