package com.company;
/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class SynchronisedSingleton {

    private static SynchronisedSingleton uniqueInstance;

    private SynchronisedSingleton(){}

    public static synchronized SynchronisedSingleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SynchronisedSingleton();
        }
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return "SynchronisedSingleton{}";
    }
}
