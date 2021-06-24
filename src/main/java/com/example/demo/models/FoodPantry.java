package com.example.demo.models;

public class FoodPantry {
    private String name;
    private int nbProducts;
    private int nbProducts2;
    private float weight;


    public FoodPantry(String name, int nbProducts,int nbProducts2,  float weight){
        this.setName(name);
        this.setNbProducts(nbProducts);
        this.setNbProducts2(nbProducts2);
        this.setWeight(weight);
    }


    public int getNbProducts2() {
        return nbProducts2;
    }


    public void setNbProducts2(int nbProducts2) {
        this.nbProducts2 = nbProducts2;
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


    @Override
    public String toString(){
        return "FoodPantry :" + getName() + " Nb products: " + getNbProducts2() + " Nb products2: " + getNbProducts() + " weight:" + getWeight();
    }

    
}
