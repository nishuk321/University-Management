import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class Login extends JFrame implements ActionListener{
	 JButton  login,cancle;
	 JTextField textusername;JPasswordField textpassword;
	
	 Login() {
		 getContentPane().setBackground(Color.WHITE);
		 setLayout(null);
		 
		 JLabel lbusername=new JLabel("Username");
		 lbusername.setBounds(50, 20,100, 20);
		 lbusername.setFont(new Font("sherif",Font.BOLD, 15));
		 add(lbusername);
		 
		 textusername=new JTextField();
		 textusername.setBounds(185, 20, 100, 20);
		 add(textusername);
		 
		 
		 JLabel lbpassword=new JLabel("Password");
		 lbpassword.setBounds(50, 70,100, 20);
		 lbpassword.setFont(new Font("sherif",Font.BOLD, 15));
		 add(lbpassword);
		 
		 textpassword= new JPasswordField();
		 textpassword.setBounds(185, 70, 100, 20);
		 add(textpassword);
		 
		 login=new JButton("Login");
		 login.setBounds(195, 140, 90, 25);
		 login.setBackground(Color.BLUE);
		 login.setForeground(Color.WHITE);
		 login.setFont(new Font("Tahoma",Font.BOLD, 14));
		 login.addActionListener(this);
		 add(login);
		 
		 
		 cancle=new JButton("Cancel");
		 cancle.setBounds(75, 140, 90, 25);
		 cancle.setBackground(Color.BLUE);
		 cancle.setForeground(Color.WHITE);
		 cancle.setFont(new Font("Tahoma",Font.BOLD, 14));
		 cancle.addActionListener(this);
		 add(cancle);
		 
		 ImageIcon i=new ImageIcon( ClassLoader.getSystemResource("icons/second.jpg") );
		 Image i2= i.getImage().getScaledInstance(180, 180,Image.SCALE_DEFAULT);
		 ImageIcon i3=new ImageIcon(i2);
		 JLabel image=new JLabel(i3);
		 image.setBounds(330, 10, 200, 200);
		 add(image);
		 
		 
		 
		 setSize(550,300);
		 setLocation(350,200);
		 setVisible(true);
		
	}
	
	
	

	
	public static void main(String[] args) {
		
		new Login();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==login)
		{
			String username=textusername.getText();
			String password=textpassword.getText();
			
			String query="select * from login where username='"+username+"'and password='"+password+"'";
			
			
			try {
				
				conn c=new conn();
				ResultSet rs=c.s.executeQuery(query);
				System.out.println(rs);
				
				if(rs.next())
				{
					setVisible(false);
					new project();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username Or Password");
					setVisible(false);
				}
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		else if(e.getSource()==cancle)
		{
			setVisible(false);
		}
		
	}

}
