//Create a thread by implementing the Runnable interface

class ThreadDemo1 implements Runnable 
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class TestMultiThreadingRunnable
{
	public static void main(String args[])
	{
		ThreadDemo1 ob1 = new ThreadDemo1();//New Thread Created
		ThreadDemo1 ob2 = new ThreadDemo1();//New Thread Created
		ThreadDemo1 ob3 = new ThreadDemo1();//New Thread Created
		Thread obj1 = new Thread(ob1);
		Thread obj2 = new Thread(ob2);
		Thread obj3 = new Thread(ob3);
		obj1.start();//Runnable state
		obj2.start();//Runnable state
		obj3.start();//Runnable state
		
	}
}