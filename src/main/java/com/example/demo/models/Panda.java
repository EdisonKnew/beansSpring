package com.example.demo.models;

public class Panda {
    private Kungfu kungfu;

    public Panda(){
        
    }
    
    public Panda(Kungfu kungfu){
            this.kungfu = kungfu;
    }

    public Kungfu getKungfu() {
        return kungfu;
    }

    public void setKungfu(Kungfu kungfu) {
        this.kungfu = kungfu;
    }

    @Override
    public String toString(){
        return "Kungfu " + getKungfu();
    }

}
