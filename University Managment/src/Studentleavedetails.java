import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;



import net.proteanit.sql.DbUtils;

public class Studentleavedetails extends JFrame implements ActionListener {
	Choice crollno;
	JTable table;
	JButton search,add,cancel,print,update;
	
	 Studentleavedetails() {
		
		 getContentPane().setBackground(Color.WHITE);
		 
		 setLayout(null);
		 
		 Label heading=new Label("Search By Roll Number");
		 heading.setBounds(20,20, 200, 50);
		 heading.setFont(new Font("Serif", Font.BOLD, 20));
		 add(heading);
		 
		 
		crollno =new Choice();
		crollno.setBounds(280, 30, 150, 50);
		add(crollno);
		 
		
		 try {
				conn c=new conn();
				ResultSet rs=c.s.executeQuery("select * from studentleave");
				
			    while (rs.next())
			    {
			    	crollno.add(rs.getString("rollno"));
			    }
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		 
		 
		table=new JTable();
		
		 
		 
		 
		 
		 
		 try {
				conn c=new conn();
				ResultSet rs=c.s.executeQuery("select * from studentleave");
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		 
		 JScrollPane jsp=new JScrollPane(table);
		 jsp.setBounds(0, 150, 900, 600);
		 add(jsp);
		 
		 search =new JButton("Search");
		 search.setBounds(320, 80, 80, 20);
		 search.addActionListener(this);
		 add(search);
		 
		 print=new JButton("Print");
		 print.setBounds(80, 80, 80, 20);
		 print.addActionListener(this);
		 add(print);
		 
		
		 
		 cancel=new JButton("Cancel");
		 cancel.setBounds(200, 80, 80, 20);
		 cancel.addActionListener(this);
		 add(cancel);
		 
		
		 
		 
		 
		setSize(900,650);
		setLocation(200,20);
		
		setVisible(true);
		 
	 }
	
	
	
	
	
	public static void main(String[] args) {
		new Studentleavedetails();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==search)
		{
			String query="Select * from studentleave where rollno='"+crollno.getSelectedItem()+"'";
		try {
			
			conn c=new conn();
			ResultSet rs=c.s.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		
		
		}
		else if(e.getSource()==cancel)
		{
			setVisible(false);
		}
		else if(e.getSource()==add)
		{
		
			new Addstudent();
			
		}
		else if(e.getSource()==update)
		{
			setVisible(false);
		}
		else if(e.getSource()==print)
		{
			try {
				table.print();
				
			} catch ( Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
