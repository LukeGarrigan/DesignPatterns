package com.company;


import Condiments.Mocha;
import Condiments.Whip;

/**
 *  The decorator pattern attaches additional responsibilities to an object dynamically.
 *  Decorators provide a flexible alternative to subclassing for extending functionality
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " £" + beverage.cost());


        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " £" + houseBlend.cost());
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription() + " £" + houseBlend.cost());
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " £" + houseBlend.cost());
    }
}
