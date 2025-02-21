package com.learnspring.springcoredemo;

import org.springframework.stereotype.Component;

// IDE can't determine what is being used at runtime
// That is why no usage

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "100 pushups and 100 sit ups!";
    }
}
