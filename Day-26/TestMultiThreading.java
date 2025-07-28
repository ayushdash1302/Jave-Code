//Create a thread by extending thread class

class ThreadDemo extends Thread 
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
class TestMultiThreading
{
	public static void main(String args[])
	{
		ThreadDemo ob1 = new ThreadDemo();//New Thread Created
		ThreadDemo ob2 = new ThreadDemo();//New Thread Created
		ThreadDemo ob3 = new ThreadDemo();//New Thread Created
		ob1.start();//Runnable state
		ob2.start();//Runnable state
		ob3.start();//Runnable state
		
	}
}