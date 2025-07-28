// Addition of two complex numbers
import java.util.*;
class Complex
{
	int real;
	int img;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real value");
		real = sc.nextInt();
		System.out.println("Enter imaginary value");
		img = sc.nextInt();
	}
	void add(Complex ob1, Complex ob2)
	{
		real = ob1.real + ob2.real;
		img = ob1.img + ob2.img;
	}
	void show()
	{
		System.out.println("The sum is "+real+" + "+img+" i");
	}
}
class ComplexAddition
{
	public static void main(String args[])
	{
		Complex ob1 = new Complex();
		System.out.println("First complex number");
		ob1.input();
		Complex ob2 = new Complex();
		System.out.println("Second complex number");
		ob2.input();
		Complex ob3 = new Complex();
		ob3.add(ob1,ob2);
		ob3.show();
	}
}
		