package com.learnspring.springcoredemo.common;

// Instead of @Component
//--Alternate Solution --

public class SwimCoach implements Coach{

    public SwimCoach(){

        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run head first into a wall";
    }
}
