//Example of class and object

import java.util.*;
class student
{
	String name;
	int roll;
	float mark;
	void input()
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the name of student");
		name = sc.next();
		System.out.println("Enter the roll number of student");
		roll = sc.nextInt();
		System.out.println("Enter the mark of student");
		mark = sc.nextFloat();
	}
	void show()
	{
		System.out.println("Name ="+name);
		System.out.println("roll ="+roll);
		System.out.println(" mark ="+mark);
	}
	void display(String name1,int roll1,float mark1)
	{
		name = name1;
		roll = roll1;
		mark = mark1;
	}
	void assign(student st4)
	{
		name = st4.name;
		roll = st4.roll;
		mark = st4.mark;
	 }
}
class DemoStudent 
{
	public static void main(String args[])
	{
		student st1 = new student();
		st1.input();
		System.out.println("Details of first student are");
		st1.show();
		student st2 = new student();
		st2.display("AAA",98,675.432f);
		System.out.println("Details of second student are");
		st2.show();
		student st3 = new student();
		st3.assign(st2);
		System.out.println("Details of thrid student are");
		st3.show();
	}
}