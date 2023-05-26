package org.example.model;

public class HoSoThiSinh {
    private String maTS;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String socmnd;
    private String madtut;
    private String makvut;
    private String dantoc;
    private String madantoc;

    public HoSoThiSinh() {
    }

    public HoSoThiSinh(String hoten, String ngaysinh, String gioitinh, String socmnd, String madtut, String makvut, String madantoc) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.socmnd = socmnd;
        this.madtut = madtut;
        this.makvut = makvut;
        this.madantoc = madantoc;
    }

    public HoSoThiSinh(String maTS, String hoten, String ngaysinh, String gioitinh, String socmnd, String madtut, String makvut, String madantoc) {
        this.maTS=maTS;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.socmnd = socmnd;
        this.madtut = madtut;
        this.makvut = makvut;

        this.madantoc = madantoc;
    }

    public HoSoThiSinh(String maTS) {
        this.maTS = maTS;
    }

    public String getMadantoc() {
        return madantoc;
    }



    public String getMaTS() {
        return maTS;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getSocmnd() {
        return socmnd;
    }

    public String getMadtut() {
        return madtut;
    }

    public String getMakvut() {
        return makvut;
    }

    public String getDantoc() {
        return dantoc;
    }



    public void setMaTS(String maTS) {
        this.maTS = maTS;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setSocmnd(String socmnd) {
        this.socmnd = socmnd;
    }

    public void setMadtut(String madtut) {
        this.madtut = madtut;
    }

    public void setMakvut(String makvut) {
        this.makvut = makvut;
    }

    public void setDantoc(String dantoc) {
        this.dantoc = dantoc;
    }
}

