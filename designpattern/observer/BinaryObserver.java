package hus.oop.designpattern.observer;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
    }
    public void update() {
        System.out.println("BinaryObserver new update: " + subject.getState());
    }
}
