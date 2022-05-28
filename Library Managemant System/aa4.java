//Library Management System View Librarian
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.io.*;
import java.sql.*;

class aa4 extends JFrame
{
aa4()
{
JPanel p=new JPanel();
p.setLayout(null);
JTextArea t=new JTextArea(400,300);
t.setFont(new Font("Arial",Font.BOLD,20));
JScrollPane r=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
r.setBounds(30,50,1270,600);
p.add(r);
try
{
t.append("ID \t|\t Name \t|\t Username \t|\t Password \t|\t Mobile No\n");
t.append("--------------------------------------------------------------------------------------------------------------");
t.append("----------------------------------------------------------------------------------------------------\n");
Connection c=DriverManager.getConnection("jdbc:ucanaccess://Database3.accdb");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select * from library");
while(rs.next())
{
	t.append(rs.getString(1) + "\t|\t" + rs.getString(2) + "\t|\t" +rs.getString(3) + "\t|\t" +rs.getString(4) + "\t|\t" +rs.getString(5) + "\n");
	t.append("----------------------------------------------------------------------------------------------------------------------------");
	t.append("---------------------------------------------------------------------------------------------------------------------------------\n");
}

}
catch(Exception e)
{
e.printStackTrace();
}
setContentPane(p);
}
}