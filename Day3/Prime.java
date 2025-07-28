//check a no. is prime or not

import java.util.*;
class Prime{
	public static void main(String args[])
	{
		int no, count=0, value;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		no = sc.nextInt();//7
		for(value=1;value<=no;value++)
		{
			if(no%value == 0)
			{
				count++;//1 2
			}
		}
		if(count == 2)
		{
			System.out.println(no+" is prime number");
		}
		else
		{
			System.out.println(no+" is not a prime number");
		}
	}
}
	