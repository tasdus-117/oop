package hus.oop.designpattern.observer;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println("OctalObserver new update: " + subject.getState());
    }
}
