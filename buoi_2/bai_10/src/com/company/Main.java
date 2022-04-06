package com.company;
//Viết chương trình cho phép nhập vào số tự nhiên n,
// in ra tổng các số nguyên tố từ 1 đến n,

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so: ");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.printf("Tong cac so nguyen to tu 1 den %d la: %d",num,sum);

    }

    public static boolean isPrime(int num) {
        if (num <=1 || (num != 2 && num % 2 == 0)) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num) ; i+= 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
