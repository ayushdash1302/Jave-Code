//Nested try block
//Outer try block - outer catch block
//Inner try block - inner catch block, if not then outer-catch block
class NestedTry
{
	public static void main(String args[])
	{
		//Outer try-catch block
		try
		{
			System.out.println("Welcome");
			int no = 15;
			int res = no/5;
			System.out.println("Result = "+res);
			//Inner try-catch block
			try
			{
				int arr[]= new int[1];
				arr[1] = 20;//Exception generated
				System.out.println(arr[1]);
			}
			catch(ArithmeticException ob)
			{
				System.out.println("Cannot divide by zero");
			}
		}
		catch(NumberFormatException ob)
		{
			System.out.println("Number format is wrong");
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("Out of boundary");
		}
		System.out.println("Over");
	}
}