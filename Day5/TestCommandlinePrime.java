//commandline Arguments for Prime in Java
class TestCommandlinePrime
{
	public static void main(String args[])
	{
		int no, count=0, value;
		System.out.println("Enter a Number");
		no = Integer.parseInt(args[0]);
		for(value=1;value<=no;value++)
		{
			if(no%value == 0)
			{
				count++;//1 2
			}
		}
		if(count == 2)
		{
			System.out.println(no+" is prime number");
		}
		else
		{
			System.out.println(no+" is not a prime number");
		}
	}
}