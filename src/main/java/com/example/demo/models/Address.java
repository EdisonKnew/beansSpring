package com.example.demo.models;

public class Address {
    private String adresse;

    public Address(){
        
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString(){
        return "Adresse: " + getAdresse();
    }
}
