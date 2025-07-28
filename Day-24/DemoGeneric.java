//Generic Catch Block
class DemoGeneric
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Welcome");
			int no = 10;
			int res = no/5;
			System.out.println("Result = "+res);
			int arr[]= new int[1];
			arr[1] = 20;//Exception generated
			System.out.println(arr[1]);
		}
		catch(NumberFormatException ob)
		{
			System.out.println("Number format is wrong");
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("Out of boundary");
		}
		//Generic Catch Block
		catch(Exception ob)
		{
			System.out.println("Generic Exception");
		}
	}
}