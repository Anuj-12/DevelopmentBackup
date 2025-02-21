package com.learnspring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{

    public VolleyballCoach(){

        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 10000 spikes";
    }
}
