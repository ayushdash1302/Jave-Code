abstract class Test1
{
	void printValue()
	{
		System.out.println("Test1 class");
	}
	abstract void display();
	abstract void show();
}
abstract class Test2 extends Test1
{
	void display()
	{
		System.out.println("Test2 class");
	}
}
class Test3 extends Test2
{
	void show()
	{
		System.out.println("Test3 class");
	}
}
class DemoAbstract
{
	public static void main(String args[])
	{
		Test3 ob = new Test3();
		ob.printValue();
		ob.show();
		ob.display();
	}
}