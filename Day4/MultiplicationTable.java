//MultiplicationTable
import java.util.*;
class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int no, res =0,count =1 ;
		System.out.println("Enter the value of number");
		no = Sc.nextInt();
		System.out.println("Multiplication Table of"+no+" is ");
		while (count<=10)
		{
			res = no*count;
			System.out.println(no+"*"+count+"= "+res);
			count++;
		}
	}
}