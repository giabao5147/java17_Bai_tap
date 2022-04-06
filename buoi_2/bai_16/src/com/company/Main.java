package com.company;
//Viết chương trình kiểm tra xem năm nhập vào có phải năm nhuận hay không?
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Nhap vao nam: ");
        year = sc.nextInt();
        System.out.printf("Nam %d la nam %s",
                year,
                isLeapYear(year) ? "nhuan" : "khong nhuan");
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        }
        else {
            return year % 4 == 0;
        }
    }

}
