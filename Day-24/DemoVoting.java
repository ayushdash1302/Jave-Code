//User defined exception

import java.util.*;
class TestVoting extends Exception
{
	String str;
	TestVoting()
	{
		
	}
	TestVoting(String str)
	{
		
		this.str = str;
	}
	public String toString()
	{
		return str;
	}
}
class DemoVoting
{
	static void validate(int age) throws TestVoting
	{
		if(age >= 18)
		{
			System.out.println("Welcome to cast your vote");
		}
		else
		{
			throw new TestVoting("Voting is not allowed");
		}
	}
	public static void main(String args[])
	{
		int age;
		System.out.println("Enter age ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		try
		{
			validate(age);
		}
		catch(TestVoting ob)
		{
			System.out.println("As age is less than 18 so "+ob);
		}
	}
}