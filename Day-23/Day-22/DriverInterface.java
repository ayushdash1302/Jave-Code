//Program for Shape class using interface

import java.util.*;
interface Shape
{
	void input();
	void calculateArea();
	abstract void show();
}
class Rectangle implements Shape
{
	int dimone,dimtwo;
	int area;
	public void input()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side1 ");
	dimone = sc.nextInt();
	System.out.println("Enter side2 ");
	dimtwo = sc.nextInt();
}
public void calculateArea()
{
	area = dimone * dimtwo;
}
public void show()
{
	System.out.println("Area of the rectangle is: "+area);
}
}
class Triangle implements Shape
{
	int dimone,dimtwo;
	float area;
	public void input()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side1 ");
	dimone = sc.nextInt();
	System.out.println("Enter side2 ");
	dimtwo = sc.nextInt();
}
public void calculateArea()
{
    area = 0.5f * dimone * dimtwo;
}
public void show()
{
    System.out.println("Area of the triangle is: "+area);
}
}
class DriverInterface
{
public static void main(String args[])
{
	Shape ob;
	ob = new Rectangle();
	System.out.println("Rectangle Operation");
	ob.input();
	ob.calculateArea();
	ob.show();
	ob = new Triangle();
	System.out.println("Triangle Operation");
	ob.input();
	ob.calculateArea();
	ob.show();
}
}
