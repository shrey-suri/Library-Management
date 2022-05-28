//Library Management System Action Buttons

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class aa extends JFrame
{
aa()
{
JPanel p=new JPanel();
p.setLayout(null);

JLabel l=new JLabel("Welcome to Library Management System");
l.setFont(new Font("Ariel",Font.BOLD,50));
JLabel l1=new JLabel("What you want to do");
l1.setFont(new Font("Ariel",10,40));
l.setBounds(200,50,1300,70);
l1.setBounds(500,170,1300,50);
p.add(l);
p.add(l1);
JButton b1=new JButton("ADMIN LOGIN");
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
aa1 am=new aa1();
am.setSize(1366,728);
am.setVisible(true);
am.setTitle("ADMIN LOGIN PAGE");
am.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setBounds(530,300,300,50);
p.add(b1);
JButton b2=new JButton("LIBRARIAN LOGIN");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e2)
{
ll1 l1=new ll1();
l1.setSize(1366,728);
l1.setVisible(true);
l1.setTitle("LIBRARIAN LOGIN PAGE");
l1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(530,500,300,50);
p.add(b2);

setContentPane(p);
}
}
class lm1
{
public static void main(String[] ar)
{
aa f=new aa();
f.setSize(1366,728);
f.setVisible(true);
f.setTitle("MAIN PAGE");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}