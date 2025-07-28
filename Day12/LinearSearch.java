//linear Search in java

import java.util.*;
class LinearSearch
{
	public static void main(String[] args)
	{
		int index,size,value,count=0;
		int arr[] = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		size = sc.nextInt();
		for(index=0;index<size;index++)
		{
			System.out.println("Enter Values");
			arr[index] = sc.nextInt();
		}
		System.out.println("Values of the array is");
		for(index = 0; index < size;index++)
		{
			System.out.println(arr[index]+" ");
		}
		System.out.println("Enter the value you want to search");
		value = sc.nextInt();
		for(index=0;index<size;index++)
		{
			if(arr[index] == value)
			{
				count++;
			}
		}
		if(count == 0)
		{
			System.out.println("The value is not present");
		}
		else
		{
			System.out.println("The value "+value+" is present "+count+" times");
		}
	}
}