//Swing Example 

import javax.swing.*;
import java.awt.*;

class DemoFrame extends JFrame
{
	public static void main(String args[])
	{
		DemoFrame ob = new DemoFrame();
		ob.setTitle("My swing frame");
		ob.setSize(400,400);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}