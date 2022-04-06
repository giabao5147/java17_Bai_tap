package com.company;
//Bai tap tinh tien karaoke
import java.util.Scanner;

public class Main {

    private static final int GIA_3_GIO_DAU = 30000;
    private static final double GIAM_GIA_SAU_3_GIO = 0.3;
    private static final int GIA_1_CHAI_NUOC = 10000;
    private static final double GIO_MO_CUA = 9.0;
    private static final double GIO_DONG_CUA = 24.0;
    private static final double GIO_GIAM_TIEN = 17.0;
    private static final double GIAM_TRONG_KHUNG_GIO = 0.2;

    public static void main(String[] args) {
        double startHour;
        double endHour;
        Scanner sc =  new Scanner(System.in);

        do {
            System.out.println("---Nhap thong tin---");
            System.out.print("Nhap vao gio bat dau: ");
            startHour = sc.nextDouble();
            System.out.print("Nhap vao gio ket thuc: ");
            endHour = sc.nextDouble();
        }while (!isValidTime(startHour,endHour));
        System.out.println("Tong chi phi: " + tinhChiPhi(startHour,endHour) + " VND");
    }

    public static boolean isValidTime(double startHour, double endHour) {
        return (endHour > startHour && startHour >= GIO_MO_CUA && endHour <= GIO_DONG_CUA);
    }

    public static double tinhChiPhi(double startHour, double endHour) {
        double result;
        double duration = endHour -startHour;

        if ((duration) <= 3) {
            result = GIA_3_GIO_DAU * duration;
        }
        else {
            result = GIA_3_GIO_DAU * 3 + (duration - 3) * GIA_3_GIO_DAU * GIAM_GIA_SAU_3_GIO;
        }
        if (startHour >= GIO_MO_CUA && startHour <=GIO_GIAM_TIEN) {
            result -= result * GIAM_TRONG_KHUNG_GIO;
        }
        return result;
    }
}
