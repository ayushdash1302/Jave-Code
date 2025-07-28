//Inter thread communication
class AccountClass
{
	int balance;
	synchronized void withdraw(int amount)
	{
		System.out.println("Before withdraw amount is "+balance);
		if(amount > balance)
		{
			System.out.println("Low balance so waiting");
			try
			{
				wait();
			}
			catch(Exception ob)
			{
				System.out.println("Wait method");
			}
			System.out.println("Amount is available so waiting over");
			balance = balance-amount;
			System.out.println("After withdraw amount is "+balance);
		}
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Before deposit amount is "+balance);
		balance = balance+amount;
		System.out.println("Deposit over and balance is "+balance);
		try
		{
			notify();
		}
		catch(Exception ob)
		{
			System.out.println("Notify method");
		}
	}
}
class Student extends Thread
{
	AccountClass ob;
	Student(AccountClass ob)
	{
		this.ob = ob;
	}
	public void run()
	{
		ob.withdraw(25000);
	}
}
class Home extends Thread
{
	AccountClass ob;
	Home(AccountClass ob)
	{
		this.ob = ob;
	}
	public void run()
	{
		ob.deposit(35000);
	}
}
class InterThreadCommunication
{
	public static void main(String args[])
	{
		AccountClass ob = new AccountClass();
		Student ob1 = new Student(ob);
		Home ob2 = new Home(ob);
		ob1.start();
		ob2.start();
	}
}