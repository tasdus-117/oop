package hus.oop.lab11.observer;

import hus.oop.designpattern.observer.Observer;
import hus.oop.designpattern.observer.Subject;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
    }
    public void update() {
        System.out.println("BinaryObserver new update: " + subject.getState());
    }
}
