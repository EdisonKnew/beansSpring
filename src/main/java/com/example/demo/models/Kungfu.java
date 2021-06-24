package com.example.demo.models;

public class Kungfu {
    private String name;

    public Kungfu(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Name " + getName();
    }

}
