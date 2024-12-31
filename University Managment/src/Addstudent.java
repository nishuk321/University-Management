import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Addstudent extends JFrame implements ActionListener{
	
	JTextField name,fathername,address,phoneno,email,classXth,classX11,aadhar;
	
	Random ran=new Random();
	
	long rollno=(ran.nextLong(1000)+1000);
	JDateChooser date;
	
	String rollnumber="1854"+rollno;
	
	JComboBox course,branch;
	JButton submit,cancle;
	
	public Addstudent() {
		// TODO Auto-generated constructor stub
		
		setSize(900,630);
		setLocation(200,30);
		setLayout(null);
		
		JLabel heading=new JLabel("New Student Details");
		heading.setBounds(280, 20, 550, 50);
		heading.setFont(new Font("serif", Font.BOLD,35));
		add(heading);
		
		JLabel labname=new JLabel("Name");
		labname.setBounds(50, 100, 150, 25);
		labname.setFont(new Font("serif", Font.BOLD, 25));
		add(labname);
		
		
		name=new JTextField();
		name.setBounds(200, 100, 150,25);
		add(name);
		
		

		JLabel labfname=new JLabel("Father's Name");
		labfname.setBounds(450, 100, 200, 25);
		labfname.setFont(new Font("serif", Font.BOLD, 25));
		add(labfname);
		
		
		fathername=new JTextField();
		fathername.setBounds(700, 100, 150,25);
		add(fathername);
		
		
		JLabel labroll=new JLabel("Roll No:");
		labroll.setBounds(50, 175, 150, 25);
		labroll.setFont(new Font("serif", Font.BOLD, 25));
		add(labroll);
		
		
		JLabel textroll=new JLabel(rollnumber);
		textroll.setBounds(200, 175, 150,25);
		textroll.setFont(new Font("serif", Font.BOLD, 25));
		add(textroll);
		
		
		JLabel labcalander=new JLabel("Date Of Birth");
		labcalander.setBounds(450, 175, 200, 25);
		labcalander.setFont(new Font("serif", Font.BOLD, 25));
		add(labcalander);
		
		

		date =new JDateChooser();
		date.setBounds(700, 175, 150,25);
		add(date);
		
		
		JLabel labaddress=new JLabel("Address");
		labaddress.setBounds(50, 250, 150, 25);
		labaddress.setFont(new Font("serif", Font.BOLD, 25));
		add(labaddress);
		
		
		address=new JTextField();
		address.setBounds(200, 250, 150,25);
		add(address);
		
		

		JLabel labphoneno=new JLabel("Phone No:");
		labphoneno.setBounds(450, 250, 200, 25);
		labphoneno.setFont(new Font("serif", Font.BOLD, 25));
		add(labphoneno);
		
		
        phoneno =new JTextField();
		phoneno.setBounds(700, 250, 150,25);
		add(phoneno);
		
		

		JLabel labemail=new JLabel("Email");
		labemail.setBounds(50, 325, 150, 25);
		labemail.setFont(new Font("serif", Font.BOLD, 25));
		add(labemail);
		
		
		email=new JTextField();
		email.setBounds(200, 325, 150,25);
		add(email);
		
		

		JLabel labclass10th=new JLabel("Class 10th % ");
		labclass10th.setBounds(450, 325, 200, 25);
		labclass10th.setFont(new Font("serif", Font.BOLD, 25));
		add(labclass10th);
		
		
        classXth=new JTextField();
		classXth.setBounds(700, 325, 150,25);
		add(classXth);
		
		JLabel labclass12th=new JLabel("Class 12th % ");
		labclass12th.setBounds(50, 400, 200, 25);
		labclass12th.setFont(new Font("serif", Font.BOLD, 25));
		add(labclass12th);
		
		
        classX11=new JTextField();
		classX11.setBounds(200, 400, 150,25);
		add(classX11);
		
		JLabel labaadhar=new JLabel("Aadhaar Number");
		labaadhar.setBounds(450, 400, 200, 25);
		labaadhar.setFont(new Font("serif", Font.BOLD, 25));
		add(labaadhar);
		
		
        aadhar=new JTextField();
		aadhar.setBounds(700, 400, 150,25);
		add(aadhar);
		
		
		JLabel labcourse=new JLabel("Course");
		labcourse.setBounds(50, 475, 200, 25);
		labcourse.setFont(new Font("serif", Font.BOLD, 25));
		add(labcourse);
		
		String allcourse[]= {"MCA","BCA","DCA","BBA","MBA","BSC","MCOM"};
		course=new JComboBox(allcourse);
		course.setBounds(200, 475, 150, 25);
		course.setFont(new Font("serif", Font.BOLD, 15));
		add(course);
		
		
		JLabel labbranch=new JLabel("Branch");
		labbranch.setBounds(450, 475, 200, 25);
		labbranch.setFont(new Font("serif", Font.BOLD, 25));
		add(labbranch);
		
		
		String allbarnch[]= {"Computer Science","Electric","Electronic","Civil","Mechinical"};
        branch=new JComboBox(allbarnch);
		branch.setBounds(700, 475, 150,25);
		branch.setFont(new Font("serif", Font.BOLD, 15));
		add(branch);
       
		submit =new JButton("Submit");
		submit.setBounds(200, 540, 125, 30);
		submit.setBackground(Color.BLUE);
		submit.setFont(new Font("serif", Font.BOLD,20));
		submit.addActionListener(this);
		submit.setForeground(Color.WHITE);
		add(submit);
		
		
	    cancle =new JButton("Cancel");
		cancle.setBounds(490, 540, 125, 30);
		cancle.setBackground(Color.BLUE);
		cancle.setFont(new Font("serif", Font.BOLD,20));
		cancle.setForeground(Color.WHITE);
		cancle.addActionListener(this);
		add(cancle);
		
		
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Addstudent();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==submit)
		{
			String rname=name.getText();
			String rfather=fathername.getText();
			String roll=rollnumber;
			String dob=((JTextField)date.getDateEditor().getUiComponent()).getText();
			String raddress=address.getText();
			String remail=email.getText();
			String rx=classXth.getText();
			String rx11=classX11.getText();
			
			String raddhar=aadhar.getText();
			String rcourse=(String) course.getSelectedItem();
			String rbranch=(String) branch.getSelectedItem();
			
			System.out.println(rbranch);
			
			try {
				  String query = "INSERT INTO student VALUES('" + rname + "','" + rfather + "','" + roll + "','" + dob + "','" + raddress + "','" + remail + "','" + rx + "','" + rx11 + "','" + raddhar + "','" + rcourse + "','" + rbranch + "')";

				conn c=new conn();
			    c.s.executeUpdate(query);
			    JOptionPane.showMessageDialog(null,"Student Details inserted successfully" );
			    
			    setVisible(false);
			
			
			
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	else if (e.getSource()==cancle)
		{
		JOptionPane.showMessageDialog(null,"Student Details Not inserted " );
			setVisible(false);
		}
		
	}

}
