package projectjava.DTO;
public class sanpham {
    String masp,tensp,loaisanpham;
    int gia;
    public sanpham(String m,String t, int g, String l){
        this.masp = m;
        this.tensp = t;
        this.gia = g;
        this.loaisanpham= l;
    }
    public sanpham(){
    }
    public void setmasp(String m){
        this.masp = m;
    }
    public String getmasp(){
        return this.masp;
    }
    public void settensp(String t){
        this.tensp = t;
    }
    public String gettensp(){
        return this.tensp;
    }
    public void setgia(int g){
        this.gia = g;
    }
    public int getgia(){
        return this.gia;
    }
    public void setloaisp(String l){
        this.loaisanpham = l;
    }
    public String getloaisp(){
        return this.loaisanpham;
    }
    public String toString() {
    	return "mã sản phẩm: "+ this.masp +" tên sản phẩm: " + this.tensp + " giá: " + this.gia + " loại: "+this.loaisanpham;
    }
}
