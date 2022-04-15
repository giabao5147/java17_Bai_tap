package com.company;

import java.util.Scanner;

public class GiamDoc extends NhanVien{
    static final int LUONG_MOT_NGAY = 300;
    private double coPhan;

    @Override
    public double tinhLuong() {
        return getLuongMotNgay() * getSoNgayLamViec();
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        super.nhap();
        System.out.print("Co phan trong cong ty: ");
        coPhan = sc.nextDouble();
    }

    @Override
    public void xuat() {
        System.out.print("[Giam doc] ");
        super.xuat();
        System.out.println("; Co phan trong cong ty: " + getCoPhan());
    }

    public double tinhThuNhap(CongTy congTy, DanhSachNhanVien danhSachNhanVien) {
        double loiNhuanCongTy;
        double result;

        loiNhuanCongTy = congTy.getDoanhThuThang() * congTy.tongLuongToanCongTy(danhSachNhanVien);
        result = tinhLuong() + getCoPhan() + loiNhuanCongTy;
        return result;
    }

    public GiamDoc() {
        coPhan = 0;
        setLuongMotNgay(LUONG_MOT_NGAY);
    }

    public double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(double coPhan) {
        this.coPhan = coPhan;
    }
}
