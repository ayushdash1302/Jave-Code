// check a number is palindrome or not

import java.util.*;
class Palindrome{
	public static void main(String args[])
	{
		int no, value, rev=0, digit;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		no = sc.nextInt();
		value = no;
		while(no != 0)
		{
			digit = no%10;
			rev = rev *10 + digit;
			no = no/10;
		}
		if(rev==value)
		{
			System.out.println(value+" is a palindrome number");
		}
		else
		{
			System.out.println(value+" is not a palindrome number");
		}
	}
}