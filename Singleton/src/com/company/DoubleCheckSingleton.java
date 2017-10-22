package com.company;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 *
 * Double checked locking is used to reduce the use of synchronisation in getInstance() for multithreading
 * If performance is an issue in your use of the getInstance() method then this method of implmenting the Singleton can drastically reduce the overhead
 *
 * NOTE: Doesn't work in Java 1.4 or earlier
 */
public class DoubleCheckSingleton {

    // ensures that multiple threads handle the uniqueInstance variable correctly when it is being initialised
    private volatile static DoubleCheckSingleton uniqueInstance;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getUniqueInstance(){
        if(uniqueInstance ==null){
            synchronized (DoubleCheckSingleton.class){
                if(uniqueInstance ==null){
                    uniqueInstance = new DoubleCheckSingleton();
                }
            }
        }
        return uniqueInstance;
    }

}
