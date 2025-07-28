//Use of Try-Multiple-catch Block
class TestException1
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
		catch(NumberFormatException ob)
		{
			System.out.println("Number format");
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot divide by Zero");
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("Out of Array index");
		}
		System.out.println("Over");
		System.out.println("Bye");
	}
}