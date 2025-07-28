package folder2;
import folder1.*;
class DemoPackage extends TestPackage
{
	public static void main(String args[])
	{
		DemoPackage ob = new DemoPackage();
		ob.f1();
		//ob.f2();Cannot access as private
		ob.f3();
		//ob.f4();Default cannot be accessed
	}
}