package hus.oop.lab11.observer;

import hus.oop.designpattern.observer.Observer;
import hus.oop.designpattern.observer.Subject;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println("OctalObserver new update: " + subject.getState());
    }
}
