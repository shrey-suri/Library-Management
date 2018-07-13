//Library Management System Admin Login
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class aa1 extends JFrame
{
aa1()
{
JPanel p=new JPanel();
p.setLayout(null);
JLabel l=new JLabel("ADMIN LOGIN");
JLabel l1=new JLabel("Username:");
l.setFont(new Font("Arial",Font.BOLD,45));
l1.setFont(new Font("Arial",10,30));
l.setBounds(550,50,1300,70);
l1.setBounds(350,200,300,50);
p.add(l);
p.add(l1);
final JTextField t1=new JTextField(25);
t1.setFont(new Font("Calibri",Font.BOLD,20));
t1.setBounds(500,200,500,50);
p.add(t1);
JLabel l2=new JLabel("Password:");
l2.setFont(new Font("Arial",10,30));
l2.setBounds(350,300,300,50);
p.add(l2);
final JPasswordField t2=new JPasswordField(25);
t2.setFont(new Font("Calibri",Font.BOLD,20));
t2.setBounds(500,300,500,50);
p.add(t2);
final JLabel l3=new JLabel();
l3.setFont(new Font("Arial",10,30));
l3.setBounds(550,550,1300,50);
JButton b1=new JButton("RESET");
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
t1.setText("");
t2.setText("");
l3.setText("");
}});
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setBounds(400,450,250,50);
p.add(b1);
JButton b2=new JButton("SUBMIT");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
String i=t1.getText();
String j=t2.getText();
if((i.compareTo("admin123")==0)&&(j.compareTo("1234567")==0))
{
	l3.setText("");
aa2 f1=new aa2();
f1.setSize(1366,728);
f1.setVisible(true);
f1.setTitle("ADMIN ACIONS PAGE");
f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
dispose();
}
else
{
l3.setText("Invalid Username/Password");
}
}});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(750,450,250,50);
p.add(b2);
p.add(l3);
setContentPane(p);
}
}