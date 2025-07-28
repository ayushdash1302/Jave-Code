//5.Write a java program that will display the largest and smallest elements of an array.

import java.util.*;

class Display 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) 
		{
            if (arr[i] < min) 
			{
                min = arr[i];
            }

            if (arr[i] > max)
			{
                max = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
