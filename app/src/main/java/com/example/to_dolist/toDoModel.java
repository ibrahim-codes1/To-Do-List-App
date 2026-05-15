package com.example.to_dolist;

public class toDoModel {
    private String task;
    private boolean isDone;

    // Constructor
    public toDoModel(String task, boolean isDone){
        this.task = task;
        this.isDone = isDone;
    }

    public String getTask(){
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isDone(){
        return isDone;
    }

    public void setDone(boolean done){
        this.isDone = done;
    }
}
