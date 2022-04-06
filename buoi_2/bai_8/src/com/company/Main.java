package com.company;
//Viết chương trình cho phép nhập vào một chuỗi viết thường, in ra chuỗi trên với
//các ký tự đầu tiên được viết in hoa.
import java.util.Scanner;

public class Main {

    private final static int UPPER_CASE_OFFSET = 32;

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao chuoi: ");
        str = sc.nextLine();
        System.out.println("Chuoi ket qua: " + convertUpperCase(str));
    }

    public static String convertUpperCase(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if (( i == 0 || stringBuilder.charAt(i-1) == ' ') && (ch >= 'a' && ch <= 'z')) {
                stringBuilder.setCharAt(i,ch -= UPPER_CASE_OFFSET);
            }
        }
        return stringBuilder.toString();
    }
}
