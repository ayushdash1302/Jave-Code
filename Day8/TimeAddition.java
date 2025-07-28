// Time Addition

import java.util.*;
class Time
{
	int hours;
	int minutes;
	int seconds;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hours:");
		hours = sc.nextInt();
		System.out.println("Enter minutes");
		minutes = sc.nextInt();
		System.out.println("Enter seconds");
		seconds = sc.nextInt();
	}
	void add(Time t1, Time t2)
	{
		//convertion
		int temp;
		hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;
        seconds = t1.seconds + t2.seconds;
		if(seconds >= 60)
		{
			temp = seconds / 60;
			seconds = seconds % 60;
			minutes = minutes + temp;
		}
		if(minutes >= 60)
		{
			temp = minutes / 60;
			minutes = minutes % 60;
			hours = hours + temp;
		}
	}
	void show() 
	{
        System.out.println("The sum is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
public class TimeAddition 
{
    public static void main(String args[]) 
	{	
	Time t1 = new Time();
        System.out.println("First time");
        t1.input();

        Time t2 = new Time();
        System.out.println("Second time");
        t2.input();

        Time t3 = new Time();
        t3.add(t1, t2);
        t3.show();
    }
}