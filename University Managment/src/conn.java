
import java.sql.*;


public class conn {
	
	Connection c;
	Statement s;
	 conn() {
		
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 c=DriverManager.getConnection("jdbc:mysql:///universitymanagment","root","Nishu803213@");
			 s=c.createStatement();
			 
			
		} catch (Exception e) {
			
		}
	}
	 

}
