package projectjava.DAL;
import projectjava.DTO.*;
import java.sql.*;
import com.mysql.cj.jdbc.*;
import java.util.Vector;
public class productDAL{
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
	public Vector<sanpham> getAllproducts(){
		Vector <sanpham> a = new Vector<sanpham>();
		if(openConnection()) {
				try {
					String sql = "Select * from product";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						sanpham x = new sanpham();
						x.setmasp(rs.getString("MaSP"));
						x.settensp(rs.getString("TenSP"));
						x.setgia(rs.getInt("Gia"));
						x.setloaisp(rs.getString("LoaiSanPham"));
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
	public boolean delproducts(sanpham a){
		boolean result = false;
		if(openConnection()) {
				try {
					String sql = "delete from product where MaSP = ?";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, a.getmasp());
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
	

	
	public boolean delproducts2 (sanpham a) {
		boolean rssw = false;
		if(openConnection()) {
			try {				
				String sql = "Delete from product where MaSP = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, a.getmasp());
				if (stmt.executeUpdate() >= 1) 
				{
					rssw = true;
				}
			}
			catch(Exception ex) {
				System.out.println(ex);
			}
			finally {
				closeConnection();
			}
		}
		return rssw;
	}	
	
	
	
	
	
	
	
	public boolean addproduct (sanpham a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "Insert into product values(?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.getmasp());
				stmt.setString(2,a.gettensp());
				stmt.setInt(3,a.getgia());
				stmt.setString(4,a.getloaisp());
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
	public boolean updateproduct (sanpham a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update product set TenSP = ?, Gia = ?, LoaiSanPham = ? where MaSP = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(4,a.getmasp());
				stmt.setString(1,a.gettensp());
				stmt.setInt(2,a.getgia());
				stmt.setString(3,a.getloaisp());
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
	public boolean updateproduct2 (sanpham a) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "update product set MaSP = ?, TenSP = ?, Gia = ? where LoaiSanPham = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,a.getmasp());
				stmt.setString(2,a.gettensp());
				stmt.setInt(3,a.getgia());
				stmt.setString(4,a.getloaisp());
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