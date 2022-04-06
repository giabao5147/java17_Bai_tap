package com.company;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào số tự nhiên n (từ 1 đến 9) và
// in ra tam giác vuông có độ dài tương ứng.
public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so tu nhien: ");
        num = sc.nextInt();
        printTriangle(num);
    }

    public static void printTriangle(int d) {
        for (int line = 1; line <= d; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

}
