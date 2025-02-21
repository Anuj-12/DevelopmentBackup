package com.learnspring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{

    public BadmintonCoach(){

        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "10000 situps!!";
    }
}
