package com.learnspring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "idk pushups or something";
    }
}
