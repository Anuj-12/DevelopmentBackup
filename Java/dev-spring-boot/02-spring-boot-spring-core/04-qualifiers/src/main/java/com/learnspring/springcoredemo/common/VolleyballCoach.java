package com.learnspring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice 10000 spikes";
    }
}
