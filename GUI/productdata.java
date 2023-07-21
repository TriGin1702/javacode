package projectjava.GUI;
//import projectjava.thongke;
import projectjava.DTO.*;
import projectjava.BLL.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
public class productdata extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame f,f1,f2;
	BLLproduct dal = new BLLproduct();
    DefaultTableModel model1 = new DefaultTableModel();
    Vector <sanpham> k = new Vector<sanpham>();
    DefaultTableModel model2 = new DefaultTableModel();
    DefaultTableModel model3 = new DefaultTableModel();
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JPanel p,p1,p2,p3,p4,p5,p6,p7,p8;
    JTable jTable1,jTable2,jTable3;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JComboBox jb;
    Icon i1= new ImageIcon("C:/Users/hoang/Downloads/Add1-icon.png");
    Icon i2= new ImageIcon("C:/Users/hoang/Downloads/Button1-Delete-icon.png");
    Icon i3= new ImageIcon("C:/Users/hoang/Downloads/Favorities1-icon.png");
    Icon i4= new ImageIcon("C:/Users/hoang/Downloads/Zoom1-icon.jpg");
    Icon i5= new ImageIcon("C:/Users/hoang/Downloads/Pencil1-icon.png");
    Icon i6= new ImageIcon("C:/Users/hoang/Downloads/back1-icon.png");
    productdata(){
        f = new JFrame("bảng sản phẩm");
        String []loai = {"good","normal"};
        jb = new JComboBox(loai);
        jb.setEditable(true);
        jb.addActionListener(this);
        f1 = new JFrame("Thêm sản phẩm");
        f2 = new JFrame("tìm kiếm sản phẩm");
        jTable1 = new JTable();
        jTable2 = new JTable();
        jTable3 = new JTable();
        jTable1.setModel(model1);
        jTable2.setModel(model2);
        jTable3.setModel(model3);
        model1.addColumn("Mã sản phẩm");
        model1.addColumn("Tên sản phẩm");
        model1.addColumn("Giá");
        model1.addColumn("Loại sản phẩm");
        model2.addColumn("Mã sản phẩm");
        model2.addColumn("Tên sản phẩm");
        model2.addColumn("Gía");
        model2.addColumn("Loại sản phẩm");
        model3.addColumn("mã sản phẩm");
        model3.addColumn("Tên sản phẩm");
        model3.addColumn("Gía");
        model3.addColumn("Loại sản phẩm");
        jTable1.setRowHeight(30);
        jTable2.setRowHeight(45);
        jTable3.setRowHeight(45);
        k = dal.getAllproducts();
        for (int i = 0; i < k.size(); i++) {
        	sanpham s = k.get(i);
        	model1.addRow(new Object[] {
        			s.getmasp(),s.gettensp(),s.getgia(),s.getloaisp()
        	});
        }
        f.setSize(900,540);
        f1.setSize(700,250);
        f2.setSize(700,450);
        f.setLocationRelativeTo(null);
        f1.setLocationRelativeTo(f);
        f2.setLocationRelativeTo(f);
	    f.setContentPane(new JLabel(new ImageIcon("C:/Users/hoang/Downloads/gala1.jpg")));
        f.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f2.setLayout(new FlowLayout(FlowLayout.CENTER));
        t1 = new JTextField(13);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t2 = new JTextField(13);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t3 = new JTextField(13);
        t3.setHorizontalAlignment(JTextField.CENTER);
        t4 = new JTextField(13);
//        t4.setHorizontalAlignment(JTextField.CENTER);
        t5 = new JTextField(13);
        t5.setHorizontalAlignment(JTextField.CENTER);
        t6 = new JTextField(13);
        t6.setHorizontalAlignment(JTextField.CENTER);
        t7 = new JTextField(13);
        t7.setHorizontalAlignment(JTextField.CENTER);
        t8 = new JTextField(13);
        t8.setHorizontalAlignment(JTextField.CENTER);
        p3 = new JPanel();
        JLabel l2 = new JLabel("sản phẩm thêm: ");
        l2.setFont(new FontUIResource("Arial",Font.BOLD,19));
        p3.setPreferredSize(new DimensionUIResource(585, 50));
        JLabel l7 = new JLabel("sản phẩm cần tìm: ");
        l7.setFont(new FontUIResource("Arial",Font.BOLD,19));
        p6 = new JPanel();
        p6.setPreferredSize(new DimensionUIResource(585, 50));
        p6.add(l7);
        p3.add(l2);
        f1.add(p3);
        f2.add(p6);
        p4 = new JPanel();
        p4.setPreferredSize(new DimensionUIResource(500, 70));
        p4.setLayout(new GridLayout(2,4,0,10));
        JLabel l3 = new JLabel("ma san pham: ");
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l4 = new JLabel("ten san pham: ");
        l4.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l5 = new JLabel("gia san pham: ");
        l5.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l6 = new JLabel("loai san pham: ");
        l6.setHorizontalAlignment(SwingConstants.CENTER);
        p4.add(l3);p4.add(l4);p4.add(l5);p4.add(l6);
        p4.add(t1);p4.add(t2);p4.add(t3);p4.add(jb);
        p8 = new JPanel();
        p8.setPreferredSize(new DimensionUIResource(500, 70));
        p8.setLayout(new GridLayout(2,4,0,10));
        JLabel l8 = new JLabel("Mã sản phẩm: ");
        l8.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l9 = new JLabel("Tên sản phẩm ");
        l9.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l10 = new JLabel("Giá sản phẩm: ");
        l10.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel l11 = new JLabel("Loại sản phẩm ");
        l11.setHorizontalAlignment(SwingConstants.CENTER);
        b7 = new JButton("OKAY");
        b7.addActionListener(this); 
        p5 = new JPanel();
        p5.setPreferredSize(new DimensionUIResource(500, 50));
        p5.setLayout(new FlowLayout(FlowLayout.RIGHT,50,20));
        p8.add(l8);p8.add(l9);p8.add(l10);p8.add(l11);
        p8.add(t5);p8.add(t6);p8.add(t7);p8.add(t8);
        p5.add(b7);
        f1.add(p4);f1.add(p5);
        f2.add(p8);
        p1 = new JPanel();
        p1.setPreferredSize(new DimensionUIResource(583, 360));
        p = new JPanel();
        JLabel l = new JLabel("Sản Phẩm");
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
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1){
            f1.setVisible(true);
        }
        if (e.getSource()== jb) {
        	t4.setText(jb.getSelectedItem().toString());
        }
        if (e.getSource() == b7){
        	if (t1.getText().trim().equals("")||t2.getText().trim().equals("")||t3.getText().trim().equals("")) {
        		JOptionPane.showMessageDialog(this,"Vui lòng nhập đủ thông tin");
        	}
        	else {
        		if (t4.getText().matches("")) {
        			t4.setText("good");
        		}
        		k.add(new sanpham(t1.getText(),t2.getText(),Integer.parseInt(t3.getText()),t4.getText()));
        		int i = k.size()-1;
        		sanpham s = k.get(i);
        		model1.addRow(new Object[]{
        				s.getmasp(),s.gettensp(),s.getgia(),s.getloaisp()
        		});
        		dal.addproduct(s);
        		JOptionPane.showMessageDialog(this,"thêm sản phẩm thành công");
        	}
            t1.setText(null);t2.setText(null);t3.setText(null);t4.setText(null);
//            f1.dispose();
        }
        if (e.getSource()== b4){
            f2.setVisible(true);
        }
        if (e.getSource() == b8){
            model3.setRowCount(0);
            int i;
            for(i =0; i<k.size();i++){
                sanpham s = k.get(i);
                if ((t5.getText().matches(s.getmasp())||t5.getText().matches(""))&&(t6.getText().matches(s.gettensp())||t6.getText().matches("")) && (t7.getText().matches(String.valueOf(s.getgia()))||t7.getText().matches(""))&&(t8.getText().matches(s.getloaisp())||t8.getText().matches("") )){
                    model3.addRow(new Object[]{
                        s.getmasp(),s.gettensp(),s.getgia(),s.getloaisp()
                    });
                }
            }
            if(model3.getRowCount() == 0){
                JOptionPane.showMessageDialog(this,"du lieu nhap khong chinh xac");
            }
            t5.setText(null);t6.setText(null);t7.setText(null);t8.setText(null);
        }
        if(e.getSource() == b2){
            int i = jTable1.getSelectedRow();
            if (i>-1){
                int ques = JOptionPane.showConfirmDialog(this,"ban co chac chan muon xoa khong?");
                if(ques==JOptionPane.YES_OPTION){
                    model1.removeRow(i);
                    dal.delproducts(k.get(i));
                    k.remove(i);
                }
            }
        }
        if(e.getSource() == b3){
            int i = jTable1.getSelectedRow();
            sanpham a = k.get(i);
            if (i>-1){
                model2.insertRow(0,new Object[]{
                    a.getmasp(),a.gettensp(),a.getgia(),a.getloaisp()
                });;
                if(model2.getRowCount()==2){
                    model2.removeRow(1);
                }
            }
        }
        if(e.getSource() == b5){
            int i = jTable1.getSelectedRow();
            int j = jTable1.getSelectedColumn();
            String a = JOptionPane.showInputDialog("xin hay chinh sua: ");
            sanpham b = k.get(i);
            if (i>-1 && (a != null)){
                model1.setValueAt(a, i, j);
                switch (j) {
                    case 0:
                        b.setmasp(a);
                        dal.updateproduct2(b);
                        break;
                    case 1:
                        b.settensp(a);
                        dal.updateproduct(b);
                        break;
                    case 2:
                        b.setgia(Integer.parseInt(a));
                        dal.updateproduct(b);
                        break;
                    case 3:
                        b.setloaisp(a);
                        dal.updateproduct(b);
                        break;
                
                    default:
                        break;
                }
                k.set(i,b);
            }
        }
        if(e.getSource()==b6){
            f.dispose();
            new thongke();
        }
    }
    public static void main(String[] args) {
        new productdata();
    }
}
