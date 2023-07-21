package projectjava.BLL;

import java.util.Vector;

import projectjava.DAL.hoadonDAL;
import projectjava.DTO.hoadon;

public class BLLhoadon {
	hoadonDAL x = new hoadonDAL();
	public Vector<hoadon> getAllhoadons(){
		return x.getAllhoadons();
	}
	public String addhoadon(hoadon a) {
		if(x.addhoadon(a)) {
			return "thêm thành công";
		}
		return "thêm thất bại";
	}
	public String delhoadons(hoadon a) {
		if(x.delhoadons(a)) {
			return "xóa thành công";
		}
		return "xóa thất bại";
	}
	public String updatehoadon(hoadon a) {
		if(x.updatehoadon(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
	public String updatehoadon2(hoadon a) {
		if(x.updatehoadon2(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
}