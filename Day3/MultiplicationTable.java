import java.util.Scanner;
 
public class MultiplicationTable
{  
public static void main(String args[])  
{  
int no,i,ans;
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number");      
   no=sc.nextInt();  
for(i=1;i <= 10;i++)
{        
     ans = no*i;
}  
System.out.println(no +" * "+ i +" = "+ ans);
}  
}