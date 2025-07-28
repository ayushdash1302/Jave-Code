//Power
import java.util.*;
class Power
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int x, y, result =1,count =1 ;
		System.out.println("Enter the value of x");
		x = Sc.nextInt();
		System.out.println("Enter the value of y");
		y = Sc.nextInt();
		while (count<=y){
			result = result * x;
			count++;
		}
		System.out.println("Result is "+result);
	}
}