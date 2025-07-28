//Difference between static and non- static variable
class DifferenceStaticNonstatic
{
	int no;
	static int count;
	void show()
	{
		System.out.println("Number is "+no);
		System.out.println("Count is "+count);
		count++;
		no++;	
	}
	public static void main(String[] args)
	{
		DifferenceStaticNonstatic ob1 = new DifferenceStaticNonstatic();
		ob1.show();
		DifferenceStaticNonstatic ob2 = new DifferenceStaticNonstatic();
		ob2.show();
		DifferenceStaticNonstatic ob3 = new DifferenceStaticNonstatic();
		ob3.show();
	}
}