//FibonacciSeries
import java.util.*;
class FibonacciSeries
{
  public static void main(String args[])
  {
    int n;
	int i=0,j=1,k=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a range");
    n = sc.nextInt();
    // k=i+j;
    while(k <= n)
  {
    System.out.println(k);
    i=j;
    j=k;
    k=i+j;
   }
  }
}