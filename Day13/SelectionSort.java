//Selection Sort in Java

import java.util.*;
class SelectionSort
{
	public static void main(String[] args)
	{
		int index,size,min,i,j,count=0;
		int arr[] = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		size = sc.nextInt();
		for(index=0;index<size;index++)
		{
			System.out.println("Enter Values");
			arr[index] = sc.nextInt();
		}
		System.out.println("\n values of array before sorting is");
		for(index=0;index<size;index++)
		{
			System.out.println(arr[index]+" ");
		}
		//Selection Sort
		for(i=0;i<size;i++)//Total rounds
		{
			min=i;
			for(j=i;j<size;j++)//Single rounds
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
					
			}
			if(i!=min)
			{
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		System.out.println("Values of the array after sorting is");
		for(index=0;index<size;index++)
		{
			System.out.println(arr[index]+" ");
		}
	}
}
		