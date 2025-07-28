//Use of throw keyword
import java.util.*;
class DemoThrow
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int no1,no2,res;
			System.out.println("Enter first number");
			no1 = sc.nextInt();
			System.out.println("Enter second number");
			no2 = sc.nextInt();
			if(no2 == 0)
			{
				ArithmeticException ob = new ArithmeticException();
				throw ob;//Manually user throws the exception
				//throw new ArithmeticException();//
			}
			else
			{
				res = no1/no2;
				System.out.println("Result = "+res);
			}
		}
		catch(ArithmeticException ob1)
		{
			System.out.println("Cannot divide by zero");
		}
	}
}