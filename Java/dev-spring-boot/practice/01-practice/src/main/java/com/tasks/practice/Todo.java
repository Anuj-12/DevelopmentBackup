package com.tasks.practice;

import java.util.ArrayList;

public class Todo {

    private ArrayList<String> todoList = new ArrayList<String>();
    private ArrayList<String> tadaList = new ArrayList<String>();

    public void setTasks(String newTask){

        todoList.add(newTask);
    }

    public void setDone(String doneTask){

        tadaList.add(doneTask);
    }

    public String getTasks(){

        return todoList.toString();
    }

    public String getDone(){

        return tadaList.toString();
    }
}
