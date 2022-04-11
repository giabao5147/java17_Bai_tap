package com.company;

import java.util.Scanner;

public class Student {

    private int maSV;
    private String tenSV;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTB;
    private String xepLoai;

    public Student() {};

    public Student(int maSV, String tenSV, double diemToan, double diemLy, double diemHoa) {
        setMaSV(maSV);
        setTenSV(tenSV);
        setDiemToan(diemToan);
        setDiemLy(diemLy);
        setDiemHoa(diemHoa);
        this.diemTB = tinhDiemTB();
        this.xepLoai = xacDinhXepLoai();
    }

    public double tinhDiemTB(){
        diemTB = (diemToan + diemLy + diemHoa) / 3;
        return (double) Math.round(diemTB * 100) / 100;
    }

    public String xacDinhXepLoai() {
        if (diemTB >= 8 && diemTB <= 10) {
            return "Gioi";
        }
        else if (diemTB >= 6 && diemTB < 8) {
            return "Kha";
        }
        else if (diemTB >= 4 && diemTB < 6) {
            return  "Trung binh";
        }
        else {
            return  "Yeu";
        }
    }


    public void nhapSV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma sinh vien: ");
        maSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        tenSV = sc.nextLine();
        System.out.print("Nhap vao diem toan: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhap vao diem ly: ");
        diemLy = sc.nextDouble();
        System.out.print("Nhap vao diem hoa: ");
        diemHoa = sc.nextDouble();
        diemTB = tinhDiemTB();
        xepLoai = xacDinhXepLoai();
    }

    public String xuatSV() {
        return "Thong tin sinh vien: {" +
                "Ma so sinh vien = " + maSV +
                ", ten sinh vien = " + tenSV +
                ", diem toan= " + diemToan +
                ", diem ly= " + diemLy +
                ", diem hoa= " + diemHoa +
                ", diem trung binh= " + diemTB +
                ", xep loai = " + xepLoai +
                '}';
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
}
