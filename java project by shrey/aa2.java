//Library Management System Admin Action Buttons

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class aa2 extends JFrame
{
aa2()
{
JPanel p=new JPanel();
p.setLayout(null);
JLabel rt=new JLabel("WELCOME!!   admin123");
rt.setFont(new Font("Arial",10,30));
rt.setBounds(900,10,400,40);
p.add(rt); 
JLabel l=new JLabel("ADMIN DASHBOARD");
JLabel l1=new JLabel("What you want to do");
l.setFont(new Font("Arial",Font.BOLD,45));
l1.setFont(new Font("Arial",10,30));
l.setBounds(50,50,1300,70);
l1.setBounds(250,140,300,50);
p.add(l);
p.add(l1);
JButton b1=new JButton("ADD LIBRARIAN");
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
aa3 f2=new aa3();
f2.setSize(1366,728);
f2.setVisible(true);
f2.setTitle("ADD LIBRARIAN PAGE");
f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setBounds(530,280,300,50);
p.add(b1);
JButton b2=new JButton("VIEW LIBRARIAN");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e2)
{
aa4 f3=new aa4();
f3.setSize(1366,728);
f3.setVisible(true);
f3.setTitle("VIEW LIBRARIAN PAGE");
f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(530,360,300,50);
p.add(b2);
JButton b3=new JButton("DELETE LIBRARIAN");
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e3)
{
aa5 f1=new aa5();
f1.setSize(1366,728);
f1.setVisible(true);
f1.setTitle("DELETE LIBRARIAN PAGE");
f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b3.setFont(new Font("Times New Roman",Font.BOLD,20));
b3.setBounds(530,440,300,50);
p.add(b3);
JButton b4=new JButton("LOGOUT");
b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e3)
{
dispose();
}});
b4.setFont(new Font("Times New Roman",Font.BOLD,20));
b4.setBounds(530,520,300,50);
p.add(b4);
setContentPane(p);
}
}