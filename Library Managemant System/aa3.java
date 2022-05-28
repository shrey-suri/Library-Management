//Library Management System Adding Librarian
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.lang.*;

class aa3 extends JFrame
{
int count,flag,cd,us;
aa3()
{

JPanel p=new JPanel();
p.setLayout(null);
JLabel l=new JLabel("ADD LIBRARIAN");
JLabel l1=new JLabel("Name: ");
final JTextField t1=new JTextField(25);
t1.setFont(new Font("Calibri",Font.BOLD,20));
t1.setBounds(500,230,500,50);
p.add(t1);
l.setFont(new Font("Arial",Font.BOLD,45));
l1.setFont(new Font("Arial",10,30));
l1.setBounds(350,230,300,50);

l.setBounds(550,50,1300,70);

p.add(l);
p.add(l1);
JLabel l5=new JLabel("ID:");
l5.setFont(new Font("Arial",10,30));
l5.setBounds(350,160,300,50);
p.add(l5);
final JTextField t5=new JTextField(25);
t5.setFont(new Font("Calibri",Font.BOLD,20));
t5.setBounds(500,160,500,50);
t5.setToolTipText("Must contain digits only.");
p.add(t5);
JLabel l2=new JLabel("Username:");
l2.setFont(new Font("Arial",10,30));
l2.setBounds(350,300,300,50);
p.add(l2);
final JTextField t2=new JTextField(25);
t2.setFont(new Font("Calibri",Font.BOLD,20));
t2.setBounds(500,300,500,50);
t2.setToolTipText("Must Be 5 to 10 charcters long. Should include Alphabets and Numbers");
p.add(t2);
JLabel l3=new JLabel("Password:");
final JTextField t3=new JTextField(25);
final JLabel l4=new JLabel();
l3.setFont(new Font("Arial",10,30));
l3.setBounds(350,370,300,50);
t3.setFont(new Font("Calibri",Font.BOLD,20));
t3.setBounds(500,370,500,50);
t3.setToolTipText("Must Be 7 to 25 charcters long. Can be Number, Alphabets, Special Characters, or Combinations of all."); 
p.add(l3);
p.add(t3);
JLabel l6=new JLabel("Mobile No.:");
l6.setFont(new Font("Arial",10,30));
l6.setBounds(350,440,300,50);
p.add(l6);
final JTextField t6=new JTextField(25);
t6.setFont(new Font("Calibri",Font.BOLD,20));
t6.setToolTipText("Must Be 10 digits long.");
t6.setBounds(500,440,500,50);
p.add(t6);
l4.setFont(new Font("Arial",10,30));
l4.setBounds(450,640,1300,50);
JButton b1=new JButton("RESET");
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
t1.setText("");
t2.setText("");
t3.setText("");
l4.setText("");
t5.setText("");
t6.setText("");
}});
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setBounds(400,540,250,50);
p.add(b1);
JButton b2=new JButton("SUBMIT");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e1)
{
String name=t1.getText();
String user=t2.getText();
String pass=t3.getText();
String id=t5.getText();
String mob=t6.getText();
flag=0;
try
{
Connection conn1=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement sc1=conn1.createStatement();
ResultSet rs=sc1.executeQuery("select * from library");
while(rs.next())
{
	if((rs.getString(1).equals(id)))
		flag=1;
	if(rs.getString(3).equals(user))
		flag=2;

}}
catch(Exception e)
{
e.printStackTrace();
}
if((id.compareTo("")!=0)&&(name.compareTo("")!=0)&&(user.compareTo("")!=0)&&(pass.compareTo("")!=0)&&(mob.compareTo("")!=0))
{
	if(flag!=2)
	{
	if((flag==0))
	{
		if(pass.length()>=7&&pass.length()<=25)
		{
if((mob.length()==10))
{
	count=0;
	cd=0;
	us=0;
	for(int i=0;i<mob.length();i++)
	{
		char c=mob.charAt(i);
		if(Character.isDigit(c))
		{
			count++;
		}
	}
	for(int i=0;i<id.length();i++)
	{
		char c=id.charAt(i);
		if(Character.isDigit(c))
		{
			cd++;
		}
	}
	for(int i=0;i<user.length();i++)
	{
		char c=user.charAt(i);
		if(Character.isDigit(c))
		{
			us++;
		}
		if(Character.isLetter(c))
		{
			us++;
		}
	}
	if(cd==id.length())
	{
		if(us==user.length())
		{
			if(us>=5&&us<=10)
			{
if(count==10)
{
try
{
Connection conn=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement sc=conn.createStatement();
String s="insert into library values('"+id+"','"+name+"','"+user+"','"+pass+"','"+mob+"')";
sc.executeUpdate(s);

		aa6 f2=new aa6();
        f2.setSize(1366,728);
        f2.setVisible(true);
		f2.setTitle("LIBRARIAN ADDED PAGE");
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();

}
catch(Exception e)
{
e.printStackTrace();
}
}
else
{
	l4.setText("INVALID MOBILE NUMBER");
}
}
else
{
	l4.setText("USERNAME NOT WITHIN RANGE");
		}}
		else
		{
			l4.setText("INVALID USERNAME");
	}}
else
{
l4.setText("INVALID ID...CANNOT INCLUDE CHARACTER");	
}}
else
{
	l4.setText("INVALID MOBILE NUMBER");
	}}
	else
{
	l4.setText("PASSWORD NOT WITHIN LIMINTS MENTIONED");
	}}
	else
	{
		l4.setText("ID ALREADY EXISTS");
}}
else
{
	l4.setText("USERNAME ALREADY EXISTS");
}
	}
else
{
	l4.setText("INVALID LIBRARIAN DETAILS");
	}
}});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(750,540,250,50);
p.add(b2);
p.add(l4);
setContentPane(p);
}
}