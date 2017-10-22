package com.company;

/**
 *
 *  The observer pattern defines a one-to-many dependency between objects so that when one objects changes state, all of
 *  its dependents are notified and updated automatically
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here

        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2(concreteSubject);
        concreteSubject.setNumber(10);
        concreteSubject.setNumber(12);
    }
}
