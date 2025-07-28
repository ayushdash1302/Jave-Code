// INSTANCE VARIABLE or NON-STATIC VARIABLE IN JAVA
class Instance
{
	//Instance variable
	int no;
	float value;
	void show() //Non-static mathod
	{
		System.out.println("Number is "+no);
		System.out.println("Value is "+value);
	}
	public static void main(String[] args)
	{
		Instance ob = new Instance();
		System.out.println("Number inside main is "+ob.no);
		System.out.println("Value inside main is "+ob.value);
		ob.show();
	}
}