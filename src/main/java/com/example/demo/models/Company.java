package com.example.demo.models;

public class Company {
    private String name;
    private Developer cp;
    private Developer dev;

    public Company() {

    }
    public Developer getDev() {
        return dev;
    }
    public void setDev(Developer dev) {
        this.dev = dev;
    }
    public Developer getCp() {
        return cp;
    }
    public void setCp(Developer cp) {
        this.cp = cp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    @Override
    public String toString(){
        return "Company :" + getName() + " cp " + getCp() + "dev " + getDev();
    }
    
    
}
