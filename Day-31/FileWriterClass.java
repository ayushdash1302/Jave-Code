//File reading character wise 

import java.io.*;
import java.util.*;
class FileWriterClass
{
	public static void main(String args[]) throws IOException
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		str = sc.nextLine();
		//Attach a file to the FileWriter class
		FileWriter fw = new FileWriter("C:\\Users\\ayush\\Downloads\\Ayush.txt");
		for(int index = 0;index<str.length();index++)
		{
			fw.write(str.charAt(index));
		}
		fw.close();
	}
}