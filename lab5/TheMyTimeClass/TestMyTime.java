package hus.oop.lab5.TheMyTimeClass;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(23, 59, 59);
        MyTime time2 = new MyTime(0, 0, 0);
        System.out.print(
                time1.getHour() + ":" +  // Add ":" for better formatting
                        time1.getMinute() + ":" +
                        time1.getSecond() + "\n" +  // Add newline for better formatting
                        time2.getHour() + ":" +
                        time2.getMinute() + ":" +
                        time2.getSecond() + "\n" +
                        time1.toString() + "\n" +  // Add newline for better formatting
                        time2.toString() + "\n" +
                        time1.nextHour() + "\n" +  // Add newline for better formatting
                        time1.nextMinute() + "\n" +
                        time1.nextSecond() + "\n" +
                        time2.nextHour() + "\n" +
                        time2.nextMinute() + "\n" +
                        time2.nextSecond() + "\n" +
                        time1.previousHour() + "\n" +  // Add newline for better formatting
                        time1.previousMinute() + "\n" +
                        time1.previousSecond() + "\n" +
                        time2.previousHour() + "\n" +
                        time2.previousMinute() + "\n" +
                        time2.previousSecond()  // Remove extra semicolon
        );
    }
}
