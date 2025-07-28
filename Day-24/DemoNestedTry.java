//Nested try block

class DemoNestedTry
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Welcome");
			int no = 15;
			int res = no/0;//Throws Object of ArithmeticException
			System.out.println("Result = "+res);
			int arr[]= new int[1];
			arr[1] = 20;//ArrayIndexOutOfBoundsException
			System.out.println(arr[1]);
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("Out of boundary");
		}
		System.out.println("Over");
	}
}