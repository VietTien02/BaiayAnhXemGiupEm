package org.example.chucnang;

import org.example.conn.connection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThiSinhTrungTuyen extends javax.swing.JPanel {

    DefaultTableModel model;
    public ThiSinhTrungTuyen() {
        initComponents();
        try {
            showResult();
        } catch (SQLException ex) {
            Logger.getLogger(ThiSinhTrungTuyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showResult() throws SQLException {
        String[] arr = { "Mã thí sinh", "Họ và tên", "Khối xét tuyển" , "Trạng thái"};

        model = new DefaultTableModel(arr,0);

        tbThiSinhTrungTuyen.removeAll();
        PreparedStatement pst =null;
        Connection cn = null;
        try {
            cn = (Connection) connection.conn();
            String sql = "select MaTS, HotenTS, TenKhoi, DaTrungTuyen from HOSOTHISINH inner join KHOIXETTUYEN on HOSOTHISINH.MaKhoi = KHOIXETTUYEN.MaKhoi where DaTrungTuyen = ?";

            pst = cn.prepareStatement(sql);
            pst.setString(1, "Trung tuyen");
            ResultSet rs = pst.executeQuery();

            while(rs.next()) {
                Vector<String> vc = new Vector<>();
                vc.add(rs.getString("MaTS"));
                vc.add(rs.getString("HotenTS"));
                vc.add(rs.getString("TenKhoi"));
                vc.add(rs.getString("DaTrungTuyen"));

                model.addRow(vc);
            }
            tbThiSinhTrungTuyen.setModel(model);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThiSinhTrungTuyen = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfMaTS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTrangThai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfKhoiXetTuyen = new javax.swing.JTextField();

        tbThiSinhTrungTuyen.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Ma thi sinh", "Ho va ten", "Khoi xet tuyen", "Trang thai"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThiSinhTrungTuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbThiSinhTrungTuyenMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbThiSinhTrungTuyen);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText(" Thí sinh trúng tuyển:");

        jButton1.setText("Cập nhật danh sách trúng tuyển");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hủy điều kiện xét tuyển");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã thí sinh:");

        tfMaTS.setEnabled(false);

        jLabel3.setText("Họ và tên:");

        tfTen.setEnabled(false);

        jLabel4.setText("Trạng thái:");

        tfTrangThai.setEnabled(false);

        jLabel5.setText("Khối xét tuyển:");

        tfKhoiXetTuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel5))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(24, 24, 24)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(tfTrangThai)
                                                                        .addComponent(tfMaTS, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(tfTen, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(tfKhoiXetTuyen, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                                                .addGap(275, 275, 275)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2)
                                                                .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(tfTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4)))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel3)
                                                .addGap(6, 6, 6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(tfKhoiXetTuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void tbThiSinhTrungTuyenMousePressed(java.awt.event.MouseEvent evt) {
        int row=tbThiSinhTrungTuyen.getSelectedRow();
        String id = tbThiSinhTrungTuyen.getModel().getValueAt(row, 0).toString();
        String uname = tbThiSinhTrungTuyen.getModel().getValueAt(row, 1).toString();
        String up = tbThiSinhTrungTuyen.getModel().getValueAt(row, 3).toString().trim();
        String k = tbThiSinhTrungTuyen.getModel().getValueAt(row, 2).toString();
        tfMaTS.setText(id);
        tfTen.setText(uname);
        tfTrangThai.setText(up);
        tfKhoiXetTuyen.setText(k);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Connection cn =null;
            PreparedStatement pst = null;
            try {
                cn = connection.conn();

                String mats = tfMaTS.getText();
                String hoten = tfTen.getText();

//                String sql = "update HOSOTHISINH set DaTrungTuyen=? where ?=? and ?+?+?>?";
//                pst=cn.prepareStatement(sql);
//                pst.setString(1, "Trung tuyen");
//                pst.setString(2, "MaTS");
//                pst.setString(3, mats);

                String tenkhoi = tfKhoiXetTuyen.getText().trim();
                try {
                    if (tenkhoi.equals("A")) {
                        String sql = "update HOSOTHISINH set DaTrungTuyen =?  where  DiemToan+DiemLy+DiemHoa+TongDiemUuTien>? AND MaKhoi=?";
                        pst = cn.prepareStatement(sql);
                        pst.setString(1, "Trung tuyen");
                        pst.setInt(2, 15);
                        pst.setInt(3, 1);
                    } else if (tenkhoi.equals("B")) {
                        String sql = "update HOSOTHISINH set DaTrungTuyen =?  where  DiemToan+DiemHoa+DiemSinh+TongDiemUuTien>? AND MaKhoi=?";
                        pst = cn.prepareStatement(sql);
                        pst.setString(1, "Trung tuyen");
                        pst.setInt(2, 15);
                        pst.setInt(3, 2);
                    } else if (tenkhoi.equals("C")) {
                        String sql = "update HOSOTHISINH set DaTrungTuyen =?  where  DiemVan+DiemSu+DiemDia+TongDiemUuTien>? AND MaKhoi=?";
                        pst = cn.prepareStatement(sql);
                        pst.setString(1, "Trung tuyen");
                        pst.setInt(2, 15);
                        pst.setInt(3, 3);
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    if (pst.executeUpdate() > 0) {
                        System.out.println("Cap nhat thanh cong");
                        JOptionPane d = new JOptionPane();
                        jOptionPane1.showMessageDialog(null, "Cập nhật thí sinh trúng tuyển thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        showResult();
                    } else {
                        JOptionPane d = new JOptionPane();
                        jOptionPane1.showMessageDialog(null, "Có lỗi xảy ra!", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                }



            }catch (Exception e) {
                JOptionPane a = new JOptionPane();
                jOptionPane1.showMessageDialog(null, "Lỗi tác vụ!", "Error", JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
            }
            showResult();
        }catch (SQLException ex) {
            Logger.getLogger(ThiSinhTrungTuyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Connection cn = null;
        PreparedStatement pst = null;
        String mats= tfMaTS.getText();
        try {
            cn = connection.conn();
            String sql  = "update HOSOTHISINH set DaTrungTuyen=? where MaTS = ?";
            pst = cn.prepareStatement(sql);
            pst.setString(1, "N");
            pst.setString(2, mats);
            if (pst.executeUpdate()>0) {
                JOptionPane d = new JOptionPane();
                jOptionPane1.showMessageDialog(null, "Hủy điều kiện xét tuyển thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
                showResult();
            }
        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane d = new JOptionPane();
            jOptionPane1.showMessageDialog(null, "Có lỗi xảy ra!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbThiSinhTrungTuyen;
    private javax.swing.JTextField tfKhoiXetTuyen;
    private javax.swing.JTextField tfMaTS;
    private javax.swing.JTextField tfTen;
    private javax.swing.JTextField tfTrangThai;
    // End of variables declaration
}