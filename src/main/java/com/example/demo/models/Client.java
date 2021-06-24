package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Client {
    private String action;
    private int type;

    @Autowired
    private Person person;

    public Client(String action, int type) {
        this.action = action;
        this.type = type;
    }

    public Person getPerson() {
        return person;
    }
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString(){
        return "Client: " + getAction() + " Type:" + getType() + getPerson();
    }
    
}
