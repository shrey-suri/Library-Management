//Library Management System Adding Books
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

class ll3 extends JFrame
{
int b;
ll3()
{
b=1;
JPanel p=new JPanel();
p.setLayout(null);
JLabel l=new JLabel("ADD BOOKS");
JLabel l1=new JLabel("Code: ");
l.setFont(new Font("Arial",Font.BOLD,45));
l1.setFont(new Font("Arial",10,30));
l.setBounds(550,50,1300,70);
l1.setBounds(350,160,300,50);
final JTextField t1=new JTextField(25);
t1.setFont(new Font("Calibri",Font.BOLD,20));
t1.setBounds(500,160,500,50);
p.add(t1);
p.add(l);
p.add(l1);
JLabel l2=new JLabel("Name:");
l2.setFont(new Font("Arial",10,30));
l2.setBounds(350,230,300,50);
p.add(l2);
final JTextField t2=new JTextField(25);
t2.setFont(new Font("Calibri",Font.BOLD,20));
t2.setBounds(500,230,500,50);
p.add(t2);
JLabel l3=new JLabel("Publisher:");
final JTextField t3=new JTextField(25);
final JLabel l4=new JLabel();
l3.setFont(new Font("Arial",10,30));
l3.setBounds(350,300,300,50);
t3.setFont(new Font("Calibri",Font.BOLD,20));
t3.setBounds(500,300,500,50);
p.add(l3);
p.add(t3);
JLabel l6=new JLabel("Year:");
l6.setFont(new Font("Arial",10,30));
l6.setBounds(350,370,300,50);
p.add(l6);
final JTextField t6=new JTextField(50);
t6.setToolTipText("Must Be Between 2000 and 2050");
t6.setFont(new Font("Calibri",Font.BOLD,20));
t6.setBounds(500,370,500,50);
p.add(t6);
l4.setFont(new Font("Arial",10,30));
l4.setBounds(550,620,500,50);
JButton b1=new JButton("RESET");
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
t1.setText("");
t2.setText("");
t3.setText("");
l4.setText("");

t6.setText("");
}});
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setBounds(400,520,250,50);
p.add(b1);
JButton b2=new JButton("SUBMIT");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
String name=t2.getText();
String co=t1.getText();
String pub=t3.getText();

String yr=t6.getText();

try
{
Connection conn=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement sc=conn.createStatement();
ResultSet rs=sc.executeQuery("select * from book");
ResultSet r5=sc.executeQuery("select * from Issued");
while(rs.next())
{
	if(co.equals(rs.getString(1)))
		b=0;
}
while(r5.next())
{
	if(co.equals(r5.getString(1)))
		b=0;
}
if(b==0)
{
	l4.setText("Code Already Exists");
}
else
{
	if((co.compareTo("")!=0)&&name.compareTo("")!=0&&pub.compareTo("")!=0&&yr.compareTo("")!=0)
	{
if((yr.compareTo("2050")<0)&&(yr.compareTo("2000")>0))
{
String s="insert into book values('"+co+"','"+name+"','"+pub+"','"+yr+"')";
sc.executeUpdate(s);
l4.setText("Book ADDED SUCCESSFULLY");
ll5 f2=new ll5();
        f2.setSize(1366,728);
        f2.setVisible(true);
		f2.setTitle("BOOK ADDED PAGE");
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
}
else
{
	l4.setText("Invalid YEAR");
}}
else
{
	l4.setText("Invalid Book Details");
}
}
}
catch(Exception e)
{
e.printStackTrace();
}
}});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(750,520,250,50);
p.add(b2);
p.add(l4);
setContentPane(p);
}
}