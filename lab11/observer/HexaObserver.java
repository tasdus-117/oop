package hus.oop.lab11.observer;

import hus.oop.designpattern.observer.Observer;
import hus.oop.designpattern.observer.Subject;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
    }
    public void update() {
        System.out.println("HexaObserver new update: " + subject.getState());
    }
}
