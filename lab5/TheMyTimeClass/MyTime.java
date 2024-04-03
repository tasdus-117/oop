package hus.oop.lab5.TheMyTimeClass;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    public MyTime() {

    }
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public String toString() {
        String outHour = (hour < 10) ? "0" + hour : String.valueOf(hour);
        String outMinute = (minute < 10) ? "0" + minute : String.valueOf(minute);
        String outSecond = (second < 10) ? "0" + second : String.valueOf(second);
        return outHour + ":" + outMinute + ":" + outSecond;
    }
    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    public MyTime nextMinute() {
        if (minute == 59) {
            minute = 0;
            if (hour == 23) {
                hour = 0;
            } else {
                hour += 1;
            }
        } else {
            minute += 1;
        }
        return this;
    }
    public MyTime nextHour() {
        hour = (hour == 23) ? 0:hour+1;
        return this;
    }
    public MyTime previousSecond() {
        if (second == 0) {
            second = 59;
            if (minute == 0) {
                minute = 59;
                if (hour == 0) {
                    hour = 23;
                } else {
                    hour -= 1;
                }
            } else {
                minute -= 1;
            }
        } else {
            second -= 1;
        }
        return this;
    }
    public MyTime previousMinute() {
        if (minute == 0) {
            minute = 59;
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
        } else {
            minute -= 1;
        }
        return this;
    }
    public MyTime previousHour() {
        hour = (hour == 0) ? 23:hour-1;
        return this;
    }
}
