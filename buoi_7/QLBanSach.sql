CREATE DATABASE QLBanSach;

USE QLBanSach;

CREATE TABLE khach_hang (
    ma_kh VARCHAR(25),
    tai_khoan VARCHAR(255) NOT NULL,
    mat_khau VARCHAR(255) NOT NULL,
    ho_ten VARCHAR(50) NOT NULL,
    dia_chi VARCHAR(255) NOT NULL,
    dien_thoai  VARCHAR(20) NOT NULL,
    gioi_tinh CHAR(3),
    email VARCHAR(255),
    ngay_sinh DATE,

    PRIMARY KEY (ma_kh)
);

CREATE TABLE don_hang (
    ma_don_hang VARCHAR(20),
    da_thanh_toan BOOLEAN NOT NULL,
    ngay_dat DATE NOT NULL,
    ngay_giao DATE,
    tinh_trang_giao_GH VARCHAR(50),
    ma_kh VARCHAR(25),
    
    PRIMARY KEY (ma_don_hang),
    CONSTRAINT fk_ma_kh FOREIGN KEY (ma_kh) 
    REFERENCES khach_hang(ma_kh) 
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE chu_de (
    ma_chu_de VARCHAR(20),
    ten_chu_de VARCHAR(50) NOT NULL,

    PRIMARY KEY (ma_chu_de)
);

CREATE TABLE nha_xuat_ban (
    ma_nxb VARCHAR(20),
    ten_nxb VARCHAR(50) NOT NULL,
    dia_chi VARCHAR(255),
    dien_thoai VARCHAR(20),

    PRIMARY KEY (ma_nxb)
);

CREATE TABLE sach (
    ma_sach VARCHAR(10),
    ten_sach VARCHAR(255) NOT NULL,
    so_luong_ton INT NOT NULL,
    ngay_cap_nhat DATE NOT NULL,
    gia_ban INT NOT NULL,
    anh_bia BLOB,
    mo_ta VARCHAR(255),
    ma_chu_de VARCHAR(20),
    ma_nxb VARCHAR(20),

    PRIMARY KEY (ma_sach),
    CONSTRAINT fk_ma_chu_de FOREIGN KEY (ma_chu_de)
    REFERENCES chu_de(ma_chu_de)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_ma_nxb FOREIGN KEY (ma_nxb)
    REFERENCES nha_xuat_ban(ma_nxb)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE tac_gia (
    ma_tac_gia VARCHAR(20),
    ten_tac_gia VARCHAR(50) NOT NULL,
    dia_chi VARCHAR(50),
    tieu_su TEXT,
    dien_thoai VARCHAR(20),

    PRIMARY KEY (ma_tac_gia)
);

CREATE TABLE chi_tiet_don_hang (
    ma_don_hang VARCHAR(20),
    ma_sach VARCHAR(20),
    so_luong INT NOT NULL,
    don_gia INT NOT NULL,

    PRIMARY KEY (ma_don_hang,ma_sach),
    CONSTRAINT fk_ma_don_hang_chi_tiet FOREIGN KEY (ma_don_hang)
    REFERENCES don_hang(ma_don_hang)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_ma_sach_chi_tiet FOREIGN KEY (ma_sach)
    REFERENCES sach(ma_sach)
    ON DELETE CASCADE ON UPDATE CASCADE
);

create TABLE tac_gia_sach (
    ma_sach VARCHAR(20),
    ma_tac_gia VARCHAR(20),
    vai_tro VARCHAR(50),
    vi_tri VARCHAR(50),

    PRIMARY KEY (ma_tac_gia,ma_sach),
    CONSTRAINT fk_ma_sach_tac_gia FOREIGN KEY (ma_sach)
    REFERENCES sach(ma_sach)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_ma_tac_gia_sach FOREIGN KEY (ma_tac_gia)
    REFERENCES tac_gia(ma_tac_gia)
    ON DELETE CASCADE ON UPDATE CASCADE
);