package com.company;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class ConcreteObserver implements Observer {

    private int number;
    public ConcreteObserver(ConcreteSubject concreteSubject){
        concreteSubject.registerObserver(this);
    }
    @Override
    public void update(int number) {
        this.number = number;
        System.out.println("Concrete Observer 1: "+ number);
    }
}
