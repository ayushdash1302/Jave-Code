//Example of class and object

import java.util.*;
class Employee
{
	//Data members
	String name;
	int age;
	float salary;
	//Method
	void input()
	{
		Scanner sc = new  Scanner(System.in);//Take input from keyboard
		System.out.println("Enter name ");
		name = sc.next();
		System.out.println("Enter age ");
		age = sc.nextInt();
		System.out.println("Enter salary ");
		salary = sc.nextFloat();
	}
	void assign(String name1,int age1,float salary1)
	{
		name = name1;
		age = age1;
		salary =salary1;
	}
	void provideValue(Employee ob2)
	{
		name = ob2.name;
		age = ob2.age;
		salary =ob2.salary;
	}
	void show()
	{
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
		System.out.println("Salary ="+salary);
	}
}
class DemoEmployee 
{
	public static void main(String args[])
	{
		Employee ob1 = new Employee();
		System.out.println("First Employee Details");
		ob1.input();
		Employee ob2 = new Employee();
		System.out.println("Second Employee Details");
		ob2.input();
		Employee ob3 = new Employee();
		System.out.println("Third Employee Details");
		ob3.assign("Arya",35,4567.98f);//Passing data through method
		Employee ob4 = new Employee();
		System.out.println("Fourth Employee Details");
		ob4.provideValue(ob2);//Passing object through method
		System.out.println("Details of first employee are ");
		System.out.println("----------------------------- ");
		ob1.show();
		System.out.println("Details of second employee are ");
		System.out.println("------------------------------ ");
		ob2.show();
		System.out.println("Details of third employee are ");
		System.out.println("----------------------------- ");
		ob3.show();
		System.out.println("Details of fourth employee are ");
		System.out.println("----------------------------- ");
		ob4.show();
	}
}