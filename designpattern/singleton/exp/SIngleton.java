package hus.oop.designpattern.singleton.exp;

class Singleton {
    private static Singleton instance;
    public String value;
    private Singleton(String value) {
        this.value = value;
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton("Hi");
        }
        return instance;
    }
}
