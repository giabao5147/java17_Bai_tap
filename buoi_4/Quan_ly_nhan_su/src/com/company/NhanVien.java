package com.company;

import java.util.Scanner;

public abstract class NhanVien {
    private String maSo;
    private String hoTen;
    private String soDienThoai;
    private int soNgayLamViec;
    private int luongMotNgay;

    public abstract double tinhLuong();

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ma so: ");
        setMaSo(sc.nextLine());
        System.out.print("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("So dien thoai: ");
        setSoDienThoai(sc.nextLine());
        System.out.print("So ngay lam viec: ");
        setSoNgayLamViec(sc.nextInt());
    }

    public void xuat() {
        System.out.print("Ma so: " + getMaSo() +
                "; Ho ten: " + getHoTen() +
                "; So dien thoai: " + getSoDienThoai() +
                "; So ngay lam viec: " + getSoNgayLamViec() +
                "; Luong mot ngay: " + getLuongMotNgay() +
                "; Tinh luong: " + tinhLuong());
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public int getLuongMotNgay() {
        return luongMotNgay;
    }

    public void setLuongMotNgay(int luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }
}
