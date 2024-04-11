package hus.oop.designpattern.observer;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
    }
    public void update() {
        System.out.println("HexaObserver new update: " + subject.getState());
    }
}
