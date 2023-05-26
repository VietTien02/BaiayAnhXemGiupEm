package org.example.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    public static Connection conn() {
        String url = "jdbc:mysql://localhost:3306/qlsvdhcn";
        String user = "root";
        String password = "1234";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                // Kết nối thành công

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }




}