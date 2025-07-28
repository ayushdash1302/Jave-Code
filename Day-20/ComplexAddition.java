package complex2;
import complex1.*;

public class ComplexAddition extends Complex
{
	public static void main(String args[])
	{
		Complex ob1 = new Complex();
		System.out.println("First complex number");
		ob1.show();
		Complex ob2 = new Complex(11,18);
		System.out.println("Second complex number");
		ob2.show();
		Complex ob3 = new Complex();
		ob3.add(ob1,ob2);
		System.out.println("Third complex number");
		ob3.show();
	}
}
