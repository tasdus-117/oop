package hus.oop.lab11.observer;
import hus.oop.designpattern.observer.Observer;

import java.util.List;
import java.util.LinkedList;
public class Subject {
    private List<Observer> observers;
    private int state;
    public Subject() {
        state = 0;
        observers = new LinkedList<>();
    }
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
