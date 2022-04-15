package com.company;

public class TruongPhong extends NhanVien{
    static final int LUONG_MOT_NGAY = 200;
    private int soLuongNhanVien;

    @Override
    public double tinhLuong() {
        return getLuongMotNgay() * getSoNgayLamViec() + 100 * soLuongNhanVien;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println();
    }

    @Override
    public void xuat() {
        System.out.print("[Truong phong] ");
        super.xuat();
        System.out.println("; So luong nhan vien duoi quyen: " + getSoLuongNhanVien());
    }

    public TruongPhong() {
        soLuongNhanVien = 0;
        setLuongMotNgay(LUONG_MOT_NGAY);
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }
}
