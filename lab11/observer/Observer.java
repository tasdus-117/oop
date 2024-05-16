package hus.oop.lab11.observer;

import hus.oop.designpattern.observer.Subject;

public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
