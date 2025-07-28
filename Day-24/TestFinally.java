//Use of finally Keyword(Case-1- Exception generated and handled)

class TestFinally
{
	public static void main(Strings args[])
	{
		int no = 15;
		System.out.println("Value is "+res);
	}
	catch(ArithmeticException ob)
	{
		System.out.println("Cannot divide by zero");
	}
	finally
	{
		System.out.println("Finally catch block executed");
	}
	System.out.println("Over");
	System.out.println("Bye");
}