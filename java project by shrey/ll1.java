//Library Management System Librarian Login
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class ll1 extends JFrame
{
	int flag;
ll1()
{
	flag=0;
JPanel p=new JPanel();
p.setLayout(null);
JLabel l=new JLabel("LIBRARIAN LOGIN");
l.setFont(new Font("Arial",Font.BOLD,45));
JLabel l1=new JLabel("Username:");
l1.setFont(new Font("Arial",10,30));
l.setBounds(500,50,1300,70);
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
l3.setFont(new Font("Arial",Font.BOLD,30));
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
{flag=0;
String i=t1.getText();
String j=t2.getText();
try
{
Connection c=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select * from library");
while(rs.next())
{
	if((i.equals(rs.getString(3)))&&(j.equals(rs.getString(4))))
	{flag=1;
l3.setText("");
ll2 f1=new ll2(rs.getString(2));
f1.setSize(1366,728);
f1.setVisible(true);
f1.setTitle("LIBRARIAN ACTIONS PAGE");
f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
dispose();
	}
}
if(flag==0)
l3.setText("Invalid Username/Password");
}
catch(SQLException e)
{
	e.printStackTrace();
}
}});
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setBounds(750,450,250,50);

p.add(b2);
p.add(l3);
setContentPane(p);
}
}