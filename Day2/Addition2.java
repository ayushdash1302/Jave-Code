//addition of 2 number

import java.util.*;
class Addition2{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);		
		int no1,no2,res;
		System.out.println("Enter first number ");
		no1 = sc.nextInt();
		System.out.println("Enter second number ");
		no2 = sc.nextInt();
		res = no1+no2;
		System.out.println("The sum of "+no1+" and "+no2+" is "+res);
	}
}
