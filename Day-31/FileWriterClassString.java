//File reading character wise 

import java.io.*;
import java.util.*;
class FileWriterClassString
{
	public static void main(String args[]) throws IOException
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		str = sc.nextLine();
		//Attach a file to the FileWriter class
		FileWriter fw = new FileWriter("C:\\Users\\ayush\\Downloads\\Ayush1.txt");
		while(!str.equals("exit"))
		{
			fw.write(str);
			System.out.println("Enter String ");
		    str = sc.nextLine();
		}
		fw.close();
	}
}
