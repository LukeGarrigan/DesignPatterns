package com.company;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(Singleton.getUniqueInstance());

        System.out.println(EagerSingleton.getUniqueInstance());

        System.out.println(SynchronisedSingleton.getUniqueInstance());
    }
}
