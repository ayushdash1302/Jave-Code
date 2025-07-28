//Use of Try-catch
class TestException
{
	public static void main(String args[])
	{
		int no = 15;
		System.out.println("Welcome");
		try
		{
			int res = no/0;//Throws Object of ArithmeticException
			System.out.println("Value is "+res);
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot divide by Zero");
		}
		System.out.println("Over");
		System.out.println("Bye");
	}
}