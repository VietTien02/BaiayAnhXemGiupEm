
create database QLSVDHCN;
use QLSVDHCN;
-- Bảng Hồ sơ thí sinh
CREATE TABLE HoSoThisinh (
  MaThiSinh INT PRIMARY KEY,
  MaDoiTuongUuTien INT,
  MaKhoi INT,
  MaDanToc INT,
  MaKhuVucUuTien INT,
  HoTen NVARCHAR(100),
  NgaySinh DATE,
  GioiTinh NVARCHAR(10),
  SoCMND NVARCHAR(20),
  DaTrungTuyen BOOLEAN,
  DiemToan FLOAT,
  DiemLi FLOAT,
  DiemHoa FLOAT,
  DiemNgoaiNgu FLOAT,
  DiemVan FLOAT,
  DiemSu FLOAT,
  DiemDia FLOAT,
  DiemGDCD FLOAT,
  DiemSinh FLOAT,
  TongDiemUuTien FLOAT,
  FOREIGN KEY (MaDoiTuongUuTien) REFERENCES DoiTuongUuTien(MaDoiTuongUuTien),
  FOREIGN KEY (MaKhoi) REFERENCES KhoiXetTuyen(MaKhoi),
  FOREIGN KEY (MaDanToc) REFERENCES DanToc(MaDanToc),
  FOREIGN KEY (MaKhuVucUuTien) REFERENCES KhuVucUuTien(MaKhuVucUuTien)
);

-- Bảng Đối tượng ưu tiên
CREATE TABLE DoiTuongUuTien (
  MaDoiTuongUuTien INT PRIMARY KEY,
  MaKhuVucUuTien INT,
  GhiChu NVARCHAR(255),
  FOREIGN KEY (MaKhuVucUuTien) REFERENCES KhuVucUuTien(MaKhuVucUuTien)
);

-- Bảng Khu vực ưu tiên
CREATE TABLE KhuVucUuTien (
  MaKhuVucUuTien INT PRIMARY KEY,
  TenKhuVuc NVARCHAR(50),
  GhiChu NVARCHAR(255)
);

-- Bảng Dân tộc
CREATE TABLE DanToc (
  MaDanToc INT PRIMARY KEY,
  TenDanToc NVARCHAR(50),
  GhiChu NVARCHAR(255)
);

-- Bảng Ngành
CREATE TABLE Nganh (
  MaNganh INT PRIMARY KEY,
  MaKhoi INT,
  TenNganh NVARCHAR(100),
  FOREIGN KEY (MaKhoi) REFERENCES KhoiXetTuyen(MaKhoi)
);

-- Bảng Khối xét tuyển
CREATE TABLE KhoiXetTuyen (
  MaKhoi INT PRIMARY KEY,
  TenKhoi NVARCHAR(50),
  GhiChu NVARCHAR(255)
);

-- Bảng Địa điểm thi
CREATE TABLE DiaDiemThi (
  MaDiaDiemThi INT PRIMARY KEY,
  TenDiaDiem NVARCHAR(100),
  GhiChu NVARCHAR(255)
);

-- Bảng Phòng thi
CREATE TABLE PhongThi (
  MaPhongThi INT PRIMARY KEY,
  MaDiaDiemThi INT,
  GhiChu NVARCHAR(255),
  SoLuongThiSinh INT,
   FOREIGN KEY (MaDiaDiemThi) REFERENCES DiaDiemThi(MaDiaDiemThi)
);

-- Bảng Phòng thi thí sinh
CREATE TABLE PhongThiThisinh (
  MaThiSinh INT,
  MaPhongThi INT,
  SoPhongThi INT,
  PRIMARY KEY (MaThiSinh, MaPhongThi),
  FOREIGN KEY (MaThiSinh) REFERENCES HoSoThisinh(MaThiSinh),
  FOREIGN KEY (MaPhongThi) REFERENCES PhongThi(MaPhongThi)
);

-- Bảng Người dùng
CREATE TABLE NguoiDung (
  MaNguoiDung INT PRIMARY KEY,
  TenNguoiDung NVARCHAR(50),
  MatKhau NVARCHAR(50),
  role varchar(10)
);
ALTER TABLE NguoiDung change COLUMN PhanQuyenAdmin role varchar (20);

insert into nguoidung values (123, 'viettien', 'anhhung12','admin');
insert into nguoidung values (1234, 'viettien1', 'anhhung12','admin');
