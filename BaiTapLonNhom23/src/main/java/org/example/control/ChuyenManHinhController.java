package org.example.control;

import org.example.chucnang.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChuyenManHinhController {

    private JPanel jpnRoot;
    private String kindSelected = "";
    private List<DanhMucBean> list;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }
    //Khoi dong trang chu sau khi dang nhap

    public void setView(JPanel jpnItem, JLabel jlblItem) {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96, 100, 191));
        jlblItem.setBackground(new Color(96, 100, 191));
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new DanhMucTrangChu());
        jpnRoot.validate();
        jpnRoot.repaint();
    }
    //Them event cho menu

    public void SetEven(List<DanhMucBean> list) {
        this.list = list;
        for (DanhMucBean items : list) {
            items.getJlb().addMouseListener(new LabelEven(items.getKind(), items.getJpn(), items.getJlb()));
        }
    }

    class LabelEven implements MouseListener {

        private JPanel nodeJPanel;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItemJLabel;

        public LabelEven(String kind, JPanel jpnItem, JLabel jlbItemJLabel) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItemJLabel = jlbItemJLabel;
        }

        @Override
        public void mouseClicked(MouseEvent e) {

            switch (kind) {
                case "QuanLyHoSoThiSinh":
                    nodeJPanel = new QuanLyHoSoThiSinh();
                    break;
                case "QuanLyTaiKhoan":
                {
                    try {
                        nodeJPanel = new QuanLyTaiKhoan();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case "NhapDiem":
                    nodeJPanel = new NhapDiem();
                    break;
                case "QuanLyKhoiDuThi":
                    nodeJPanel = new QuanLyKhoiDuThi();
                    break;
                case "ThiSinhTrungTuyen":
                    nodeJPanel = new ThiSinhTrungTuyen();
                    break;
                case "ThiSinhViPham":
                    nodeJPanel = new ThiSinhViPham();
                    break;
                default:
                    nodeJPanel = new DanhMucTrangChu();
                    break;
            }
            jpnRoot.removeAll();
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(nodeJPanel);
            jpnRoot.validate();
            jpnRoot.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            kindSelected = kind;
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItemJLabel.setBackground(new Color(96, 100, 191));

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItemJLabel.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItemJLabel.setBackground(new Color(76, 175, 80));
            }
        }

    }

    private void setChangeBackground(String kind) {
        for (DanhMucBean iteMucBean : list) {
            if (iteMucBean.getKind().equalsIgnoreCase(kind)) {
                iteMucBean.getJpn().setBackground(new Color(96, 100, 191));
                iteMucBean.getJlb().setBackground(new Color(96, 100, 191));
            } else {
                iteMucBean.getJpn().setBackground(new Color(76, 175, 80));
                iteMucBean.getJlb().setBackground(new Color(76, 175, 80));
            }
        }
    }

}

