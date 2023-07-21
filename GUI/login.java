package projectjava.GUI;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
public class login extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
    JFrame f,f1;
    JTextField t1;
    JPasswordField t2;
    JPanel p1;
    JButton b1,b2;
    JLabel l1,l2,l3;
    JCheckBox cb;
    login(){
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,270);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setSize(450,270);
        l1 = new JLabel("Enter username");
        l1.setBounds(50,50, 90, 25);
        l2 = new JLabel("Enter password");
        l2.setBounds(50,100, 90, 25);
        l3 = new JLabel();
        l3.setBounds(0,-10, 450,270);
        l3.setIcon(new ImageIcon("C:/Users/hoang/Downloads/sakura.jpg"));
        t1 = new JTextField();
        t1.setBounds(170,50, 190, 27);
        t2 = new JPasswordField();
        t2.setBounds(170,100, 190, 27);
        b2 = new JButton("Login");
        b2.addActionListener(this);
        b2.setBounds(230,150, 90, 30);
        cb = new JCheckBox();
        cb.setBounds(330,160,17,17);
        cb.addActionListener(this);
        p1.add(l1);p1.add(l2);p1.add(t1);p1.add(t2);p1.add(b2);p1.add(cb);
        p1.add(l3); 
        f.add(p1);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    	String tk = "minhtri1702";
    	String mk = "gin230695";
        if (e.getSource()==b2){
        	if(t1.getText().matches(tk) && t2.getText().matches(mk)) {
        		f.dispose();
        		new thongke();
        	}
        	else {
        		JOptionPane.showMessageDialog(this,"Sai tài khoản hoặc mật khẩu");
        		t2.setText(null);
        	}
        }
        if (cb.isSelected()){
            t2.setEchoChar((char)0);
        }
        else {
            t2.setEchoChar('*');
        }
    }
    public static void main(String[] args) {
        new login();
    }
}
