

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class project extends JFrame implements ActionListener {
	
	public project() {
		// TODO Auto-generated constructor stub
		setSize(1290,720);
		
		
		ImageIcon i=new  ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
		Image i2=i.getImage().getScaledInstance(1250, 630, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		add(image);
		
		JMenuBar mb=new JMenuBar();
		
		JMenu newinformation=new JMenu("New Information");
		newinformation.setForeground(Color.BLUE);
		mb.add(newinformation);
		
		JMenuItem faclityinfo=new JMenuItem("New Faclity Information");
		faclityinfo.setBackground(Color.WHITE);
		faclityinfo.addActionListener(this);
		newinformation.add(faclityinfo);
		
		JMenuItem studentinfo=new JMenuItem("New Student Information");
		studentinfo.setBackground(Color.WHITE);
		studentinfo.addActionListener(this);
		newinformation.add(studentinfo);
		
		
		JMenu details=new JMenu("View Details");
		details.setForeground(Color.RED);
		mb.add(details);
		
		JMenuItem faclitydetails=new JMenuItem("View Faclity Details");
		faclitydetails.setBackground(Color.WHITE);
		faclitydetails.addActionListener(this);
		details.add(faclitydetails);
		
		JMenuItem studentdetails=new JMenuItem("View Student Details");
		studentdetails.setBackground(Color.WHITE);
		studentdetails.addActionListener(this);
        details.add(studentdetails);
		
        JMenu leave=new JMenu("Apply Leave");
		leave.setForeground(Color.BLUE);
		mb.add(leave);
		
		JMenuItem faclityleave=new JMenuItem("Faclity Leave");
		faclityleave.setBackground(Color.WHITE);
		faclityleave.addActionListener(this);
		leave.add(faclityleave);
		
		JMenuItem studentleave=new JMenuItem("Student Leave");
		studentleave.setBackground(Color.WHITE);
		studentleave.addActionListener(this);
		leave.add(studentleave);
		
		
		JMenu leavedetails=new JMenu("Leave Details");
		leavedetails.setForeground(Color.RED);
		mb.add(leavedetails);
		
		JMenuItem faclityleavedetails=new JMenuItem("Faclity Leave Details");
		faclityleavedetails.setBackground(Color.WHITE);
		faclityleavedetails.addActionListener(this);
		leavedetails.add(faclityleavedetails);
		
		JMenuItem studentleavedetails=new JMenuItem("Student Leave Details");
		studentleavedetails.setBackground(Color.WHITE);
		studentleavedetails.addActionListener(this);
		leavedetails.add(studentleavedetails);
		
		
		JMenu exam=new JMenu("Examination");
		exam.setForeground(Color.BLUE);
		mb.add(exam);
		
		JMenuItem examinationdetails=new JMenuItem("Examination Details");
		examinationdetails.setBackground(Color.WHITE);
		examinationdetails.addActionListener(this);
		exam.add(examinationdetails);
		
		JMenuItem entermarks=new JMenuItem("Enter Marks");
		entermarks.setBackground(Color.WHITE);
		entermarks.addActionListener(this);
		exam.add(entermarks);
		
		
		JMenu updateinfo=new JMenu("Update Details");
		updateinfo.setForeground(Color.RED);
		mb.add(updateinfo);
		
		JMenuItem updatefacilityinfo=new JMenuItem("Update Facility Details");
		updatefacilityinfo.setBackground(Color.WHITE);
		updatefacilityinfo.addActionListener(this);
		updateinfo.add(updatefacilityinfo);
		
		JMenuItem updatestudentinfo=new JMenuItem("Update Student Details");
		updatestudentinfo.setBackground(Color.WHITE);
		updatestudentinfo.addActionListener(this);
		updateinfo.add(updatestudentinfo);
		
		

		JMenu fee=new JMenu("Fee Details");
		fee.setForeground(Color.BLUE);
		mb.add(fee);
		
		JMenuItem feestructure=new JMenuItem("Fee Structure");
		feestructure.setBackground(Color.WHITE);
		feestructure.addActionListener(this);
		fee.add(feestructure);
		
		JMenuItem studentfee=new JMenuItem("Student Fee Form");
		studentfee.setBackground(Color.WHITE);
		studentfee.addActionListener(this);
		fee.add(studentfee);
		

		JMenu utility=new JMenu("Utility");
		utility.setForeground(Color.RED);
		mb.add(utility);
		
		JMenuItem notpad=new JMenuItem("Notpad");
		notpad.setBackground(Color.WHITE);
		notpad.addActionListener(this);
		utility.add(notpad);
		
		JMenuItem cal=new JMenuItem("Calculator");
		cal.setBackground(Color.WHITE);
		cal.addActionListener(this);
		utility.add(cal);
		

		JMenu exit=new JMenu("Exit");
		exit.setForeground(Color.BLUE);
		mb.add(exit);
		
		JMenuItem ex=new JMenuItem("Exit");
		ex.setBackground(Color.WHITE);
		ex.addActionListener(this);
		exit.add(ex);
		
		
		
		
		
		setJMenuBar(mb);
		setVisible(true);
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		new project();
		
	}



	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String mesg=ae.getActionCommand();
		
		if(mesg.equals("Exit"))
		{
			setVisible(false);
		}
		else if(mesg.equals("Notpad"))
		{
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}
			catch (Exception e) {
				// TODO: handle exception
			}}
			else if(mesg.equals("Calculator"))
			{
				try {
					Runtime.getRuntime().exec("calc.exe");
				}
				catch (Exception e) {
					// TODO: handle exception
				
				}
		}
			else if(mesg.equals("New Faclity Information")) {
				new Addteacher();
			}
			else if(mesg.equals("New Student Information")) {
				new Addstudent();
			}
			else if(mesg.equals("View Student Details")) {
				new Studentdetails();
			}
			else if(mesg.equals("View Faclity Details")) {
				new TeacherDetails();
			}
			else if (mesg.equals("Student Leave"))
			{
				//setVisible(false);
				new Studentleave();
			}
			else if (mesg.equals("Faclity Leave"))
			{
				//setVisible(false);
				new Teacherleave();
			}
		
			else if (mesg.equals("Faclity Leave Details"))
			{
				//setVisible(false);
				new TeacherDetails();
			}
			else if (mesg.equals("Student Leave Details"))
			{
				//setVisible(false);
				new Studentleavedetails();
			}
			else if (mesg.equals("Update Facility Details")) {
	            new UpdateTeacher();
	        } else if (mesg.equals("Update Student Details")) {
	            new updatestudent();
	        } else if (mesg.equals("Enter Marks")) {
	            new EnterMarks();
	        } else if (mesg.equals("Examination Details")) {
	            new ExaminationDetails();
	        } else if (mesg.equals("Fee Structure")) {
	            new FeeStructure();
	        } else if (mesg.equals("Student Fee Form")) {
	            new StudentFeeForm();
	        }
	}
}
