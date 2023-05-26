package org.example.chucnang;

import org.example.conn.connection;
import org.example.model.HoSoThiSinh;
import org.example.model.HoSoThiSinhDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuanLyHoSoThiSinh extends javax.swing.JPanel {
    ArrayList<HoSoThiSinh> lshs = new ArrayList<>();
    DefaultTableModel model;
    public QuanLyHoSoThiSinh() {
        initComponents();
        showResult();
        buttonGroup1.add(rdNu);
        buttonGroup1.add(rdNam);
    }

    public void showResult() {
        String[] arr = { "Ma thi sinh", "Họ và tên", "Ngày sinh" , "Giới tính", "Số CMND", "Mã ĐTUT", "Mã KVUT", "Dân tôc", "Mã dân tộc"};

        model = new DefaultTableModel(arr,0);

        tbQuanLyHoSo.removeAll();
        try {
            Connection cn = (Connection) connection.conn();
            String sql = "select * from HOSOTHISINH inner join DANTOC on HOSOTHISINH.MaDanToc = DANTOC.MaDanToc";
            Statement st = (Statement)cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
                Vector<String> vc = new Vector<>();
                vc.add(rs.getString("MaTS"));
                vc.add(rs.getString("HotenTS"));
                vc.add(rs.getString("NgaySinh"));
                vc.add(rs.getString("GioiTinh"));
                vc.add(rs.getString("SoCMND"));
                vc.add(rs.getString("MaDTUT"));
                vc.add(rs.getString("MaKVUT"));
                vc.add(rs.getString("TenDanToc"));
                vc.add(rs.getString("MaDanToc"));
                model.addRow(vc);
            }
            tbQuanLyHoSo.setModel(model);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuanLyHoSo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfMaThiSinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfNgaySinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSoCMND = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfMaDTUT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfMaKVUT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDanToc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        tbnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbErr = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfMaDanToc = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();

        tbQuanLyHoSo.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "Mã thí sinh", "Ho va ten thi sinh", "Ngay sinh", "Gioi tinh", "So CMND", "Ma DTUT", "Ma KVUT", "Dan toc", "Ma dan toc"
                }
        ));
        tbQuanLyHoSo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbQuanLyHoSoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbQuanLyHoSo);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Thông báo:");

        jLabel2.setText("Mã thí sinh:");

        tfMaThiSinh.setEnabled(false);

        jLabel3.setText("Họ và tên");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Số CMND");

        jLabel6.setText("Mã ĐTUT:");

        jLabel7.setText("Mã KVUT:");

        jLabel8.setText("Dân tôc:");

        tfDanToc.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText(" Chức năng:");

        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tbnXoa.setText("Xóa");
        tbnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel11.setText("Giới tính:");

        lbErr.setForeground(new java.awt.Color(255, 0, 51));

        jLabel9.setText("Mã dân tộc");

        btnReset.setText("Tao lai");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        rdNam.setText("Nam");

        rdNu.setText("Nữ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(99, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfMaDanToc)
                                        .addComponent(tfMaThiSinh)
                                        .addComponent(tfHoTen)
                                        .addComponent(tfNgaySinh)
                                        .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(tfMaDTUT, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                                .addComponent(tfMaKVUT)
                                                                .addComponent(tfDanToc))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rdNam)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(rdNu))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbErr, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnThem)
                                                .addGap(40, 40, 40)
                                                .addComponent(tbnXoa)
                                                .addGap(38, 38, 38)
                                                .addComponent(btnSua)
                                                .addGap(39, 39, 39)
                                                .addComponent(btnReset))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(tfMaThiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(tfMaDTUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(tfMaKVUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(tfDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(rdNam)
                                        .addComponent(rdNu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(tfMaDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem)
                                        .addComponent(tbnXoa)
                                        .addComponent(btnSua)
                                        .addComponent(btnReset))
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );
    }// </editor-fold>

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // TODO add your handling code here:
            String mats = tfMaThiSinh.getText();
            String hoten = tfHoTen.getText();

            String ngaysinh = tfNgaySinh.getText();
            String socmnd = tfSoCMND.getText();
            String madtut = tfMaDTUT.getText();
            String makvut = tfMaKVUT.getText();
            String gioitinh = "";
            if(rdNam.isSelected() == true) {
                gioitinh="Nam";
            } else {
                gioitinh = "Nu";
            }

            String madantoc = tfMaDanToc.getText();
            if (hoten.equals("") || ngaysinh.equals("") || socmnd.equals("")
                    || madtut.equals("") || makvut.equals("") || gioitinh.equals("")) {
                lbErr.setText("*Khong duoc de trong");
            } else {
                HoSoThiSinhDAO dao = new HoSoThiSinhDAO();
                HoSoThiSinh x = new HoSoThiSinh(mats, hoten, ngaysinh, gioitinh, socmnd, madtut, makvut, madantoc);
//
                if (dao.add(x) == 1) {
                    lshs.add(x);
                    JOptionPane a = new JOptionPane("Add thanh cong");
                    jOptionPane1.showMessageDialog(null, "Thêm hồ sơ thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane a = new JOptionPane("Them ho so that bai");
                    jOptionPane1.showMessageDialog(null, "Thêm hồ sơ thất bại!", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (Exception ex) {
            jOptionPane1.showMessageDialog(null, "Thêm hồ sơ thất bại!", "Error", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showResult();
        } catch (Exception ex) {
            Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void tbQuanLyHoSoMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int row=tbQuanLyHoSo.getSelectedRow();
        String id = tbQuanLyHoSo.getModel().getValueAt(row, 0).toString();
        String hoten = tbQuanLyHoSo.getModel().getValueAt(row, 1).toString();
        String ngaysinh = tbQuanLyHoSo.getModel().getValueAt(row, 2).toString();
        String gioitinh = tbQuanLyHoSo.getModel().getValueAt(row, 3).toString().replaceAll("\s+","");
        String somcnd = tbQuanLyHoSo.getModel().getValueAt(row, 4).toString().replaceAll("\s+",""); ;
        String madtut = tbQuanLyHoSo.getModel().getValueAt(row, 5).toString();
        String makvut = tbQuanLyHoSo.getModel().getValueAt(row, 6).toString();
        String dantoc = tbQuanLyHoSo.getModel().getValueAt(row, 7).toString();
        String madantoc = tbQuanLyHoSo.getModel().getValueAt(row, 8).toString();
        tfMaThiSinh.setText(id);
        tfHoTen.setText(hoten);
        tfNgaySinh.setText(ngaysinh);
        if(gioitinh == "Nam") {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        tfSoCMND.setText(somcnd);
        tfMaDTUT.setText(madtut);
        tfMaKVUT.setText(makvut);
        tfDanToc.setText(dantoc);
        tfMaDanToc.setText(madantoc);
    }

    private void tbnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        HoSoThiSinhDAO dao = new HoSoThiSinhDAO();
        String id = tfMaThiSinh.getText();

        HoSoThiSinh x = new HoSoThiSinh(id);
        if (dao.delete(x) == -1) {
            jOptionPane1.showMessageDialog(null, "Xóa hồ sơ thất bại!", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            jOptionPane1.showMessageDialog(null, "Xóa hồ sơ thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        showResult();
    }

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
        HoSoThiSinhDAO dao = new HoSoThiSinhDAO();
        String id = tfMaThiSinh.getText();
        String ten = tfHoTen.getText();
        String ngaysinh = tfNgaySinh.getText();
        String gioitinh = "";
        if(rdNam.isSelected()) {
            gioitinh= "Nam";
        } else {
            gioitinh = "Nu";
        }
        String makvut = tfMaKVUT.getText();
        String madtut = tfMaDTUT.getText();
        String dantoc = tfDanToc.getText();
        String madantoc =tfMaDanToc.getText();
        String socmnd = tfSoCMND.getText();
        HoSoThiSinh x = new HoSoThiSinh(id, ten, ngaysinh, gioitinh, socmnd,
                madtut, makvut, madantoc);

        if (dao.update(x) == -1) {
            jOptionPane1.showMessageDialog(null, "Sua tai khoan that bai!", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            jOptionPane1.showMessageDialog(null, "Sua tai khoan thanh cong!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        showResult();
    }

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tfDanToc.setText("");
        buttonGroup1.clearSelection();
        tfHoTen.setText("");
        tfMaDTUT.setText("");
        tfMaDanToc.setText("");
        tfMaKVUT.setText("");
        tfMaThiSinh.setText("");
        tfNgaySinh.setText("");
        tfSoCMND.setText("");
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel lbErr;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbQuanLyHoSo;
    private javax.swing.JButton tbnXoa;
    private javax.swing.JTextField tfDanToc;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfMaDTUT;
    private javax.swing.JTextField tfMaDanToc;
    private javax.swing.JTextField tfMaKVUT;
    private javax.swing.JTextField tfMaThiSinh;
    private javax.swing.JTextField tfNgaySinh;
    private javax.swing.JTextField tfSoCMND;
    // End of variables declaration
}
