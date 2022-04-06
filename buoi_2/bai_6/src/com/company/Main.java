package com.company;
////Viết chương trình cho phép nhập vào một chuỗi, in ra chuỗi theo thứ tự ngược lai
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao chuoi: ");
        str = sc.nextLine();
        System.out.println("Chuoi nguoc lai: " + reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
