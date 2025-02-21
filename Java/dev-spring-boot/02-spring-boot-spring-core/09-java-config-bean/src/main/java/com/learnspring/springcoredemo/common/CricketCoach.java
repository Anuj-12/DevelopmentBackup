package com.learnspring.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// IDE can't determine what is being used at runtime
// That is why no usage

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){

        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "100 pushups and 100 sit ups!";
    }
}
