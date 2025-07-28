// check a no. is Armstrong or not

import java.util.*;
class Armstrong{
	public static void main(String args[])
	{
		int no, value,len=0, digit;
		double sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		no = sc.nextInt();
		value = no;
		while(no != 0)
		{
			len++;
			no = no/10;
		}
		no = value;
		while(no != 0)
		{
			digit = no%10;
			sum = Math.pow(digit,len)+sum;
			no = no/10;
		}
		if(value == sum)
		{
			System.out.println(value+" is an armstrong number");
		}
		else
		{
			System.out.println(value+" is not an armstrong number");
		}
	}
}