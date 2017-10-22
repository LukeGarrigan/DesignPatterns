package com.company;

import Characters.King;
import Characters.Character;
import Characters.Troll;

/**
 *  This small program shows an easy way to implement the Strategy pattern
 *  Program to an interface, not an implementation!
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Character king = new King();
        king.fight();

        Character troll = new Troll();
        troll.fight();

    }
}
