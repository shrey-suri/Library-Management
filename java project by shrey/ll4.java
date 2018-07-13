//Library Management System View Books
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.io.*;
import java.sql.*;

class ll4 extends JFrame
{

ll4()
{
JPanel p=new JPanel();
p.setLayout(null);
JTextArea t=new JTextArea(1300,400);
t.setFont(new Font("Arial",10,30));
JScrollPane r=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
r.setBounds(10,20,1320,650);
p.add(r);
try
{
t.append("Code\t|\tName\t|\tPublisher\t|\tYear \n");
t.append("-----------------------------------------------------------------------------------------------------------------------------------\n");
Connection c=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select * from book");
while(rs.next())
{
	t.append(rs.getString(1) + "\t|\t" + rs.getString(2) + "\t|\t" +rs.getString(3) + "\t|\t" +rs.getString(4) + "\n");
	t.append("------------------------------------------------------------------------------------------------------------------------------------\n");
}

}
catch(Exception e)
{
e.printStackTrace();
}

setContentPane(p);

}
}