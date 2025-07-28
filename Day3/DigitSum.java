//DigitSum
import java.util.Scanner;  
public class DigitSum
{  
    public static void main(String args[])
{    
        int no,sum=0,digit;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a number");  
        no = sc.nextInt();
while(no != 0)
{
digit = no%10;
sum = sum + digit;
no = no/10;
}
System.out.println("Sum is" + sum);
}
}