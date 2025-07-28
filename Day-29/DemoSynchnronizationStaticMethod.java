//Synchronozation in Multi-Threading

class TestSynch
{
	synchronized void show(int no)
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
	TestSynch ob;
	Thread1(TestSynch ob)
	{
		this.ob = ob;
	}
	public void run()
	{
		ob.show(5);
	}
}
class Thread2 extends Thread
{
	TestSynch ob;
	Thread2(TestSynch ob)
	{
		this.ob = ob;
	}
	public void run()
	{
		ob.show(100);
	}
}
class Thread3 extends Thread
{
	TestSynch ob;
	Thread3(TestSynch ob)
	{
		this.ob = ob;
	}
	public void run()
	{
		ob.show(50);
	}
}
class Thread4 extends Thread
{
	TestSynch ob;
	Thread4(TestSynch ob)
	{
		this.ob = ob;
	}
	public void run()
	{
		ob.show(1000);
	}
}

class DemoSynchnronizationStaticMethod
{
	public static void main(String args[])
	{
		TestSynch ob = new TestSynch();
		Thread1 ob1 = new Thread1(ob);
		Thread2 ob2 = new Thread2(ob);
		TestSynch obj = new TestSynch();
		Thread3 ob3 = new Thread3(obj);
		Thread4 ob4 = new Thread4(obj);
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
	}
}