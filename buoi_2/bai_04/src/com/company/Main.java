package com.company;
//Viết chương trình cho phép nhập vào một số tự nhiên và
//in ra tổng các chữ số của số tự nhiên đó.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhap vao so tu nhien: ");
            num = sc.nextLine();
        } while (!num.matches("\\d+"));
        System.out.println("Tong cac chu so la: " + tongCacChuSo(Integer.parseInt(num)));
    }

    public static int tongCacChuSo(int num) {
        int sum = 0;

        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        return sum;
    }
}
