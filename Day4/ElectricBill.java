import java.util.*;
class ElectricBill
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int prev,curr,unit;
		double price;
		System.out.println("Enter the previous meter reading");
		prev = Sc.nextInt();
		System.out.println("Enter the current meter reading");
		curr = Sc.nextInt();
		if(prev>=curr)
		{
			System.out.println("Wrong input");
		}
		else
		{
			unit = curr - prev;
			if(unit <= 100)
			{
				price = unit * 3.75;
			}
			else if(unit > 100 && unit<= 200)
			{
				price = 100 * 3.75 + (unit - 100)*4.25;
			}
			else if(unit > 200 && unit <=300)
			{
				price = 100 * 3.75 + 100 * 4.25 + (unit - 200) * 5.5;
			}
			else
			{
				
				price = 100 * 3.75 + 100 * 4.25 + 100 * 5.5 + (unit - 300)*6.75;
			}
			System.out.println("Electric Bill amount is "+price);
		}
	}
}