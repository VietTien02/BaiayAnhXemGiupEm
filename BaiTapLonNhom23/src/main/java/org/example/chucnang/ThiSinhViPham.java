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

public class ThiSinhViPham extends javax.swing.JPanel {

    DefaultTableModel model;
    public ThiSinhViPham() {
        initComponents();
        try {
            showResult();
        } catch (SQLException ex) {
            Logger.getLogger(ThiSinhViPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showResult() throws SQLException {
        String[] arr = { "Mã thí sinh", "Họ và tên", "Số CMND" , "Trạng thái"};

        model = new DefaultTableModel(arr,0);

        tbThiSinhViPham.removeAll();
        PreparedStatement pst =null;
        Connection cn = null;
        try {
            cn = (Connection) connection.conn();
            String sql = "select MaTS, HotenTS, SoCMND, DaTrungTuyen from HOSOTHISINH where DaTrungTuyen=?";

            pst = cn.prepareStatement(sql);
            pst.setString(1, "Vi pham");
            ResultSet rs = pst.executeQuery();

            while(rs.next()) {
                Vector<String> vc = new Vector<>();
                vc.add(rs.getString("MaTS"));
                vc.add(rs.getString("HotenTS"));
                vc.add(rs.getString("SoCMND"));
                vc.add(rs.getString("DaTrungTuyen"));

                model.addRow(vc);
            }
            tbThiSinhViPham.setModel(model);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThiSinhViPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfMaTS = new javax.swing.JTextField();
        tfHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfSoCMND = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTrangThai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        tbThiSinhViPham.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null}
                },
                new String [] {
                        "Ma thi sinh", "Ho va ten", "So CMND", "Trang thai"
                }
        ));
        tbThiSinhViPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbThiSinhViPhamMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbThiSinhViPham);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông báo thí sinh vi phạm:");

        jLabel2.setText("Mã thí sinh:");

        tfHoTen.setEnabled(false);

        jLabel3.setText("Họ và tên:");

        tfSoCMND.setEnabled(false);

        jLabel4.setText("Số CMND:");

        tfTrangThai.setEnabled(false);

        jLabel5.setText("Trạng thái:");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tạo lại");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(24, 24, 24)
                                                                                .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(24, 24, 24)
                                                                                .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addGap(22, 22, 22)
                                                                                .addComponent(tfTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(tfTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );
    }// </editor-fold>

    private void tbThiSinhViPhamMousePressed(java.awt.event.MouseEvent evt) {
        int row=tbThiSinhViPham.getSelectedRow();
        String id = tbThiSinhViPham.getModel().getValueAt(row, 0).toString();
        String uname = tbThiSinhViPham.getModel().getValueAt(row, 1).toString();
        String up = tbThiSinhViPham.getModel().getValueAt(row, 3).toString().trim();
        String k = tbThiSinhViPham.getModel().getValueAt(row, 2).toString().trim();
        tfMaTS.setText(id);
        tfHoTen.setText(uname);
        tfSoCMND.setText(k);
        tfTrangThai.setText(up);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Connection cn =null;
        PreparedStatement pst =null;
        try {
            cn = connection.conn();
            String mats = tfMaTS.getText();
            String sql = "update HOSOTHISINH set DaTrungTuyen=? where MaTS=?";

            pst= cn.prepareCall(sql);
            pst.setString(1, "Vi pham");
            pst.setString(2, mats);
            if (pst.executeUpdate() >0) {
                System.out.println("Them thi sinh vi pham thanh cong");
                JOptionPane d = new JOptionPane();
                jOptionPane1.showMessageDialog(null, "Cập nhật thí sinh vi phạm thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
                showResult();
            } else {
                JOptionPane d = new JOptionPane();
                jOptionPane1.showMessageDialog(null, "Thêm thí sinh vi phạm thất bại!", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(Exception e) {
            e.printStackTrace();

        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        tfHoTen.setText("");
        tfMaTS.setText("");
        tfSoCMND.setText("");
        tfTrangThai.setText("");
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
    private javax.swing.JTable tbThiSinhViPham;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfMaTS;
    private javax.swing.JTextField tfSoCMND;
    private javax.swing.JTextField tfTrangThai;
    // End of variables declaration
}