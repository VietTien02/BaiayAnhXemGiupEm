package org.example.chucnang;

import org.example.conn.connection;
import org.example.model.Diem;
import org.example.model.DiemDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class NhapDiem extends javax.swing.JPanel {
    DefaultTableModel model;
    public NhapDiem() {
        initComponents();
        showResult();
    }

    public void showResult() {
        String[] arr = { "Mã thí sinh", "Điểm Toán", "Điểm Lý" , "Điểm Hóa", "Điểm Anh","Điểm Văn", "Điểm Sử", "Điểm Địa", "Điểm GDCD", "Điểm Sinh"};

        model = new DefaultTableModel(arr,0);

        tbDiem.removeAll();
        try {
            Connection cn = (Connection) connection.conn();
            String sql = "select MaTS, DiemToan, DiemLy, DiemHoa, DiemNgoaiNgu, DiemVan, DiemSu,DiemDia,DiemGDCG, DiemSinh from HOSOTHISINH";
            Statement st = (Statement)cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
                Vector<String> vc = new Vector<>();
                vc.add(rs.getString("MaTS"));
                vc.add(rs.getString("DiemToan"));
                vc.add(rs.getString("DiemLy"));
                vc.add(rs.getString("DiemHoa"));
                vc.add(rs.getString("DiemNgoaiNgu"));
                vc.add(rs.getString("DiemVan"));
                vc.add(rs.getString("DiemSu"));
                vc.add(rs.getString("DiemDia"));
                vc.add(rs.getString("DiemGDCG"));
                vc.add(rs.getString("DiemSinh"));
                model.addRow(vc);
            }
            tbDiem.setModel(model);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public int check(float DiemToan, float DiemLy, float DiemHoa, float DiemNgoaiNgu, float DiemVan, float DiemSu, float DiemDia, float DiemGDCD, float DiemSinh) {
        if (DiemToan > 10 || DiemLy < 0 || DiemLy > 10 || DiemHoa < 0 || DiemHoa > 10 || DiemNgoaiNgu < 0 || DiemNgoaiNgu > 10 || DiemVan < 0 || DiemVan > 10 || DiemSu < 0 || DiemSu > 10 || DiemDia < 0 || DiemDia > 10 || DiemGDCD < 0  || DiemGDCD > 10 || DiemSinh < 0  || DiemSinh > 10) {
            return 0;
        } else {
            return 1;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfMaTS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfToan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfLy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfHoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfVan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfAnh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfSu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfDia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfGDCD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDiem = new javax.swing.JTable();
        btnNhapDiem = new javax.swing.JButton();
        btnTaoLai = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfSinh = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Thông báo:");

        jLabel2.setText("Mã thí sinh:");

        jLabel3.setText("Điểm Toán:");

        jLabel4.setText("Điểm Lý:");

        jLabel5.setText("Điểm Hóa:");

        jLabel6.setText("Điểm Văn:");

        jLabel7.setText("Điểm Anh:");

        jLabel8.setText("Điểm Sử:");

        jLabel9.setText("Điểm Địa:");

        jLabel10.setText("Điểm GDCD:");

        tbDiem.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "Ma thi sinh", "Diem toan", "Diem ly", "Diem hoa", "Diem van", "Diem anh", "Diem su", "Diem dia", "Diem GDCD", "Diem sinh"
                }
        ));
        tbDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbDiemMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbDiem);

        btnNhapDiem.setText("Nhập điểm");
        btnNhapDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapDiemActionPerformed(evt);
            }
        });

        btnTaoLai.setText("Tạo lại");
        btnTaoLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoLaiActionPerformed(evt);
            }
        });

        jLabel11.setText("Điểm Sinh:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(btnNhapDiem)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btnTaoLai))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jLabel4)
                                                                                        .addComponent(jLabel5)
                                                                                        .addComponent(jLabel11))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(tfSinh)
                                                                                        .addComponent(tfHoa)
                                                                                        .addComponent(tfLy)
                                                                                        .addComponent(tfToan))))
                                                                .addGap(152, 152, 152)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel10)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(tfGDCD))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel9)
                                                                                        .addComponent(jLabel8)
                                                                                        .addComponent(jLabel7)
                                                                                        .addComponent(jLabel6))
                                                                                .addGap(24, 24, 24)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(tfSu, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(tfAnh, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(tfVan, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(tfToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(tfLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(tfHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(tfSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(tfVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(tfAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(tfSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(tfGDCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnTaoLai)
                                        .addComponent(btnNhapDiem))
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void btnNhapDiemActionPerformed(java.awt.event.ActionEvent evt) {
        DiemDAO dao = new DiemDAO();
        String mats = tfMaTS.getText();

        try {
            float toan = Float.parseFloat(tfToan.getText());
            float ly = Float.parseFloat(tfLy.getText());
            float hoa = Float.parseFloat(tfHoa.getText());
            float van = Float.parseFloat(tfVan.getText());
            float anh = Float.parseFloat(tfAnh.getText());
            float su= Float.parseFloat(tfSu.getText());
            float dia = Float.parseFloat(tfDia.getText());
            float gdcd = Float.parseFloat(tfGDCD.getText());
            float sinh =Float.parseFloat(tfSinh.getText());

            Diem a = new Diem(mats, toan, ly, hoa, anh,van, su, dia,gdcd, sinh);

            if (dao.nhapDiem(a) == 1) {
                System.out.println("Update diem thanh cong");
                JOptionPane p = new JOptionPane("Update diem thanh cong");
                jOptionPane1.showMessageDialog(null, "Update điểm thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else if (dao.nhapDiem(a)==-1 || check(toan, ly, hoa,van, anh,su,dia,gdcd,sinh) != 0){
                JOptionPane p = new JOptionPane();
                jOptionPane1.showMessageDialog(null, "Update điểm thất bại(Kiểm tra dữ liệu nhập hoặc không tồn tại thí sinh)", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            showResult();
        } catch(Exception e) {
            JOptionPane p =new JOptionPane();
            jOptionPane1.showMessageDialog(null, "Nhập dữ liệu không chính xác hoặc để trống!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }



    }

    private void tbDiemMousePressed(java.awt.event.MouseEvent evt) {
        int row=tbDiem.getSelectedRow();
        String id = tbDiem.getModel().getValueAt(row, 0).toString();


        tfMaTS.setText(id);

    }

    private void btnTaoLaiActionPerformed(java.awt.event.ActionEvent evt) {
        tfAnh.setText("");
        tfDia.setText("");
        tfGDCD.setText("");
        tfHoa.setText("");
        tfLy.setText("");
        tfSinh.setText("");
        tfVan.setText("");
        tfMaTS.setText("");
        tfSu.setText("");
        tfToan.setText("");
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnNhapDiem;
    private javax.swing.JButton btnTaoLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDiem;
    private javax.swing.JTextField tfAnh;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfGDCD;
    private javax.swing.JTextField tfHoa;
    private javax.swing.JTextField tfLy;
    private javax.swing.JTextField tfMaTS;
    private javax.swing.JTextField tfSinh;
    private javax.swing.JTextField tfSu;
    private javax.swing.JTextField tfToan;
    private javax.swing.JTextField tfVan;
    // End of variables declaration
}








