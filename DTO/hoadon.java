package projectjava.DTO;
import projectjava.BLL.*;
import java.util.Vector;
public class hoadon {
	String mahd, makh, manv;
	int gia;
	public hoadon() {}
	public hoadon(String hd, String kh, String nv) {
		this.mahd = hd;
		this.makh = kh;
		this.manv = nv;
		this.gia = 0;
	}
	public String gethd() {
		return this.mahd;
	}
	public void sethd(String hd) {
		this.mahd = hd;
	}
	public String getkh() {
		return this.makh;
	}
	public void setkh(String kh) {
		this.makh = kh;
	}
	public String getnv() {
		return this.manv;
	}
	public void setnv(String nv) {
		this.manv = nv;
	}
	public int getgia() {
		BLLchitiet a = new BLLchitiet();
		Vector <chitiet> b = new Vector<chitiet>();
		b = a.getAllchitiets();
		int s =0;
		for (int i = 0; i< b.size(); i++) {
			if(this.mahd.matches(b.get(i).getmahd())) {
				s += b.get(i).getgia();
			}
		}
		this.gia = s;
		return this.gia;
	}
	public void setgia(int gia) {
		this.gia = gia;
	}
}
