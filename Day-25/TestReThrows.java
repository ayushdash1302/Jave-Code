//USe of Re-throws keyword
class TestReThrows
{
	void f1()throws ArithmeticException
	{
		int no=10;
		int res=no/0;
	}
	void f2() throws ArithmeticException
	{
		f1();
	}
	void f3()
	{
		try
		{
			f2();
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot divide by Zero");
			throw ob;//Rethrows
		}
	}
	public static void main(String args[])
	{
		System.out.println("Welcome");
		TestReThrows ob = new TestReThrows();
		try
		{
			ob.f3();
		}
		catch(ArithmeticException ob1)
		{
			System.out.println("Exception caught again");
		}
		System.out.println("Over");	
	}
}