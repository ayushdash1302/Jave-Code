//Join

class ThreadDemo extends Thread 
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ob)
			{
				System.out.println(ob);
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class TestMultiThreadingJoin
{
	public static void main(String args[])
	{
		ThreadDemo ob1 = new ThreadDemo();//New Thread Created
		ThreadDemo ob2 = new ThreadDemo();//New Thread Created
		ThreadDemo ob3 = new ThreadDemo();//New Thread Created
		ob1.setName("Ayush");
		ob2.setName("Tanisha");
		ob3.setName("Arpita");
		ob1.start();//Runnable state
		try
		{
			ob1.join();
		}
		catch(InterruptedException ob)
		{
			System.out.println(ob1);
		}
		ob2.start();//Runnable state
		ob3.start();//Runnable state
	}
}