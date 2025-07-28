//Read the content of file

import java.io.*;
import java.util.*;

class FileReaderClass
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\ayush\\Downloads\\Ayush1.txt");
        int i;
		i = fr.read();
		while(i != -1)
		{
			System.out.print((char)i);
			i= fr.read();
		}
		fr.close();
	}
}