package org.example.chucnang;

import org.example.conn.connection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class QuanLyKhoiDuThi extends javax.swing.JPanel {


    DefaultTableModel model;
    public QuanLyKhoiDuThi() {
        initComponents();
        showResult();
    }

    public void showResult() {
        String[] arr = { "Mã thí sinh", "Số CMND", "Khối dự thi", "Mã khối"};

        model = new DefaultTableModel(arr,0);

        tbKhoiDuThi.removeAll();
        try {
            Connection cn = (Connection) connection.conn();
            String sql = "select MaTS, TenKhoi, SoCMND, HOSOTHISINH.MaKhoi from KHOIXETTUYEN inner join HOSOTHISINH on KHOIXETTUYEN.MaKhoi = HOSOTHISINH.MaKhoi";
            Statement st = (Statement)cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
                Vector<String> vc = new Vector<>();
                vc.add(rs.getString("MaTS"));
                vc.add(rs.getString("SoCMND"));
                vc.add(rs.getString("TenKhoi"));
                vc.add(rs.getString("MaKhoi"));
                model.addRow(vc);
            }
            tbKhoiDuThi.setModel(model);
        } catch(Exception e) {
            e.printStackTrace();
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
        tfKhoiDuThi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhoiDuThi = new javax.swing.JTable();
        tbnSua = new javax.swing.JButton();
        btnTaoLai = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfMaKhoi = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông báo:");

        jLabel2.setText("Mã thí sinh:");

        jLabel3.setText("Khối dự thi:");

        tfKhoiDuThi.setEnabled(false);

        tbKhoiDuThi.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Ma thi sinh", "So CMND", "Khoi du thi", "Ma khoi"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKhoiDuThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbKhoiDuThiMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhoiDuThi);

        tbnSua.setText("Sửa khối dự thi");
        tbnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSuaActionPerformed(evt);
            }
        });

        btnTaoLai.setText("Tạo lại");
        btnTaoLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoLaiActionPerformed(evt);
            }
        });

        jLabel4.setText("Mã khối:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jLabel4))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(tfKhoiDuThi)
                                                                                        .addComponent(tfMaKhoi, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(tbnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(btnTaoLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(150, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tbnSua, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnTaoLai))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfKhoiDuThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(tfMaKhoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
        );
    }// </editor-fold>

    private void tbKhoiDuThiMousePressed(java.awt.event.MouseEvent evt) {
        int row=tbKhoiDuThi.getSelectedRow();
        String id = tbKhoiDuThi.getModel().getValueAt(row, 0).toString();
        String cmnd = tbKhoiDuThi.getModel().getValueAt(row, 1).toString();
        String khoi = tbKhoiDuThi.getModel().getValueAt(row, 2).toString();
        String makhoi = tbKhoiDuThi.getModel().getValueAt(row, 3).toString();
        tfMaTS.setText(id);
        tfMaKhoi.setText(makhoi);
        tfKhoiDuThi.setText(khoi);

    }

    private void btnTaoLaiActionPerformed(java.awt.event.ActionEvent evt) {
        tfMaTS.setText("");
        tfKhoiDuThi.setText("");
        tfMaKhoi.setText("");
    }

    public int suaKhoi() {
        Connection cn = null;
        PreparedStatement pst = null;
        try {
            cn = connection.conn();
            String sql = "UPDATE HOSOTHISINH SET MaKhoi=? where MaTS = ?";
            int makhoi = Integer.parseInt(tfMaKhoi.getText());
            int mats = Integer.parseInt(tfMaTS.getText());

            pst = cn.prepareStatement(sql);
            pst.setInt(1, makhoi);
            pst.setInt(2, mats);



            if(pst.executeUpdate()>0) {
                return 1;
            }
            else {
                return 0;
            }
        }catch(Exception e) {
            e.printStackTrace();
            JOptionPane a = new JOptionPane();
            jOptionPane1.showMessageDialog(null, "Yêu cầu nhập đúng dữ liệu!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        return -1;
    }
    private void tbnSuaActionPerformed(java.awt.event.ActionEvent evt) {
        if (suaKhoi() == 1) {
            JOptionPane a = new JOptionPane();
            jOptionPane1.showMessageDialog(null, "Sửa khối dự thi thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane a = new JOptionPane();
            jOptionPane1.showMessageDialog(null, "Sửa khối dự thi thất bại!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        showResult();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnTaoLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKhoiDuThi;
    private javax.swing.JButton tbnSua;
    private javax.swing.JTextField tfKhoiDuThi;
    private javax.swing.JTextField tfMaKhoi;
    private javax.swing.JTextField tfMaTS;
    // End of variables declaration
}