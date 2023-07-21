package projectjava.DTO;

public class nhanvien {
	String manv,tennv,sdt;
	int age;
	public nhanvien(String m, String t, int a,String s) {
		this.manv = m;
		this.tennv = t;
		this.age = a;
		this.sdt = s;
	}
	public nhanvien() {}
	public String getmanv() {
		return this.manv;
	}
	public void setmanv(String m) {
		this.manv = m;
	}
	public String getten() {
		return this.tennv;
	}
	public void setten(String t) {
		this.tennv = t;
	}
	public String getsdt() {
		return this.sdt;
	}
	public void setsdt(String s) {
		this.sdt = s;
	}
	public int getage() {
		return this.age;
	}
	public void setage(int a) {
		this.age = a;
	}
}
