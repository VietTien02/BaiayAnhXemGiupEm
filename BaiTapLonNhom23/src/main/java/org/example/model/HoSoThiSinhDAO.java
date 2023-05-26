package org.example.model;

import org.example.conn.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HoSoThiSinhDAO {
    public int add(HoSoThiSinh a) {
        Connection cn =null;
        PreparedStatement check  =null;
        try {
            String sql = "SELECT * FROM HOSOTHISINH WHERE SoCMND=?";
            cn= connection.conn();
            check = cn.prepareStatement(sql);
            check.setString(1, a.getSocmnd());
            ResultSet rs = check.executeQuery();
            if (rs.next()) {
                return 0;
            } else {

                PreparedStatement pst  =null;
                try {

                    String check1= "SELECT * FROM HOSOTHISINH WHERE MaTS=?";
                    cn = (Connection) connection.conn();
                    PreparedStatement p = cn.prepareStatement(check1);
                    p.setString(1, a.getMaTS());
                    ResultSet resultSet = p.executeQuery();
                    if (resultSet.next()) {
                        return 0;
                    } else {
                        try {
                            String sql1 = "INSERT INTO HOSOTHISINH VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst = cn.prepareStatement(sql1);

                            pst.setString(1, a.getMadtut());
                            pst.setString(2, "1");
                            pst.setString(3, a.getMadantoc());
                            pst.setString(4, a.getMakvut());
                            pst.setString(5, a.getHoten());
                            pst.setString(6, a.getNgaysinh());
                            pst.setString(7, a.getGioitinh());
                            pst.setString(8, a.getSocmnd());
                            pst.setString(9, "");
                            pst.setString(10, "0");
                            pst.setString(11, "0");
                            pst.setString(12, "0");
                            pst.setString(13, "0");
                            pst.setString(14, "0");
                            pst.setString(15, "0");
                            pst.setString(16, "0");
                            pst.setString(17, "0");
                            pst.setString(18, "0");

                            if (pst.executeUpdate() > 0) {
                                System.out.println("add thanh cong");
                                return 1;
                            }
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                    }



                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        cn.close();
                        pst.close();
                    }catch(Exception e) {

                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int delete(HoSoThiSinh a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "DELETE FROM HOSOTHISINH WHERE MaTS=?";
            cn = connection.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getMaTS());
            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int update(HoSoThiSinh a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "UPDATE HOSOTHISINH SET HoTenTS=?, NgaySinh=?, GioiTinh=?, SoCMND=?, MaDTUT=?, MaKVUT=?, MaDanToc=? WHERE MaTS=?";
            cn = connection.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getHoten());
            pst.setString(2, a.getNgaysinh());
            pst.setString(3, a.getGioitinh());
            pst.setString(4, a.getSocmnd());
            pst.setString(5, a.getMadtut());
            pst.setString(6, a.getMakvut());
            pst.setString(7, a.getMadantoc());
            pst.setString(8, a.getMaTS());

            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int dangKiHoSo(HoSoThiSinh a) {
        Connection cn =null;
        PreparedStatement check  =null;
        try {
            String sql = "SELECT * FROM HOSOTHISINH WHERE SoCMND=?";
            cn= connection.conn();
            check = cn.prepareStatement(sql);
            check.setString(1, a.getSocmnd());
            ResultSet rs = check.executeQuery();
            if (rs.next()) {
                return 0;
            } else {

                PreparedStatement pst  =null;
                try {

                    String check1= "SELECT * FROM HOSOTHISINH WHERE MaTS=?";
                    cn = (Connection) connection.conn();
                    PreparedStatement p = cn.prepareStatement(check1);
                    p.setString(1, a.getMaTS());
                    ResultSet resultSet = p.executeQuery();
                    if (resultSet.next()) {
                        return 0;
                    } else {
                        try {
                            String sql1 = "INSERT INTO HOSOTHISINH VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst = cn.prepareStatement(sql1);

                            pst.setString(1, a.getMadtut());
                            pst.setString(2, "1");
                            pst.setString(3, a.getMadantoc());
                            pst.setString(4, a.getMakvut());
                            pst.setString(5, a.getHoten());
                            pst.setString(6, a.getNgaysinh());
                            pst.setString(7, a.getGioitinh());
                            pst.setString(8, a.getSocmnd());
                            pst.setString(9, "Chua xet");
                            pst.setString(10, "0");
                            pst.setString(11, "0");
                            pst.setString(12, "0");
                            pst.setString(13, "0");
                            pst.setString(14, "0");
                            pst.setString(15, "0");
                            pst.setString(16, "0");
                            pst.setString(17, "0");
                            pst.setString(18, "0");

                            if (pst.executeUpdate() > 0) {
                                System.out.println("add thanh cong");
                                return 1;
                            }
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                    }



                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        cn.close();
                        pst.close();
                    }catch(Exception e) {

                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
