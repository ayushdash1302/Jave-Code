//wap to enter 3 sides of a triangle and find the area 

import java.util.*;
class AreaTriangle
{
	public static void main(String args[])
	{
		double side1,side2,side3,area,s;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter side1");
		side1 = Sc.nextDouble();
		System.out.println("Enter side2");
		side2 = Sc.nextDouble();
		System.out.println("Enter side3");
		side3 = Sc.nextDouble();
		s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of Triangle is "+area);
	}
}