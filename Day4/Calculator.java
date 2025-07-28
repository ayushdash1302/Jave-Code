import java.util.*;
class 	Calculator
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int no1,no2,res,option;
		System.out.println("Welcome to the operations of calculator");
		while(true)
		{
			System.out.println("Enter First number");
			no1 = Sc.nextInt();
			System.out.println("Enter second number");
			no2 = Sc.nextInt();
			System.out.println("1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Modulus\n 6.Exit\n");
			System.out.println("Enter your choice: ");
			option = Sc.nextInt();
			switch(option)
			{
				case 1:
					res = no1 + no2;
					System.out.println("Sum is"+res);
					break;
				case 2:
					res = no1 - no2;
					System.out.println("Substraction is"+res);
					break;
				case 3:
					res = no1 * no2;
					System.out.println("Multiplication is"+res);
					break;
				case 4:
					res = no1 / no2;
					System.out.println("Division is"+res);
					break;
				case 5:
					res = no1 % no2;
					System.out.println("Modulus is"+res);
					break;
				case 6:
					System.exit(0);
					default:
					System.out.println("Wrong Choice");
			}
		}
	}
}
					
					
					
			