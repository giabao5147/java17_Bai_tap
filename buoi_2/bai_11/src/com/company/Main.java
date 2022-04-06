package com.company;
//Viết chương trình cho phép nhập vào số tự nhiên n,
// in ra số tự nhiên lớn nhất nhỏ hơn log2(n)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        num = sc.nextInt();
        System.out.printf("So tu nhien lon nhat nho hon log2(n) la: %.0f ",
                Math.floor(calculateLog(2,num)));

    }

    public static double calculateLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }
}
