package projectjava.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import projectjava.DTO.*;

public class nhanvienDAL {
	Connection con;
	public boolean openConnection() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/javaproduct";
			String username = "root"; String password= "";
			con = (Connection) DriverManager.getConnection( dbUrl, username, password);
			return true;
		} catch(Exception ex){
			System.out.println("thất bại");
			System.out.println(ex);
			return false;
		}
	}
	public void closeConnection() {
		try {
			if(con != null) {
				con.close();
			}
		}
		catch (SQLException ex) {
			System.out.println(ex);
		}
	}
	public Vector<nhanvien> getAllnhanviens(){
		Vector <nhanvien> a = new Vector<nhanvien>();
		if(openConnection()) {
				try {
					String sql = "Select * from nhanvien";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						nhanvien x = new nhanvien();
						x.setmanv(rs.getString("manv"));
						x.setten(rs.getString("tennv"));
						x.setage(rs.getInt("age"));
						x.setsdt(rs.getString("sdt"));
						a.add(x);
					}
				}
				catch (Exception ex) {
					System.out.println("thất bại");
					System.out.println(ex);
				}
				finally {
					closeConnection();
				}
			}
		return a;
		}
	public boolean delnhanviens(nhanvien a){
		boolean result = false;
		if(openConnection()) {
				try {
					String sql = "delete from nhanvien where manv = ?";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, a.getmanv());
					stmt.executeUpdate();
					if (stmt.executeUpdate()>=1) {
						result = true;
					}
				}
				catch (Exception ex) {
					System.out.println("thất bại");
					System.out.println(ex);
				}
				finally {
					closeConnection();
				}
			}
			return result;
		}
	public boolean addnhanvien (nhanvien a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "Insert into nhanvien values(?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.getmanv());
				stmt.setString(2,a.getten());
				stmt.setInt(3,a.getage());
				stmt.setString(4,a.getsdt());
				if (stmt.executeUpdate()>=1) {
					result = true;
				}
			}
			catch (Exception ex) {
				System.out.println(ex);
			}
			finally {
				closeConnection();
			}
		}
		return result;
	}
	public boolean updatenhanvien (nhanvien a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update nhanvien set tennv = ?, age = ?, sdt = ? where manv = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(4,a.getmanv());
				stmt.setString(1,a.getten());
				stmt.setInt(2,a.getage());
				stmt.setString(3,a.getsdt());
				if (stmt.executeUpdate()>=1) {
					result = true;
				}
			}
			catch (Exception ex) {
				System.out.println(ex);
			}
			finally {
				closeConnection();
			}
		}
		return result;
	}
	public boolean updatenhanvien2 (nhanvien a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update nhanvien set manv = ?, tennv = ?, age = ? where sdt = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.getmanv());
				stmt.setString(2,a.getten());
				stmt.setInt(3,a.getage());
				stmt.setString(4,a.getsdt());
				if (stmt.executeUpdate()>=1) {
					result = true;
				}
			}
			catch (Exception ex) {
				System.out.println(ex);
			}
			finally {
				closeConnection();
			}
		}
		return result;
	}
}
