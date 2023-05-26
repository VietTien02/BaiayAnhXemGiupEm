package org.example.model;

import org.example.conn.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DiemDAO {
    public int nhapDiem(Diem a) {
        Connection cn = null;
        PreparedStatement check = null;

        try {
            String sql = "select * from HOSOTHISINH where MaTS = ?";
            cn = connection.conn();
            check = cn.prepareStatement(sql);
            check.setString(1, a.getMaTS());
            ResultSet rs = check.executeQuery();
            if (rs.next()) {
                PreparedStatement pst = null;
                try {
                    String sql1 = "update HOSOTHISINH set DiemToan=?, DiemLy=?, DiemHoa=?,DiemNgoaiNgu=?,DiemVan=?,DiemSu=?,DiemDia=?,DiemGDCG=?,DiemSinh=? where MaTS=?";
                    cn = connection.conn();
                    pst = cn.prepareStatement(sql1);
                    pst.setFloat(1, a.getDiemToan());
                    pst.setFloat(2, a.getDiemLy());
                    pst.setFloat(3, a.getDiemHoa());
                    pst.setFloat(4, a.getDiemNgoaiNgu());
                    pst.setFloat(5, a.getDiemVan());
                    pst.setFloat(6, a.getDiemSu());
                    pst.setFloat(7, a.getDiemDia());
                    pst.setFloat(8, a.getDiemGDCD());
                    pst.setFloat(9, a.getDiemSinh());
                    pst.setString(10, a.getMaTS());

                    if (pst.executeUpdate() > 0) {
                        System.out.println("update thanh cong");
                        return 1;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}