package com.company;
//Viết chương trình cho phép nhập vào một chuỗi:
//a) In ra độ dài của chuỗi
//b) In ra ký tự (char) tại một vị trí nhất định (index)
//c) Kiểm tra xem, trong chuỗi vừa nhập có chuỗi phụ "abcdef" hay không

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String PATTERN = "abcdef";
    public static void main(String[] args) {
        String str;
        int index;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        str = sc.nextLine();
        System.out.println("Do dai cua chuoi: " + str.length());
        System.out.print("Nhap vi tri can in: ");
        index = sc.nextInt();
        System.out.println("Ky tu tai vi tri " + index + " la: " + str.charAt(index));
        System.out.printf("Trong chuoi vua nhap %s chuoi phu %s",
                isContain(str) ? "co" : "khong co",
                PATTERN);
    }

    public static boolean isContain(String str) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
