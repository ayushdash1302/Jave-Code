//Array in java

class TestArray
{
		public static void main(String[] args)
		{
			int index;
			//int arr[] = new int[5];
			int arr[];//Array declaration
			arr = new int[5];//How many memory is required
			//Initialization of array
			arr[0] = 10;
			arr[2] = 20;
			arr[4] = 60;
			System.out.println("Values of the array is");
		    for(index = 0; index < 5;index++)
			{
				System.out.println(arr[index]+" ");
			}
		}
}