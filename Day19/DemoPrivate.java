//Use of different access specifiers
package folder1;
class TestAccess
{
	public void f1()
	{
		System.out.println("Public");
	}
	public void f2()
	{
		System.out.println("Private");
	}
	public void f3()
	{
		System.out.println("Protected");
	}
	void f4()
	{
		System.out.println("Default");

	}
}
class DemoPrivate extends TestAccess
{
	public static void main(String args[])
	{
		DemoPrivate ob = new DemoPrivate();
		ob.f1();
		ob.f2();//Cannot access as private
		ob.f3();
		ob.f4();
	}
}