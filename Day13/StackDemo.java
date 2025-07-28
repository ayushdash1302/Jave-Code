//Implentation of stack using class and object

import java.util.*;
class TestStack
{
	int stack[] = new int[30];
	int top,size,value;
	Scanner sc = new Scanner(System.in);
	TestStack()
	{
	}
	TestStack(int size1)
	{
		size = size1;
		top = -1;
	}
	void push()
	{
		if(top == size-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			System.out.println("Enter Value to push");
			value = sc.nextInt();
			top++;
			stack[top] = value;
		}
	}
	void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack Underflow");
		}
		else 
		{
			System.out.println("Popped element is "+stack[top]);
			top--;
		}
	}
	void display()
	{
		int item;
		if(top == -1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("Values of stack are");
			for(item=top;item>=0;item--)
			{
				System.out.println(stack[item]);
			}
		}
	}
}
class StackDemo
{
	public static void main(String args[])
	{
		int size;
		System.out.println("Welcomes to the operations of stack");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		size = sc.nextInt();
		TestStack ob = new TestStack(size);
		int choice;
		while(true)
		{
			System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n");
			System.out.print("Enter the choice\n");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:ob.push();
				break;
				case 2:ob.pop();
				break;
				case 3:ob.display();
				break;
				case 4:System.exit(0);
				default:System.out.println("Wrong choice");
			}
		}
	}
}