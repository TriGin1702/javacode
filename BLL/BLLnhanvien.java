package projectjava.BLL;

import java.util.Vector;

import projectjava.DAL.nhanvienDAL;
import projectjava.DTO.nhanvien;

public class BLLnhanvien {
	nhanvienDAL x = new nhanvienDAL();
	public Vector<nhanvien> getAllnhanviens(){
		return x.getAllnhanviens();
	}
	public String addnhanvien(nhanvien a) {
		if(x.addnhanvien(a)) {
			return "thêm thành công";
		}
		return "thêm thất bại";
	}
	public String delnhanviens(nhanvien a) {
		if(x.delnhanviens(a)) {
			return "xóa thành công";
		}
		return "xóa thất bại";
	}
	public String updatenhanvien(nhanvien a) {
		if(x.updatenhanvien(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
	public String updatenhanvien2(nhanvien a) {
		if(x.updatenhanvien2(a)) {
			return "cập nhật thành công";
		}
		return "cập nhật thất bại";
	}
}
