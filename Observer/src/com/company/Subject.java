package com.company;


/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public interface Subject {

    void registerObserver(Observer observer);

    void remoteObserver(Observer observer);

    void notifyObservers();

}
