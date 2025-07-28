//arrayname.lenght in java

class TestArray2
{
		public static void main(String[] args)
		{
			int index,len;
			
			int arr[] = {11,22,33,44,55,66};
			len = arr.length;
			System.out.println("Total number of elements in array is"+len);
			System.out.println("Values of the array is");
		    for(index = 0; index <arr.length;index++)
			{
				System.out.println(arr[index]+" ");
			}
		}
}