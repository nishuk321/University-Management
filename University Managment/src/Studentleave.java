import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Studentleave extends JFrame implements ActionListener {
	
	JDateChooser dcdate;
	Choice crollno ,ctime;
	JButton submit,cancle;
	 Studentleave() {
		
		 
		 
		 setSize(500,550);
		 setLocation(400,80);
		
		 setLayout(null);
		 
		 
		 
		 getContentPane().setBackground(Color.WHITE);
		 
		 JLabel heading=new JLabel("Apply for Leave");
		 heading.setBounds(180, 20, 150, 20);
		 heading.setFont(new Font("sherif", Font.BOLD, 20));
		 add(heading);
		 
		 Label heading1=new Label("Search By Roll Number");
		 heading1.setBounds(20,60, 200, 50);
		 heading1.setFont(new Font("Serif", Font.BOLD, 20));
		 add(heading1);
		 
		 
		crollno =new Choice();
		crollno.setBounds(280, 75, 150, 50);
		add(crollno);
		 
		
		 try {
				conn c=new conn();
				ResultSet rs=c.s.executeQuery("select * from student");
				
			    while (rs.next())
			    {
			    	crollno.add(rs.getString("rollno"));
			    }
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		 
		 Label date=new Label("Date");
		 date.setBounds(20,110, 200, 50);
		 date.setFont(new Font("Serif", Font.BOLD, 20));
		 add(date);
		 
		 dcdate=new JDateChooser();
		 dcdate.setBounds(280, 130, 150, 20);
			add(dcdate);
			
			Label lbtime=new Label("Time duration");
			lbtime.setBounds(20,165, 200, 50);
			lbtime.setFont(new Font("Serif", Font.BOLD, 20));
			 add(lbtime);
			 
			 
			ctime =new Choice();
			ctime.setBounds(280, 180, 150, 50);
			ctime.add("Full Day");
			ctime.add("Half Day");
			add(ctime);
		 
			 cancle=new JButton("Cancel");
			 cancle.setBounds(100, 330,90, 20);
			 cancle.addActionListener(this);
			 add(cancle);
			 
			 submit=new JButton("Submit");
			 submit.setBounds(300, 330, 90, 20);
			 submit.addActionListener(this);
			 add(submit);
		 
		 setVisible(true);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Studentleave();
	}







	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==submit)
		{
			String rollno=crollno.getSelectedItem();
			String date=((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
			String duration=ctime.getSelectedItem();
			
			String query="insert into studentleave values ('"+rollno+"','"+date+"','"+duration+"')";
			
			try {
				conn c=new conn();
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Leave confirmed");
				setVisible(false);
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		else if (e.getSource()==cancle)
		{
			setVisible(false);
		}
	}

}
