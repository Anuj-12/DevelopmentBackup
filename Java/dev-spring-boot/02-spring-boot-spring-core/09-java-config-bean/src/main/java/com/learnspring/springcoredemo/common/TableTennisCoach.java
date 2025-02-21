package com.learnspring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach{

    public TableTennisCoach(){

        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "idk pushups or something";
    }
}
