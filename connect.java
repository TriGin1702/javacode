package projectjava;
import java.sql.*;
import java.util.Vector;
import com.mysql.cj.jdbc.*;
public class connect {
	public static void main(String args[]) throws ClassNotFoundException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/javaproduct";
			String username = "root"; String password= "";
			Connection conn = (Connection) DriverManager.getConnection( dbUrl, username, password);
			System.out.println("ket noi thanh cong.");
			System.out.println(conn.getCatalog());
		} catch(SQLException ex){
			System.out.println("ket noi that bai");
			System.out.println(ex);
			//Logger.getLogger(ConnectToXAMPP.class.getName()).log(Level.SEVERE, null, ex);
		}
	} 
}