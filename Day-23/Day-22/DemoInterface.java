interface Test1
{
	static final int no = 20;
	void printValue();
	abstract void display();
	public abstract void show();
}
class Test2 implements Test1
{
	public void printValue()
	{
		//no++;Not allowed as final variable
		System.out.println("1 "+no);
	}
	public void display()
	{
		System.out.println("2 "+no);
	}
	public void show()
	{
		System.out.println("3 "+no);
	}
}
class DemoInterface
{
	public static void main(String args[])
	{
		Test2 ob = new Test2();
		ob.display();
		ob.printValue();
		ob.show();
	}
}
