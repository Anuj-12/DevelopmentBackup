package com.learnspring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "10000 situps!!";
    }
}
