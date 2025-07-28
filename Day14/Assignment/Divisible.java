//4.Write a java program that will read an array of elements and display the elements, those are divisible by 2
import java.util.*;

class Divisible 
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
        System.out.println("Elements divisible by 2:");
        for (int i = 0; i < n; i++)
			{
            if (arr[i] % 2 == 0) 
			{
                System.out.print(arr[i] + " ");
            }
        }
	}
}
