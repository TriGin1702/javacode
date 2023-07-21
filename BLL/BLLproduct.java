package projectjava.BLL;
import projectjava.DAL.*;
import projectjava.DTO.*;
import java.util.Vector;
public class BLLproduct {
	productDAL x = new productDAL();
	public Vector<sanpham> getAllproducts(){
		return x.getAllproducts();
	}
	public String addproduct(sanpham a) {
		if(x.addproduct(a)) {
			return "thêm thành công";
		}
		return "thêm thất bại";
	}
	public String delproducts(sanpham a) {
		if(x.delproducts(a)) {
			return "xóa thành công";
		}
		return "xóa thất bại";
	}
	public String updateproduct(sanpham a) {
		if(x.updateproduct(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
	public String updateproduct2(sanpham a) {
		if(x.updateproduct2(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
}
