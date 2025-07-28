//Use of finally Keyword(Case-2- Exception not generated)

class TestFinally1
{
	public static void main(Strings args[])
	{
		int no = 15;
		System.out.println("Welcome");
		try
		{
			int res = no/5;
		    System.out.println("Value is "+res);
		}	
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot divide by zero");
		}
		finally
		{
			System.out.println("Finally block executed");
		}
	System.out.println("Over");
	System.out.println("Bye");
}