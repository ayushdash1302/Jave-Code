//AWT(Abstract Window Toolkit)

import java.awt.*;

class ButtonExamples 
{
	public static void main(String args[])
	{
		Frame f = new Frame("Button Example");
		Button b = new Button("Click Me");
		b.setBounds(50,100,80,30);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}

