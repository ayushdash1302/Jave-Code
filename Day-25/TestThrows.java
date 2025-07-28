//USe of throws keyword
class TestThrows
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
		}
	}
	public static void main(String args[])
	{
		System.out.println("Welcome");
		TestThrows ob = new TestThrows();
		ob.f3();
		System.out.println("Over");	
	}
}