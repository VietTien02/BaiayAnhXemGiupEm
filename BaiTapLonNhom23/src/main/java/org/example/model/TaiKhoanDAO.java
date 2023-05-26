package org.example.model;

import org.example.conn.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaiKhoanDAO {
    public int addAdmin(TaiKhoan a) throws SQLException {
        Connection cn = null;
        PreparedStatement pst = null;
        try {

            String check = "SELECT * FROM TaiKhoan WHERE TenNguoiDung=?";
            cn = (Connection) connection.conn();
            PreparedStatement p = cn.prepareStatement(check);
            p.setString(1, a.getTenTaiKhoan());
            ResultSet resultSet = p.executeQuery();
            if (resultSet.next()) {
                return 0;

            }

            String sql = "INSERT INTO TaiKhoan VALUES (?,?,?)";
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getTenTaiKhoan());
            pst.setString(2, a.getMatKhau());
            pst.setString(3, "admin");

            if (pst.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
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
        return -1;
    }

    public int addUser(TaiKhoan a) throws SQLException {
        Connection cn = null;
        PreparedStatement pst = null;
        try {

            String check = "SELECT * FROM TaiKhoan WHERE TenNguoiDung=?";
            cn = (Connection) connection.conn();
            PreparedStatement p = cn.prepareStatement(check);
            p.setString(1, a.getTenTaiKhoan());
            ResultSet resultSet = p.executeQuery();
            if (resultSet.next()) {
                return 0;

            }
            String sql = "INSERT INTO TaiKhoan VALUES (?,?,?)";
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getTenTaiKhoan());
            pst.setString(2, a.getMatKhau());
            pst.setString(3, "user");
            if (pst.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
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
        return -1;
    }
    public int deleteAccount(TaiKhoan a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "DELETE FROM TaiKhoan WHERE TenNguoiDung=?";
            cn = connection.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getTenTaiKhoan());
            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int updateAccount(TaiKhoan a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "UPDATE TaiKhoan SET MatKhau=? WHERE TenNguoiDung=?";
            cn = connection.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getMatKhau());
            pst.setString(2, a.getTenTaiKhoan());
            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public static void main(String args[]) {

    }
}