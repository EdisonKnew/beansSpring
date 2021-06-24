package com.example.demo.services;

public class Service {
    private String message ;

    public Service(){
        
    }

    @Override
    public String toString(){
        return "Message " + getMessage();
    }



    public String getMessage() {
        return message;
    }



    public void setMessage(String message) {
        this.message = message;
    }
    
}
