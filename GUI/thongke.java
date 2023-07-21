package projectjava.GUI;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.plaf.DimensionUIResource;
public class thongke extends JFrame implements ActionListener {
    JFrame f1;
    JButton b3,b4,b5,b6,b7,b8;
    thongke(){
        f1 = new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(540,370);
        f1.setLocationRelativeTo(null);
        f1.setContentPane(new JLabel(new ImageIcon("C:/Users/hoang/Downloads/anhthu1.jpg")));
        f1.setLayout(null);
        b3 = new JButton("Nhân viên");
        b3.setBounds(90, 90, 110, 30);
        b3.addActionListener(this);
        b4 = new JButton("Sản phẩm");
        b4.addActionListener(this);
        b4.setBounds(90, 150, 110, 30);
        b5 = new JButton("Khách hàng");
        b5.addActionListener(this);
        b5.setBounds(90, 210, 110, 30);
        b6 = new JButton("Đơn hàng");
        b6.addActionListener(this);
        b6.setBounds(290, 90, 110, 30);
        b7 = new JButton("Chi tiết");
        b7.addActionListener(this);
        b7.setBounds(290, 150, 110, 30);
        b8 = new JButton("Đăng xuất");
        b8.addActionListener(this);
        b8.setBounds(290, 210, 110, 30);
        f1.add(b3);f1.add(b4);f1.add(b5);f1.add(b6);f1.add(b7);f1.add(b8);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource()==b3){
            f1.dispose();
            new nhanviendata();
        }
        if (e.getSource()==b4){
            f1.dispose();
            new productdata();
        }
        if (e.getSource()==b5){
            f1.dispose();
            new khachhangdata();
        }
        if (e.getSource()==b6){
            f1.dispose();
            new hoadondata();
        }
        if (e.getSource()==b7){
            f1.dispose();
            new chitietdata();
        }
        if (e.getSource()==b8){
            f1.dispose();
            new login();
        }
    }
    public static void main(String[] args) {
        new thongke();
    }
}
