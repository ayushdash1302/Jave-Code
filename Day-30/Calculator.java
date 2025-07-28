//AWT in Calculator

import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5;
	TextField tf1,tf2,tf3;
	Label l1,l2,l3;
	Calculator()
	{
		b1=new Button("+");
		b1.setBounds(200,500,80,30);
		b2=new Button("-");
		b2.setBounds(300,500,80,30);
		b3=new Button("*");
		b3.setBounds(400,500,80,30);
		b4=new Button("/");
		b4.setBounds(500,500,80,30);
		b5=new Button("%");
		b5.setBounds(600,500,80,30);
		tf1=new TextField();
		tf1.setBounds(350,200,100,20);
		tf2=new TextField();
		tf2.setBounds(350,300,100,20);
		tf3=new TextField();
		tf3.setBounds(350,400,100,20);
		l1=new Label("Number1:");
		l1.setBounds(200,200,50,20);
		l2=new Label("Number2:");
		l2.setBounds(200,300,50,20);
		l3=new Label("Result:");
		l3.setBounds(200,400,50,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		add(tf1);
		add(tf2);
		add(tf3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setSize(700,700);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ob)
	{
		String str1 = tf1.getText();
		String str2 = tf2.getText();
		int no1 = Integer.parseInt(str1);
		int no2 = Integer.parseInt(str2);
		int res = 0;
		if(ob.getSource() == b1)
		{
			res = no1 + no2;
		}
		else if(ob.getSource() == b2)
		{
			res = no1 - no2;
		}
		else if(ob.getSource() == b3)
		{
			res = no1 * no2;
		}
		else if(ob.getSource() == b4)
		{
			res = no1 / no2;
		}
		else if(ob.getSource() == b5)
		{
			res = no1 % no2;
		}
		String str3 = String.valueOf(res);
		tf3.setText(str3);
	}
	public static void main(String args[])
	{
		Calculator ob = new Calculator();
	}
}