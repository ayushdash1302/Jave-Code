//Synchronozation in Multi-Threading

class TestSynchStatic
{
	static synchronized void show(int no)
	{
		int index;
		System.out.println("Welcome");
		for(index = 1; index<=5;index++)
		{
			System.out.println(index*no);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ob)
			{
				System.out.println("Exception");

			}
		}
		System.out.println("Thank You");
		System.out.println("Over");
	}
}
class Thread1 extends Thread
{
	public void run()
	{
		TestSynchStatic.show(5);
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		TestSynchStatic.show(100);
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		TestSynchStatic.show(50);
	}
}
class Thread4 extends Thread
{
	public void run()
	{
		TestSynchStatic.show(1000);
	}
}

class DemoSynchnronizationStatic
{
	public static void main(String args[])
	{
		Thread1 ob1 = new Thread1();
		Thread2 ob2 = new Thread2();
		Thread3 ob3 = new Thread3();
		Thread4 ob4 = new Thread4();
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
	}
}