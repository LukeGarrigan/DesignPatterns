package com.company;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
