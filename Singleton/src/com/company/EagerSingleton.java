package com.company;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 *
 */
public class EagerSingleton {

    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getUniqueInstance(){
        return uniqueInstance;
    }


    @Override
    public String toString() {
        return "EagerSingleton{}";
    }
}
