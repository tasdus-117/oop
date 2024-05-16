package hus.oop.lab11.observer;

import hus.oop.designpattern.observer.BinaryObserver;
import hus.oop.designpattern.observer.HexaObserver;
import hus.oop.designpattern.observer.Observer;
import hus.oop.designpattern.observer.OctalObserver;
import hus.oop.designpattern.observer.Subject;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        hus.oop.designpattern.observer.Subject subject = new Subject();

        hus.oop.designpattern.observer.Observer binObserver = new BinaryObserver(subject);
        hus.oop.designpattern.observer.Observer hexObserver = new HexaObserver(subject);
        Observer octObserver = new OctalObserver(subject);
        subject.attach(binObserver);
        subject.attach(hexObserver);
        subject.attach(octObserver);

        subject.setState(1);
        subject.notifyAllObservers();
        subject.setState(2);
        subject.notifyAllObservers();
        subject.setState(3);
        subject.notifyAllObservers();
    }
}
