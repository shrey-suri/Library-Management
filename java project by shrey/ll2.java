//Library Management System Librarian Action Buttons

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ll2 extends JFrame
{
ll2(String q)
{
JPanel p=new JPanel();
p.setLayout(null);
JLabel rt=new JLabel("WELCOME!!   " + q.toUpperCase());
rt.setFont(new Font("Arial",10,30));
rt.setBounds(900,10,400,40);
p.add(rt); 
JLabel l=new JLabel("LIBRARIAN DASHBOARD");
JLabel l1=new JLabel("What you want to do");
l.setFont(new Font("Arial",Font.BOLD,45));
l1.setFont(new Font("Arial",10,30));
l.setBounds(50,50,1300,70);
l1.setBounds(250,140,300,50);
p.add(l);
p.add(l1);
JButton b1=new JButton("ADD BOOKS");
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
	ll3 f=new ll3();
	f.setSize(1366,728);
	f.setVisible(true);
	f.setTitle("ADD BOOKS PAGE");
	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
}});
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setBounds(530,230,300,50);
p.add(b1);
JButton b2=new JButton("VIEW BOOKS");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e2)
{
	ll4 f3=new ll4();
f3.setSize(1366,728);
f3.setVisible(true);
f3.setTitle("VIEW BOOKS PAGE");
f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(530,310,300,50);
p.add(b2);
JButton b3=new JButton("ISSUE BOOKS");
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e3)
{
	ll6 f3=new ll6();
f3.setSize(1366,728);
f3.setVisible(true);
f3.setTitle("ISSUE BOOKS PAGE");
f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b3.setFont(new Font("Times New Roman",Font.BOLD,20));
b3.setBounds(530,390,300,50);
p.add(b3);
JButton b4=new JButton("VIEW ISSUED BOOKS");
b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e3)
{
	ll8 f3=new ll8();
f3.setSize(1366,728);
f3.setVisible(true);
f3.setTitle("VIEW ISSUED BOOKS PAGE");
f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b4.setFont(new Font("Times New Roman",Font.BOLD,20));
b4.setBounds(530,470,300,50);
p.add(b4);
JButton b5=new JButton("RETURN BOOKS");
b5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e3)
{
	ll9 f3=new ll9();
f3.setSize(1366,728);
f3.setVisible(true);
f3.setTitle("RETURN BOOKS PAGE");
f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b5.setFont(new Font("Times New Roman",Font.BOLD,20));
b5.setBounds(530,550,300,50);
p.add(b5);
JButton b6=new JButton("LOGOUT");
b6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e3)
{
	dispose();
}});
b6.setFont(new Font("Times New Roman",Font.BOLD,20));
b6.setBounds(530,630,300,40);
p.add(b6);
setContentPane(p);
}
}