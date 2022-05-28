//Library Management System View Issued Books
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.io.*;
import java.sql.*;

class ll8 extends JFrame
{
int i;
ll8()
{
i=0;
JPanel p=new JPanel();
p.setLayout(null);
JLabel l=new JLabel("");
l.setFont(new Font("Ariel",Font.BOLD,50));
l.setBounds(500,250,1300,100);
p.add(l);
JTextArea t=new JTextArea(400,300);
t.setFont(new Font("Arial",10,30));
JScrollPane r=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
r.setBounds(10,20,1320,650);
r.setVisible(false);
p.add(r);


try
{
t.append("Name \t|\t Code \t|\t Publisher \t|\t Year\n");
t.append("-----------------------------------------------------------------------------------------------------------------------------------\n");
Connection c=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select * from Issued");
while(rs.next())
{
	t.append(rs.getString(1) + "\t|\t" + rs.getString(2) + "\t|\t" +rs.getString(3) + "\t|\t" +rs.getString(4) + "\n");
	t.append("-----------------------------------------------------------------------------------------------------------------------------------\n");
	i=1;
}
if(i==1)
r.setVisible(true);
else
	l.setText("No Records Found");

}
catch(Exception e)
{
l.setText("No Records Found");
}
setContentPane(p);
}
}