package com.example.demo.models;

public class FoodPantry {
    private String name;
    private int nbProducts;
    private float weight;


    public FoodPantry(String name, int nbProducts, float weight){
        this.setName(name);
        this.setNbProducts(nbProducts);
        this.setWeight(weight);
    }


    public float getWeight() {
        return weight;
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getNbProducts() {
        return nbProducts;
    }


    public void setNbProducts(int nbProducts) {
        this.nbProducts = nbProducts;
    }

    
}
