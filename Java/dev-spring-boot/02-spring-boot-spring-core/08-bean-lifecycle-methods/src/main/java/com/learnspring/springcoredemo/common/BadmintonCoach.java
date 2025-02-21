package com.learnspring.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{

    public BadmintonCoach(){

        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void startupStuff(){
        System.out.println("Bean created : " + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void destroyingStuff(){
        System.out.println("Bean destroyed : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "10000 situps!!";
    }
}
