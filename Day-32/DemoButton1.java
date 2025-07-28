//Swing Example Sundar Wale

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DemoButton1 extends JFrame implements ActionListener
{
	JButton b;
	JLabel l;
	DemoButton1()
	{
		setLayout(new FlowLayout());
		b = new JButton("Click Me");
		l = new JLabel();
		add(l);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		l.setText("Radhe Radhe");
	}
	public static void main(String args[])
	{
		DemoButton1 ob = new DemoButton1();
		ob.setTitle("My Button");
		ob.setSize(400,400);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}