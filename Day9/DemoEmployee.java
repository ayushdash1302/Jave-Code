//Employee Salary

import java.util.*;
class Employee
{
	String name;
	int empid;
	double basic;
	double gross;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter Employee id ");
		empid = sc.nextInt();
		System.out.println("Enter basic salary");
		basic = sc.nextDouble();
	}
	void show()
	{
		System.out.println("Name = "+name);
		System.out.println("Employee id = "+empid);
		System.out.println("Gross salary = "+gross);
	}
	void calculateSalary()
	{
		double da,hra,ta,tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of hra :");
		hra = sc.nextDouble();
		System.out.println("Enter the amount of da :");
		da = sc.nextDouble();
		System.out.println("Enter the amount of ta :");
		ta = sc.nextDouble();
		System.out.println("Enter the amount of tax :");
		tax = sc.nextDouble();
		gross = basic + (basic * hra/100.0) + (basic * da/100.0) + (basic * ta/100.0) - (basic * tax/100.0);
	}
}
class DemoEmployee
{
	public static void main(String args[])
	{
		Employee ob1 = new Employee();
		ob1.input();
		ob1.calculateSalary();
		System.out.println("After calculation details of the employee is ");
		ob1.show();
		Employee ob2 = new Employee();
		ob2.input();
		ob2.calculateSalary();
		System.out.println("After calculation details of the employee is ");
		ob2.show();
	}
}
