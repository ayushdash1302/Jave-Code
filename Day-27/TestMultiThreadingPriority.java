// Priority

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
class TestMultiThreadingPriority
{
	public static void main(String args[])
	{
		ThreadDemo ob1 = new ThreadDemo();//New Thread Created
		ThreadDemo ob2 = new ThreadDemo();//New Thread Created
		ThreadDemo ob3 = new ThreadDemo();//New Thread Created
		ob1.setName("Ayush");
		ob2.setName("Tanisha");
		ob3.setName("Arpita");
		System.out.println("Priority of ob1 "+ob1.getPriority());
		System.out.println("Priority of ob2 "+ob2.getPriority());
		System.out.println("Priority of ob3 "+ob3.getPriority());
		ob1.setPriority(6);
		ob2.setPriority(2);
		ob3.setPriority(9);
		ob1.start();//Runnable state
		ob2.start();//Runnable state
		ob3.start();//Runnable state
		System.out.println("Priority of ob1 "+ob1.getPriority());
		System.out.println("Priority of ob2 "+ob2.getPriority());
		System.out.println("Priority of ob3 "+ob3.getPriority());
	}
}