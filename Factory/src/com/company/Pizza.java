package com.company;

import com.company.Ingredients.Dough;
import com.company.Ingredients.Sauce;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    ArrayList<String> toppings = new ArrayList<>();

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official Pizza Store box");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
