//AWT(Abstract Window Toolkit)

import java.awt.*;

class ButtonExample1 extends Frame  
{
	Button b;
	ButtonExample1()
	{
		b = new Button("Click Me");
		b.setBounds(50,100,80,30);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		ButtonExample1 ob = new ButtonExample1();
	}
}

