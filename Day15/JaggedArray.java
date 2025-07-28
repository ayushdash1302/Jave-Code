//jagged multi dimensional array

import java.util.*;
class JaggedArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[5];
		for(int row = 0;row<arr.length;row++)
		{
			for(int col = 0;col<arr[row].length;col++)
			{
				System.out.print("Enter value");
				arr[row][col] = sc.nextInt();
			}
		}
		System.out.print("Values of the array are");
		for(int row = 0;row<arr.length;row++)
		{
			for(int col = 0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}