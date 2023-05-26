package org.example.chucnang;

import org.example.conn.connection;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class XemThongTin extends javax.swing.JFrame {

    static final String LOGO = "C:\\Users\\viett\\IdeaProjects\\BaiTapLonNhom23\\src\\main\\java\\org\\example\\images\\background.png";

    /**
     * Creates new form XemThongTin
     */
    public XemThongTin() {
        initComponents();
        setLocationRelativeTo(null);
        showLogo(LOGO);
        setTitle("Tra cứu kết quả thi");
    }

    public void showLogo(String linkImage) {
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(LOGO));
            Image img1 = img.getScaledInstance(lbBackground.getWidth(), lbBackground.getHeight(), Image.SCALE_SMOOTH);
            lbBackground.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jButton1 = new javax.swing.JButton();
        lbBackground = new javax.swing.JLabel();
        tfMaTS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tra cứu thông tin xét tuyển:");

        jLabel2.setText("Nhập mã thí sinh:");

        jButton2.setText("Tra cứu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2)
                                                .addGap(137, 137, 137)
                                                .addComponent(jButton1))
                                        .addComponent(lbBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tfMaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(lbBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JPanel panel = new JPanel();
        int result = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đăng xuất?", "Log out",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            setVisible(false);
            JFrame a = new TrangChu();
            a.setVisible(true);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String mats = tfMaTS.getText();
        int ma;
        try {
            ma = Integer.parseInt(mats);
            if (mats.equals("") == true) {
                JOptionPane d = new JOptionPane();
                jOptionPane1.showMessageDialog(null, "Ô dữ liệu không được để trống!", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    Connection cn = connection.conn();
                    PreparedStatement pst = null;
                    String sql = "SELECT MaTS, HotenTS, SoCMND, TenKhoi, DaTrungTuyen from HOSOTHISINH inner join KHOIXETTUYEN on HOSOTHISINH.MaKhoi=KHOIXETTUYEN.MaKhoi where MaTS=?";

                    pst = cn.prepareStatement(sql);
                    pst.setInt(1, ma);

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        String mathisinh = rs.getString("MaTS");
                        String hoten = rs.getString("HoTenTS");
                        String socmnd = rs.getString("SoCMND");
                        String tenkhoi = rs.getString("TenKhoi");
                        String datrungtuyen = rs.getString("DaTrungTuyen");

                        JOptionPane d = new JOptionPane();
                        jOptionPane1.showMessageDialog(null, "Thi sinh " + mathisinh + "\nSo cmnd: " + socmnd + "\nHo ten: " + hoten + "\nKhoi xet tuyen: " + tenkhoi + "\nKet qua du thi: " +datrungtuyen, "Thong bao", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane d = new JOptionPane();
                        jOptionPane1.showMessageDialog(null, "Không tìm thấy mã thí sinh!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane d = new JOptionPane();
                    jOptionPane1.showMessageDialog(null, "Có lỗi xảy ra!", "Error", JOptionPane.INFORMATION_MESSAGE);

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane d = new JOptionPane();
            jOptionPane1.showMessageDialog(null, "Có lỗi xảy ra!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }


    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        JFrame a = new TrangChu();
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn thoát chương trình không?", "Exit Program Message Box",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if(confirmed == JOptionPane.NO_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
        a.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XemThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JTextField tfMaTS;
    // End of variables declaration
}