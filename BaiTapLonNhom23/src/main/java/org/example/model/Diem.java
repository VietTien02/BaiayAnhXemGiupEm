package org.example.model;

public class Diem {
    private String MaTS;
    private float DiemToan;
    private float DiemLy;
    private float DiemHoa;
    private float DiemNgoaiNgu;
    private float DiemVan;
    private float DiemSu;
    private float DiemDia;
    private float DiemGDCD;
    private float DiemSinh;
    private String khoiXetTuyen;

    public Diem() {
    }

    public Diem(String MaTS, float DiemToan, float DiemLy, float DiemHoa, float DiemNgoaiNgu, float DiemVan, float DiemSu, float DiemDia, float DiemGDCD, float DiemSinh) {
        this.MaTS = MaTS;
        this.DiemToan = DiemToan;
        this.DiemLy = DiemLy;
        this.DiemHoa = DiemHoa;
        this.DiemNgoaiNgu = DiemNgoaiNgu;
        this.DiemVan = DiemVan;
        this.DiemSu = DiemSu;
        this.DiemDia = DiemDia;
        this.DiemGDCD = DiemGDCD;
        this.DiemSinh = DiemSinh;
    }

    public Diem(String MaTS, String khoiXetTuyen) {
        this.MaTS = MaTS;
        this.khoiXetTuyen = khoiXetTuyen;
    }


    public String getMaTS() {
        return MaTS;
    }

    public float getDiemToan() {
        return DiemToan;
    }

    public float getDiemLy() {
        return DiemLy;
    }

    public float getDiemHoa() {
        return DiemHoa;
    }

    public float getDiemNgoaiNgu() {
        return DiemNgoaiNgu;
    }

    public float getDiemVan() {
        return DiemVan;
    }

    public float getDiemSu() {
        return DiemSu;
    }

    public float getDiemDia() {
        return DiemDia;
    }

    public float getDiemGDCD() {
        return DiemGDCD;
    }

    public float getDiemSinh() {
        return DiemSinh;
    }

    public String getKhoiXetTuyen() {
        return khoiXetTuyen;
    }


}
