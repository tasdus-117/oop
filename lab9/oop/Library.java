package hus.oop.lab9.oop;

public class Library {
    Rent[] rent;
    public Library(Rent[] rent) {
        this.rent = rent;
    }
    public Rent getLongestRent() {
        Rent resmax = rent[0];
        for (int i = 1; i < rent.length; i++) {
            if ((resmax.end.getTime() - resmax.begin.getTime()) < (rent[i].end.getTime()-rent[i].begin.getTime())) {
                resmax = rent[i];
            }
        }
        return resmax;
    }
}
