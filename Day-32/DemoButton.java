//Swing Example Sundar Wale

import javax.swing.*;
import java.awt.*;

class DemoButton extends JFrame
{
	JButton b;
	JLabel l;
	DemoButton()
	{
		setLayout(new FlowLayout());
		b = new JButton("Click Me");
		add(b);
	}
	public static void main(String args[])
	{
		DemoButton ob = new DemoButton();
		ob.setTitle("My Button");
		ob.setSize(400,400);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}