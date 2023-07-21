package projectjava.DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import projectjava.DTO.*;

public class chitietDAL {
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
	public Vector<chitiet> getAllchitiets(){
		Vector <chitiet> a = new Vector<chitiet>();
		if(openConnection()) {
				try {
					String sql = "Select * from chitiet";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						chitiet x = new chitiet();
						x.setmahd(rs.getString("mahd"));
						x.setmasp(rs.getString("MaSP"));
						x.setdate(rs.getString("date"));
						x.setsoluong(rs.getInt("quantity"));
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
	public boolean delchitiets(chitiet a){
		boolean result = false;
		if(openConnection()) {
				try {
					String sql = "delete from chitiet where mahd = ? and MaSP = ?";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, a.getmahd());
					stmt.setString(2, a.getmasp() );
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
	public boolean addchitiet (chitiet a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "Insert into chitiet values(?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.getmahd());
				stmt.setString(2,a.getmasp());
				stmt.setString(3,a.getdate());
				stmt.setInt(4,a.getsoluong());
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
	public boolean updatechitiet (chitiet a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update chitiet set MaSP = ?, date = ?, quantity = ? where mahd = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(4,a.getmahd());
				stmt.setString(1,a.getmasp());
				stmt.setString(2,a.getdate());
				stmt.setInt(3,a.getsoluong());
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
	public boolean updatechitiet2 (chitiet a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update chitiet set mahd = ?, MaSP = ?, date = ? where quantity = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.getmahd());
				stmt.setString(2,a.getmasp());
				stmt.setString(3,a.getdate());
				stmt.setInt(4,a.getsoluong());
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
