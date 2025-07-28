//Calculator Program
class Calculator
{
	static int num1 , num2;
	static double value1,value2;
	static double result;
	Calculator()
	{
		num1 = 5;
		num2 = 2;
	}
	Calculator(double temp1, double temp2)
	{
		value1 = temp1;
		value2 = temp2;
	}
	double powerInt()
	{
		result = Math.pow(num1,num2);
		return result;
	}
	double powerDouble()
	{
		result = Math.pow(value1,value2);
		return result;
	}
	public static void main(String args[])
	{
		double res;
		Calculator ob1 = new Calculator();
		Calculator ob2 = new Calculator(3,5);
		res = ob1.powerInt();
		System.out.println("Integer value power "+res);
		res = ob2.powerDouble();
		System.out.println("Double value power "+res);
	}
}