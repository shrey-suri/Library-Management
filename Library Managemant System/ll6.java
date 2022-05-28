//Library Management System Issue Books
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.io.*;
import java.sql.*;

class ll6 extends JFrame
{ 
int flag;
ll6()
{
flag=0;
final JButton b1=new JButton("Submit");

JPanel p=new JPanel();
p.setLayout(null);
ImageIcon pic=new ImageIcon("issue.jpg");
final JLabel l3=new JLabel(pic);
l3.setBounds(10,70,400,500);
p.add(l3);

JLabel l=new JLabel("ISSUE BOOKS");
l.setFont(new Font("Arial",Font.BOLD,45));
l.setBounds(550,50,1300,70);
p.add(l);

final JLabel l1=new JLabel("CODE: ");
l1.setFont(new Font("Arial",10,30));

l1.setBounds(430,300,300,50);
p.add(l1);

final JTextField t1=new JTextField(25);
t1.setFont(new Font("Calibri",Font.BOLD,20));
t1.setBounds(550,300,500,50);
p.add(t1);

final JTextArea t=new JTextArea(400,300);
t.setFont(new Font("Arial",10,30));
t.setBounds(20,200,1300,300);
t.setVisible(false);
p.add(t);

final JLabel l2=new JLabel("");
l2.setFont(new Font("Arial",10,30));
l2.setBounds(600,550,300,50);
l2.setVisible(false);
p.add(l2);

final JButton b2=new JButton("YES");

final JButton b3=new JButton("NO");
b3.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent g)
	{
		t.setText("");
		t1.setText("");
		l1.setVisible(true);
		t1.setVisible(true);
		b1.setVisible(true);
		l2.setVisible(false);
		b2.setVisible(false);
		t.setVisible(false);
		b3.setVisible(false);
		l3.setVisible(true);
		
}});
b3.setFont(new Font("Times New Roman",Font.BOLD,20));
b3.setBounds(1000,600,100,40);
b3.setVisible(false);
p.add(b3);


b1.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent y)
	{
		
		
try
{
	
	t.setText("");
	
t.append("Code \t|\t Name \t|\t Publisher \t|\t Year \n");
t.append("-----------------------------------------------------------------------------------------------------------------------------------\n");
Connection c=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select * from book where Code='"+t1.getText()+"'");
ResultSet r5=st.executeQuery("select * from Issued where Code='"+t1.getText()+"'");
while(rs.next())
{
	
	t.append(rs.getString(1) + "\t|\t" + rs.getString(2) + "\t|\t" +rs.getString(3) + "\t|\t" +rs.getString(4) + "\n");
	t.append("-----------------------------------------------------------------------------------------------------------------------------------\n");
	if((rs.getString(1)).equals(t1.getText()))
		flag=1;
}
while(r5.next())
{
	
	if((r5.getString(1)).equals(t1.getText()))
		flag=2;
}
if((flag==1)&&((t1.getText().compareTo(""))!=0))
{
	
l2.setText("Issue the Book");
l1.setVisible(false);
		t1.setVisible(false);
		b1.setVisible(false);
b2.setVisible(true);
	b3.setVisible(true);
	t.setVisible(true);
l2.setVisible(true);
l3.setVisible(false);
}
else 
{
	if(flag==2)
		l2.setText("Book Already Issued");
	else
		l2.setText("No Book Found");
	l2.setVisible(true);
	l1.setVisible(true);
		t1.setVisible(true);
		b1.setVisible(true);
}}
catch(Exception e)
{
e.printStackTrace();
}}});
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setBounds(550,400,300,50);
p.add(b1);
b2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent g)
	{
try
{
	
Connection c1=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement s=c1.createStatement();
ResultSet rst=s.executeQuery("select * from book where Code='"+t1.getText()+"'");
while(rst.next())
{
String re="insert into Issued values('"+rst.getString(1)+"','"+rst.getString(2)+"','"+rst.getString(3)+"','"+rst.getString(4)+"')";
s.executeUpdate(re);
}
String o="delete * from book where Code='"+t1.getText()+"'";
s.executeUpdate(o);

ll7 f2=new ll7();
        f2.setSize(1366,728);
        f2.setVisible(true);
		f2.setTitle("BOOK ISSUED PAGE");
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
}
catch(Exception u)
{
u.printStackTrace();
}
}});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(250,600,100,40);
b2.setVisible(false);
p.add(b2);

setContentPane(p);
}
}