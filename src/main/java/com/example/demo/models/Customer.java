package com.example.demo.models;

public class Customer {
    private String nom;
    private Address adresse;

    public Customer(){
        
    }

    public Address getAdresse() {
        return adresse;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdresse(Address adresse) {
        this.adresse = adresse;
    }
    
    @Override
    public String toString(){
        return "Nom: " + getNom() + "Adresse: " + getAdresse();
    }
}
