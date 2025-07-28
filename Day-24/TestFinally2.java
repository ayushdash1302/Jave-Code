//Use of finally Keyword(Case-3- Exception generated and not-handled)

class TestFinally2
{
	public static void main(Strings args[])
	{
		int no = 15;
		System.out.println("Welcome");
		try
		{
			int res = no/0;
		    System.out.println("Value is "+res);
		}	
		catch(NumberFormatException ob)
		{
			System.out.println("Number format error");
		}
		finally
		{
			System.out.println("Finally block executed");
		}
	}
	System.out.println("Over");
	System.out.println("Bye");
}