//GCD and LCM of two number
import java.util.*;
class GCDLCM{
	public static void main(String args[])
	{
		int no1, no2,temp1,temp2,gcd,lcm;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Frist Number");
		no1 = sc.nextInt();
		System.out.println("Enter Second Number");
		no2 = sc.nextInt();
		temp1 = no1;
		temp2 = no2;
		while(no1 !=no2)
		{ 
			if(no1 > no2)
			{
				no1 = no1-no2;
			}
			else
			{
				no2 = no2-no1;
			}
		}
		gcd = no1;
		lcm = temp1 * temp2 /gcd;
		System.out.println("GCD OF "+temp1+"and "+temp2+" is "+gcd);
		System.out.println("LCM OF "+temp1+"and "+temp2+" is "+lcm);
	}
}