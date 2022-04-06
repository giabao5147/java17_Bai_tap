package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng.
//Xóa đi các phần tử bị lặp lại.
public class Main {

    public static void main(String[] args) {
        int n;
        String[] strArr;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so phan tu: ");
        n = sc.nextInt();
        strArr = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu " + i + ": ");
            strArr[i] = sc.nextLine();
        }
        System.out.println("Mang xoa di cac phan tu trung lap: " + removeDuplicateValues(strArr));
    }

    public static Set<String> removeDuplicateValues(String[] str) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }
        return set;
    }
}
