package Timeaddition1;
import Timeaddition.*;
class Timeadd {
    public static void main(String args[]) {
        Time t1 = new Time();
        System.out.println("First time");
        t1.show();

        Time t2 = new Time(2, 15, 30);
        System.out.println("Second time");
        t2.show();

        Time t3 = new Time();
        t3.add(t1, t2);
        System.out.println("Sum of times:");
        t3.show();
    }
}
