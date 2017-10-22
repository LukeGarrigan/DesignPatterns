package com.company;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){}


    public static Singleton getUniqueInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return "Singleton{}";
    }
}
