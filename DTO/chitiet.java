package projectjava.DTO;
import projectjava.BLL.*;
import java.util.Vector;
public class chitiet {
	String mahd, masp, date;
	int soluong;
	public chitiet() {}
	public chitiet(String hd, String sp, String d , int s) {
		this.mahd = hd;
		this.masp = sp;
		this.date = d;
		this.soluong = s;
	}
	public String getmahd() {
		return this.mahd;
	}
	public void setmahd(String hd) {
		this.mahd = hd;
	}
	public String getmasp() {
		return this.masp;
	}
	public void setmasp(String sp) {
		this.masp = sp;
	}
	public int getsoluong() {
		return this.soluong;
	}
	public void setsoluong(int s) {
		this.soluong = s;
	}
	public String getdate() {
		return this.date;
	}
	public void setdate(String d) {
		this.date = d ;
	}
	public int getgia() {
		int s = 0;
		BLLproduct a = new BLLproduct();
		Vector <sanpham> b = new Vector <sanpham>();
		b = a.getAllproducts();
		for(int i =0; i<b.size();i++) {
			if(this.masp.matches(b.get(i).getmasp())) {
				s = this.soluong* b.get(i).getgia();
			}
		}
		return s;
	}
}
