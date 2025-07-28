//commandline Arguments in Java
class TestCommandline
{
	public static void main(String args[])
	{
		int no1 , no2;
		System.out.println("Size of args array is "+args.length);
		no1 = Integer.parseInt(args[0]);
		no2 = Integer.parseInt(args[1]);
		System.out.println("Number1 = "+no1);
		System.out.println("Number1 = "+no2);
		int res = no1 + no2;
		System.out.println("Sum is "+res);
	}
}