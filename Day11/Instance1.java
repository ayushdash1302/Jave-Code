// INSTANCE VARIABLE or NON-STATIC VARIABLE IN JAVA with LOCAL VARIABLE, Temp and static
{
	//Instance variable
	int no;
	float value;
	// static variable
	static int count;
	void show() //Non-static mathod
	{
		int temp = 20;//local variable
		System.out.println("Number is "+no);
		System.out.println("Value is "+value);
		System.out.println("Temp = "+temp);
		System.out.println("Static Variable Count = "+count);
	}
	static void display()
	{
		System.out.println("Inside static method is "+count);
	}
	public static void main(String[] args)
	{
		int no2 = 50;//local variable of main()
		Instance1 ob = new Instance1();
		System.out.println("Number inside main is "+ob.no);
		System.out.println("Value inside main is "+ob.value);
		System.out.println("Number2 inside main is "+no2);
		System.out.println("Static Variable Count inside main is "+count);
		ob.show();
		display();
	}
}