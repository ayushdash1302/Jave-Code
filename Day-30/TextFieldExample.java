//AWT(Abstract Window Toolkit)

import java.awt.*;

class TextFieldExample extends Frame  
{
	Button b;
	TextField tf;
	Label l;
	TextFieldExample()
	{
		b = new Button("Click Me");
		b.setBounds(150,200,80,30);
		tf = new TextField();
		tf.setBounds(150,150,100,30);
		l = new Label("Name");
		l.setBounds(100,150,50,20);
		add(l);
		add(tf);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		TextFieldExample ob = new TextFieldExample();
	}
}

