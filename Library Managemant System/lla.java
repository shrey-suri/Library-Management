//Library Management System issue book

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class lla extends JFrame
{
lla()
{
JPanel p=new JPanel();
p.setLayout(null);
JLabel l=new JLabel("BOOK RETURNED SUCCESSFULLY");
l.setFont(new Font("Ariel",Font.BOLD,50));
l.setBounds(300,200,1300,70);
p.add(l);

JButton b1=new JButton("RETURN ANOTHER");
b1.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		ll9 f2=new ll9();
        f2.setSize(1366,728);
        f2.setVisible(true);
		f2.setTitle("RETURN BOOKS PAGE");
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
	}
});
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setBounds(530,350,250,50);
p.add(b1);
JButton b2=new JButton("EXIT");
b2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
        dispose();
	}
});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(530,520,250,50);
p.add(b2);
setContentPane(p);
}
}
