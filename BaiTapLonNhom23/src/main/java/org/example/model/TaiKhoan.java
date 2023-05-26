package org.example.model;

import java.io.Serializable;

public class TaiKhoan implements Serializable {
    private String MaNguoiDung;
    private String TenTaiKhoan;
    private String MatKhau;
    private String role;

    public TaiKhoan(String MaNguoiDung, String TenTaiKhoan, String MatKhau) {
        this.MaNguoiDung= this.MaNguoiDung;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.role = role;
    }

    public TaiKhoan(String TenTaiKhoan, String MatKhau) {
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
    }

    public TaiKhoan() {
    }

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }


    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }



}