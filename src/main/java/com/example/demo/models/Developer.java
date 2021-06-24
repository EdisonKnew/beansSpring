package com.example.demo.models;

public class Developer {
    private String name;
    private int yearXp;

    public Developer() {

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearXp() {
        return yearXp;
    }
    public void setYearXp(int yearXp) {
        this.yearXp = yearXp;
    }
    
    @Override
    public String toString(){
        return "Developer :" + getName() + " year XP: " + getYearXp();
    }
}
