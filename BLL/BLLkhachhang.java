package projectjava.BLL;
import projectjava.DAL.*;
import projectjava.DTO.*;
import java.util.Vector;
public class BLLkhachhang {
	khachhangDAL x = new khachhangDAL();
	public Vector<khachhang> getAllkhachhangs(){
		return x.getAllkhachhangs();
	}
	public String addkhachhang(khachhang a) {
		if(x.addkhachhang(a)) {
			return "thêm thành công";
		}
		return "thêm thất bại";
	}
	public String delkhachhangs(khachhang a) {
		if(x.delkhachhangs(a)) {
			return "xóa thành công";
		}
		return "xóa thất bại";
	}
	public String updatekhachhang(khachhang a) {
		if(x.updatekhachhang(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
	public String updatekhachhang2(khachhang a) {
		if(x.updatekhachhang2(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
}