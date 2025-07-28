package folder2;
import folder1.*;

class DemoPackage1
{
	public static void main(String args[])
	{
		TestPackage ob = new TestPackage();
		ob.f1();
		//ob.f2();Cannot access as private
		//ob.f3();Protected cannot be accessed
		//ob.f4();Default cannot be accessed
	}
}