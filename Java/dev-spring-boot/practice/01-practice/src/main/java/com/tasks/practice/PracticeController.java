package com.tasks.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

    private Todo todo = new Todo();
    private Coffee coffee = new Coffee();

   //@Autowired
    //public PracticeController(Todo todo, Coffee coffee){
        //this.todo = todo;
        //this.coffee = coffee;
    //}

    // Creating a new endpoint for pending todo list

    @GetMapping("/todo")
    public String getTasks(){
        todo.setTasks("");
        return todo.getTasks();
    }

    // Creating a new endpoint for the completed tasks

    @GetMapping("/done")
    public String getDone(){
        todo.setDone("Drink Coffee!");
        todo.setDone("Revise all the previous things studied");
        return todo.getDone();
    }

    // Creating a new enpoint for the number of coffee cups

    @GetMapping("/coffeecount")
    public String getCoffeeCount(){
        return coffee.getCoffeeCount();
    }
}
