package com.company;

import java.util.ArrayList;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;
    private int number;
    public ConcreteSubject(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remoteObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >=0){
            observers.remove(observer);
        }
    }

    /**
     *  update all the observers with the new number
     */
    @Override
    public void notifyObservers() {
       for(Observer observer: observers){
           observer.update(number);
       }
    }

    public void setNumber(int number){
       this.number = number;
       notifyObservers();
    }
}
