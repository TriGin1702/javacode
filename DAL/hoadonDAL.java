package projectjava.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import projectjava.DTO.*;

public class hoadonDAL {
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
	public Vector<hoadon> getAllhoadons(){
		Vector <hoadon> a = new Vector<hoadon>();
		if(openConnection()) {
				try {
					String sql = "Select * from hoadon";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						hoadon x = new hoadon();
						x.sethd(rs.getString("mahd"));
						x.setkh(rs.getString("makh"));
						x.setnv(rs.getString("manv"));
						x.setgia(rs.getInt("gia"));
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
	public boolean delhoadons(hoadon a){
		boolean result = false;
		if(openConnection()) {
				try {
					String sql = "delete from hoadon where mahd = ?";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, a.gethd());
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
	public boolean addhoadon (hoadon a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "Insert into hoadon values(?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.gethd());
				stmt.setString(2,a.getkh());
				stmt.setString(3,a.getnv());
				stmt.setInt(4,a.getgia());
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
	public boolean updatehoadon (hoadon a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update hoadon set makh = ?, manv = ? where mahd = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(3,a.gethd());
				stmt.setString(1,a.getkh());
				stmt.setString(2,a.getnv());
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
	public boolean updatehoadon2 (hoadon a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update hoadon set mahd = ?, makh = ? where manv = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.gethd());
				stmt.setString(2,a.getkh());
				stmt.setString(3,a.getnv());
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
