package projectjava.DTO;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
public class khachhang {
    String makh,Hoten,email,sdtTF;
    public khachhang(String m,String h, String e,String sdt){
        this.makh = m;
        this.Hoten = h;
        this.email = e;
        this.sdtTF = sdt;
    }
    public khachhang(){
    }
    public String getmakh(){
        return makh;
    }
    public void setmakh(String m){
        this.makh = m;
    }
    public String getHoten(){
        return Hoten;
    }
    public void setHoten(String h){
        this.Hoten = h;
    }
    public String getemail() {
    	return this.email;
    }
    public void setemail(String e) {
    	this.email = e;
    }
    public String getsdt(){
        return this.sdtTF;
    }
    public void setsdt(String x){
    	this.sdtTF = x;
    }
    public String toString(){
    	return "ho ten: " + this.Hoten + ", email: " + this.email + ", số điện thoại: "+ this.sdtTF;
    }
    public static void main(String[] args) {
    }
}
