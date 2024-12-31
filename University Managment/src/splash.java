import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class splash extends JFrame  implements Runnable{
	
	 splash() {
		
		 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
		 Image ii=i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
		 ImageIcon  i2=new ImageIcon(ii);
		 JLabel image=new JLabel(i2);
		 add(image);
		 setVisible(true);
		 
		 
		
		 
		setSize(1000,650);
		setLocation(150,20);
		 try {
				Thread.sleep(3000);
				setVisible(false);
				new Login();
			}
			catch (Exception e)
			{
			}
		
	}
	
	public static void main(String[] args) {
		new splash();
		//new Login();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
