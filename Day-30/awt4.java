import java.awt.*;
import java.awt.event.*;
class awt4 extends Frame implements ActionListener
{
	Button b1,b2,b3;
	awt4()
	{
        b1=new Button("yellow");
		b2=new Button("red");
		b3=new Button("green");
		b1.setBounds(50,50,40,40);
		b2.setBounds(170,50,40,40);
		b3.setBounds(290,50,40,40);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b1)
			this.setBackground(Color.yellow);
		if (e.getSource()==b2)
			this.setBackground(Color.red);
		if (e.getSource()==b3)
			this.setBackground(Color.green);
	}
	public static void main(String args[])
	{
		new awt4();
	}
}