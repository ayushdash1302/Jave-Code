//FactorialA
import java.util.Scanner;  
public class FactorialA
{  
    public static void main(String args[])
{    
        int num,fact = 1;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a number");  
        num = sc.nextInt();
        System.out.println("Factorial of " + num + " is ");  
        while( num > 1  )
{  
            fact = num * fact;  
            num--;
        }    
        System.out.println(fact);  
    }  
}