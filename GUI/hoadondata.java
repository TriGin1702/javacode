package projectjava.GUI;
import projectjava.DTO.*;
import projectjava.BLL.*;
import projectjava.DAL.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
public class hoadondata extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JFrame f,f1,f2,f3;
	BLLhoadon bll = new BLLhoadon();
    DefaultTableModel model1 = new DefaultTableModel();
    Vector <hoadon> k = new Vector<hoadon>();
    DefaultTableModel model2 = new DefaultTableModel();
    DefaultTableModel model3 = new DefaultTableModel();
    DefaultTableModel model4 = new DefaultTableModel();
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JPanel p,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11;
    JTable jTable1,jTable2,jTable3,jTable4;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    JComboBox jb,jb1,jb2,jb3;
    String[] h;
    String[] h1;
    Icon i1= new ImageIcon("C:/Users/hoang/Downloads/Add1-icon.png");
    Icon i2= new ImageIcon("C:/Users/hoang/Downloads/Button1-Delete-icon.png");
    Icon i3= new ImageIcon("C:/Users/hoang/Downloads/Favorities1-icon.png");
    Icon i4= new ImageIcon("C:/Users/hoang/Downloads/Zoom1-icon.jpg");
    Icon i5= new ImageIcon("C:/Users/hoang/Downloads/Pencil1-icon.png");
    Icon i6= new ImageIcon("C:/Users/hoang/Downloads/back1-icon.png");
    hoadondata(){
    	Vector <khachhang> k1 = new Vector <khachhang>();
    	BLLkhachhang y = new BLLkhachhang();
    	k1 = y.getAllkhachhangs();
    	Vector <nhanvien> k2 = new Vector <nhanvien>();
    	BLLnhanvien y1 = new BLLnhanvien();
    	k2 = y1.getAllnhanviens();
    	h = new String[k1.size()];
    	h1 = new String[k2.size()];
    	for (int i=0; i<k1.size();i++) {
    		h[i] = k1.get(i).getmakh();
    	}
    	for (int i=0; i<k2.size();i++) {
    		h1[i] = k2.get(i).getmanv();
    	}
    	jb = new JComboBox(h);
    	jb.setEditable(true);
    	jb.addActionListener(this);
    	jb1 = new JComboBox(h1);
    	jb1.setEditable(true);
    	jb1.addActionListener(this);
    	jb2 = new JComboBox(h);
    	jb2.setEditable(true);
    	jb2.addActionListener(this);
    	jb3 = new JComboBox(h1);
    	jb3.setEditable(true);
    	jb3.addActionListener(this);
        f = new JFrame("bảng hóa đơn");
        f1 = new JFrame("Thêm hóa đơn");
        f2 = new JFrame("tìm kiếm hóa đơn");
        f3 = new JFrame("bảng chỉnh sửa ");
        jTable1 = new JTable();
        jTable2 = new JTable();
        jTable3 = new JTable();
        jTable4 = new JTable();
        jTable1.setModel(model1);
        jTable2.setModel(model2);
        jTable3.setModel(model3);
        model1.addColumn("Mã hóa đơn:");
        model1.addColumn("mã khách hàng");
        model1.addColumn("Mã nhân viên");
        model1.addColumn("Giá");
        model2.addColumn("Mã hóa đơn:");
        model2.addColumn("mã khách hàng");
        model2.addColumn("Mã nhân viên");
        model2.addColumn("Giá");
        model3.addColumn("Mã hóa đơn:");
        model3.addColumn("mã khách hàng");
        model3.addColumn("Mã nhân viên");
        model3.addColumn("Giá");
        jTable1.setRowHeight(30);
        jTable2.setRowHeight(45);
        jTable3.setRowHeight(45);
        k = bll.getAllhoadons();
        for (int i = 0; i < k.size(); i++) {
        	hoadon s = k.get(i);
        	model1.addRow(new Object[] {
        			s.gethd(),s.getkh(),s.getnv(),s.getgia()
        	});
        }
        f.setSize(900,540);
        f1.setSize(700,250);
        f2.setSize(700,450);
        f3.setSize(700,250);
        f.setLocationRelativeTo(null);
        f1.setLocationRelativeTo(f);
        f2.setLocationRelativeTo(f);
        f3.setLocationRelativeTo(f);
	    f.setContentPane(new JLabel(new ImageIcon("C:/Users/hoang/Downloads/gala1.jpg")));
        f.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f3.setLayout(new FlowLayout(FlowLayout.CENTER));
        f2.setLayout(new FlowLayout(FlowLayout.CENTER));
        t1 = new JTextField(13);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t2 = new JTextField(13);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t3 = new JTextField(13);
        t3.setHorizontalAlignment(JTextField.CENTER);
        t4 = new JTextField(13);
        t4.setHorizontalAlignment(JTextField.CENTER);
        t4.setEditable(false);
        t5 = new JTextField(13);
        t5.setHorizontalAlignment(JTextField.CENTER);
        t6 = new JTextField(13);
        t6.setHorizontalAlignment(JTextField.CENTER);
        t7 = new JTextField(13);
        t7.setHorizontalAlignment(JTextField.CENTER);
        t8 = new JTextField(13);
        t8.setHorizontalAlignment(JTextField.CENTER);
        t9 = new JTextField(13);
        t9.setHorizontalAlignment(JTextField.CENTER);
        t10 = new JTextField(13);
        t10.setHorizontalAlignment(JTextField.CENTER);
        t11 = new JTextField(13);
        t11.setHorizontalAlignment(JTextField.CENTER);
        t12 = new JTextField(13);
        t12.setHorizontalAlignment(JTextField.CENTER);
        t12.setEditable(false);
        p3 = new JPanel();
        JLabel l2 = new JLabel("hóa đơn thêm: ");
        l2.setFont(new FontUIResource("Arial",Font.BOLD,19));
        p3.setPreferredSize(new DimensionUIResource(585, 50));
        JLabel l7 = new JLabel("hóa đơn cần tìm: ");
        l7.setFont(new FontUIResource("Arial",Font.BOLD,19));
        p6 = new JPanel();
        p6.setPreferredSize(new DimensionUIResource(585, 50));
        p9 = new JPanel();
        JLabel l12 = new JLabel("hóa đơn thêm: ");
        l12.setFont(new FontUIResource("Arial",Font.BOLD,19));
        p9.setPreferredSize(new DimensionUIResource(585, 50));
        p6.add(l7);
        p3.add(l2);
        p9.add(l12);
        f1.add(p3);
        f2.add(p6);
        f3.add(p9);
        p4 = new JPanel();
        p4.setPreferredSize(new DimensionUIResource(500, 70));
        p4.setLayout(new GridLayout(2,4,0,10));
        p10 = new JPanel();
        p10.setPreferredSize(new DimensionUIResource(500, 70));
        p10.setLayout(new GridLayout(2,4,0,10));
        JLabel l3 = new JLabel("mã hóa đơn ");
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l4 = new JLabel("mã khách hàng ");
        l4.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l5 = new JLabel("Mã nhân viên ");
        l5.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l6 = new JLabel("Giá ");
        l6.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l13 = new JLabel("mã hóa đơn ");
        l13.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l14 = new JLabel("mã khách hàng ");
        l14.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l15 = new JLabel("Mã nhân viên ");
        l15.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l16 = new JLabel("Giá ");
        l16.setHorizontalAlignment(SwingConstants.CENTER);
        p4.add(l3);p4.add(l4);p4.add(l5);p4.add(l6);
        p4.add(t1);p4.add(jb);p4.add(jb1);p4.add(t4);
        p10.add(l13);p10.add(l14);p10.add(l15);p10.add(l16);
        p10.add(t9);p10.add(jb2);p10.add(jb3);p10.add(t12);
        p8 = new JPanel();
        p8.setPreferredSize(new DimensionUIResource(500, 70));
        p8.setLayout(new GridLayout(2,4,0,10));
        JLabel l8 = new JLabel("Mã hóa đơn:: ");
        l8.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l9 = new JLabel("Mã khách hàng ");
        l9.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l10 = new JLabel("Mã nhân viên ");
        l10.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l11 = new JLabel("Giá ");
        l11.setHorizontalAlignment(SwingConstants.CENTER);
        b7 = new JButton("OKAY");
        b7.addActionListener(this); 
        p5 = new JPanel();
        p5.setPreferredSize(new DimensionUIResource(500, 50));
        p5.setLayout(new FlowLayout(FlowLayout.RIGHT,50,20));
        b9 = new JButton("OKAY");
        b9.addActionListener(this); 
        p11 = new JPanel();
        p11.setPreferredSize(new DimensionUIResource(500, 50));
        p11.setLayout(new FlowLayout(FlowLayout.RIGHT,50,20));
        p8.add(l8);p8.add(l9);p8.add(l10);p8.add(l11);
        p8.add(t5);p8.add(t6);p8.add(t7);p8.add(t8);
        p5.add(b7);p11.add(b9);
        f1.add(p4);f1.add(p5);
        f3.add(p10);f3.add(p11);
        f2.add(p8);
        p1 = new JPanel();
        p1.setPreferredSize(new DimensionUIResource(583, 360));
        p = new JPanel();
        JLabel l = new JLabel("hóa đơn");
        p.setPreferredSize(new DimensionUIResource(200, 30));
        JScrollPane js = new JScrollPane(jTable1);
        JScrollPane js2 = new JScrollPane(jTable2);
        JScrollPane js3 = new JScrollPane(jTable3);
        js.setPreferredSize(new DimensionUIResource(580, 320));
        js2.setPreferredSize(new DimensionUIResource(836, 70));
        js3.setPreferredSize(new DimensionUIResource(580, 190));
        f2.add(js3);
        p7 = new JPanel();
        p7.setPreferredSize(new DimensionUIResource(500, 50));
        p7.setLayout(new FlowLayout(FlowLayout.RIGHT,50,20));
        b8 = new JButton("Search");
        b8.addActionListener(this);
        p7.add(b8);
        f2.add(p7);
        p1.setLayout(new FlowLayout());
        p.add(l);
        p1.add(p);
        p1.add(js);
        p2 = new JPanel();
        p2.setSize(200,400);
        b1 = new JButton("Add",i1);
        b1.addActionListener(this);
        b2 = new JButton("Delete",i2);
        b2.addActionListener(this);
        b3 = new JButton("show",i3);
        b3.addActionListener(this);
        b4 = new JButton("search",i4);
        b4.addActionListener(this);
        b5 = new JButton("edit",i5);
        b5.addActionListener(this);
        b6 = new JButton("back",i6);
        b6.addActionListener(this);
        p2.setLayout(new GridLayout(3,2,5,5));
        p2.setPreferredSize(new DimensionUIResource(200,95));
        p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);p2.add(b5);p2.add(b6);
        f.add(p1);f.add(p2);f.add(js2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1){
            f1.setVisible(true);
        }
        if (e.getSource()== jb) {
        	t2.setText(jb.getSelectedItem().toString());
        }
        if (e.getSource()== jb1) {
        	t3.setText(jb1.getSelectedItem().toString());
        }
        if (e.getSource()== jb2) {
        	t10.setText(jb2.getSelectedItem().toString());
        }
        if (e.getSource()== jb3) {
        	t11.setText(jb3.getSelectedItem().toString());
        }
        if (e.getSource() == b7){
        	if (t1.getText().trim().equals("")) {
        		JOptionPane.showMessageDialog(this,"Vui lòng nhập đủ thông tin");
        	}
        	else {
        		if (t2.getText().matches("")) {
        			t2.setText(h[0].toString());
        		}
        		if (t3.getText().matches("")) {
        			t3.setText(h1[0].toString());
        		}
        		k.add(new hoadon(t1.getText(),t2.getText(),t3.getText()));
        		int i = k.size()-1;
        		hoadon s = k.get(i);
        		model1.addRow(new Object[]{
        				s.gethd(),s.getkh(),s.getnv(),s.getgia()
        		});
        		bll.addhoadon(s);
        		JOptionPane.showMessageDialog(this,"thêm hóa đơn thành công");
        	}
            t1.setText(null);t2.setText(null);t3.setText(null);
//            f1.dispose();
        }
        if (e.getSource()== b4){
            f2.setVisible(true);
        }
        if (e.getSource() == b8){
            model3.setRowCount(0);
            int i;
            for(i =0; i<k.size();i++){
                hoadon s = k.get(i);
                if ((t5.getText().matches(s.gethd())||t5.getText().matches(""))&&(t6.getText().matches(s.getkh())||t6.getText().matches("")) && (t7.getText().matches(s.getnv())||t7.getText().matches(""))&&(t8.getText().matches(String.valueOf(s.getgia()))||t8.getText().matches("") )){
                    model3.addRow(new Object[]{
                        s.gethd(),s.getkh(),s.getnv(),s.getgia()
                    });
                }
            }
            if(model3.getRowCount() == 0){
                JOptionPane.showMessageDialog(this,"dữ liệu nhập không chính xác");
            }
            t5.setText(null);t6.setText(null);t7.setText(null);t8.setText(null);
        }
        if(e.getSource() == b2){
            int i = jTable1.getSelectedRow();
            if (i>-1){
                int ques = JOptionPane.showConfirmDialog(this,"bạn có chắc muốn xóa không?");
                if(ques==JOptionPane.YES_OPTION){
                    model1.removeRow(i);
                    bll.delhoadons(k.get(i));
                    k.remove(i);
                }
            }
        }
        if(e.getSource() == b3){
            int i = jTable1.getSelectedRow();
            hoadon a = k.get(i);
            if (i>-1){
                model2.insertRow(0,new Object[]{
                    a.gethd(),a.getkh(),a.getnv(),a.getgia()
                });;
                if(model2.getRowCount()==2){
                    model2.removeRow(1);
                }
            }
        }
        if(e.getSource() == b5){
            int i = jTable1.getSelectedRow();
            hoadon b = k.get(i);
            t9.setText(b.gethd());t12.setText(String.valueOf(b.getgia()));jb2.getEditor().setItem(k.get(i).getkh());jb3.getEditor().setItem(k.get(i).getnv());
        	f3.setVisible(true);
        }
        if(e.getSource()== b9) {
        	int i = jTable1.getSelectedRow();
        	hoadon b= new hoadon();
        	if (t10.getText().matches("")) {
    			t10.setText(k.get(i).getkh());
    		}
    		if (t11.getText().matches("")) {
    			t11.setText(k.get(i).getnv());
    		}
        	b.sethd(t9.getText());b.setkh(t10.getText());b.setnv(t11.getText());
//        	if(b.gethd().matches(k.get(i).gethd()) == false && b.getgia() != k.get(i).getgia()){
//        		JOptionPane.showMessageDialog(f3,"không thể sửa mã hóa đơn và giá cùng lúc");
//        	}
//        	else {
//        	}
    		model1.insertRow(i, new Object[] {
    				b.gethd(),b.getkh(),b.getnv(),b.getgia()
    		});
    		model1.removeRow(i+1);
    		k.set(i,b);
    		bll.updatehoadon(b);
    		bll.updatehoadon2(b);
        }
        if(e.getSource()==b6){
            f.dispose();
            new thongke();
        }
    }
	public static void main(String[] args) {
		new hoadondata();

	}
}
