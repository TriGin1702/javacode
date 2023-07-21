package projectjava.BLL;

import java.util.Vector;

import projectjava.DAL.chitietDAL;
import projectjava.DTO.chitiet;

public class BLLchitiet {
	chitietDAL x = new chitietDAL();
	public Vector<chitiet> getAllchitiets(){
		return x.getAllchitiets();
	}
	public String addchitiet(chitiet a) {
		if(x.addchitiet(a)) {
			return "thêm thành công";
		}
		return "thêm thất bại";
	}
	public String delchitiets(chitiet a) {
		if(x.delchitiets(a)) {
			return "xóa thành công";
		}
		return "xóa thất bại";
	}
	public String updatechitiet(chitiet a) {
		if(x.updatechitiet(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
	public String updatechitiet2(chitiet a) {
		if(x.updatechitiet2(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
}