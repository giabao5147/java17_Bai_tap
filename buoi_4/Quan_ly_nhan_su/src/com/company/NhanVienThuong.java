package com.company;

import java.util.Scanner;

public class NhanVienThuong extends NhanVien{
    static final int LUONG_MOT_NGAY = 100;
    private String truongPhongQuanLy; //Ma so truong phong

    @Override
    public double tinhLuong() {
        return getLuongMotNgay() * getSoNgayLamViec();
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        super.nhap();
        System.out.print("Ma so truong phong quan ly: ");
        truongPhongQuanLy= sc.nextLine();
    }

    @Override
    public void xuat() {
        System.out.print("[Nhan vien thuong] ");
        super.xuat();
        System.out.println("; Ma so truong phong quan ly: " + getTruongPhongQuanLy());
    }

    public NhanVienThuong() {
        truongPhongQuanLy = null;
        setLuongMotNgay(LUONG_MOT_NGAY);
    }

    public String getTruongPhongQuanLy() {
        return truongPhongQuanLy;
    }

    public void setTruongPhongQuanLy(String truongPhongQuanLy) {
        this.truongPhongQuanLy = truongPhongQuanLy;
    }
}
