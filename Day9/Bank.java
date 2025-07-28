//Customer Bank Balance

import java.util.*;
class Customer
{
	String name;
	int acno;
	float balance;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter account number ");
		acno = sc.nextInt();
		System.out.println("Enter balance");
		balance = sc.nextFloat();
	}
	void show()
	{
		System.out.println("Name = "+name);
		System.out.println("Acount Number = "+acno);
		System.out.println("Balance = "+balance);
	}
	void deposit()
	{
		int amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		amount = sc.nextInt();
		balance = balance + amount;
	}
	void withdraw()
	{
		int amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		amount = sc.nextInt();
		balance = balance - amount;
	}
}
class Bank
{
	public static void main(String args[])
	{
		Customer ob1 = new Customer();
		ob1.input();
		ob1.show();
		ob1.deposit();
		System.out.println("After deposit the updated details of the customer is ");
		ob1.show();
		ob1.withdraw();
		System.out.println("After withdraw the updated details of the customer is ");
		ob1.show();
	}
}