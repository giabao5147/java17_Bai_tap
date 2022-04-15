package com.company;

import java.util.Map;
import java.util.Scanner;

public class CongTy {
    private String ten;
    private String maSoThue;
    private double doanhThuThang;

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ten cong ty: ");
        setTen(sc.nextLine());
        System.out.print("Ma so thue: ");
        setMaSoThue(sc.nextLine());
        System.out.print("Doanh thu thang: ");
        setDoanhThuThang(sc.nextDouble());
    }

    public double tongLuongToanCongTy(DanhSachNhanVien danhSachNhanVien) {
        double sum = 0;

        for (Map.Entry<String, NhanVien> nhanVien :
                danhSachNhanVien.getDanhSach().entrySet()){
            sum += nhanVien.getValue().tinhLuong();
        }
        return sum;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public double getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(double doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }
}
