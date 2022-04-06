package com.company;
//Tinh lai suat khong ky han
import java.util.Scanner;

public class Main {

    public static final double LAI_SUAT = 0.03;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tienGui, tienLai;
        double laiSuat;

        System.out.print("Nhap vao so tienn gui: ");
        tienGui = sc.nextLong();
        System.out.print("Nhap so tien lai mong muon: ");
        tienLai = sc.nextLong();
        System.out.printf("So ngay can thiet de nhan duoc so tien lai la: " +
                tinhSoNamGuiTietKiem(tienGui, LAI_SUAT, tienLai) + " ngay");
    }

    public static double tinhSoNamGuiTietKiem(long tienGui, double laiSuat, long tienLai) {
        return  ((tienLai / (tienGui * laiSuat)) * 360);
    }
}
