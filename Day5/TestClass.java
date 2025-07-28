import java.util.*;
class First
{
	int no1;
	float no2;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1 ");
		no1 = sc.nextInt();
		System.out.println("Enter the number2 ");
		no2 = sc.nextFloat();
	}
	void show()
	{
		System.out.println("Number1 = "+no1);
		System.out.println("Number1 = "+no2);
	}
}
class TestClass
{
	public static void main(String args[])
	{
		First ob = new First();
		ob.input();
		ob.show();
	}
}