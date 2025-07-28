//package in timeaddition
package Timeaddition;
import java.util.*;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time() {
        hours = 5;
        minutes = 30;
        seconds = 45;
    }

    public Time(int hours1, int minutes1, int seconds1) {
        hours = hours1;
        minutes = minutes1;
        seconds = seconds1;
    }

    public void add(Time t1, Time t2) {
        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;
        seconds = t1.seconds + t2.seconds;
    }

    public void show() {
        System.out.println("Time is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}