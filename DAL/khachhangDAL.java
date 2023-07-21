package projectjava.DAL;
import projectjava.DTO.*;
import java.sql.*;
import com.mysql.cj.jdbc.*;
import java.util.Vector;
public class khachhangDAL{
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
	public Vector<khachhang> getAllkhachhangs(){
		Vector <khachhang> a = new Vector<khachhang>();
		if(openConnection()) {
				try {
					String sql = "Select * from khachhang";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						khachhang x = new khachhang();
						x.setmakh(rs.getString("makh"));
						x.setHoten(rs.getString("tenkh"));
						x.setemail(rs.getString("email"));
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
	public boolean delkhachhangs(khachhang a){
		boolean result = false;
		if(openConnection()) {
				try {
					String sql = "delete from khachhang where makh = ?";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, a.getmakh());
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
	public boolean addkhachhang (khachhang a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "Insert into khachhang values(?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.getmakh());
				stmt.setString(2,a.getHoten());
				stmt.setString(3,a.getemail());
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
	public boolean updatekhachhang (khachhang a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update khachhang set tenkh = ?, email = ?, sdt = ? where makh = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(4,a.getmakh());
				stmt.setString(1,a.getHoten());
				stmt.setString(2,a.getemail());
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
	public boolean updatekhachhang2 (khachhang a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update khachhang set makh = ?, tenkh = ?, email = ? where sdt = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.getmakh());
				stmt.setString(2,a.getHoten());
				stmt.setString(3,a.getemail());
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