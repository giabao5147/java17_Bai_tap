package com.company;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

///Viết chương trình tách một mảng số tự nhiên được nhập từ bàn phím thành 2
//mảng: một mảng chẵn + một mảng lẻ
public class Main {

    public static void main(String[] args) {
        int[] intArr;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so phan tu: ");
        n = sc.nextInt();
        intArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu " + i +": ");
            intArr[i] = sc.nextInt();
        }
        splitArray(intArr);
    }

    public static void splitArray(int[] intArr) {
        ArrayList<Integer> arrayListEven = new ArrayList<>();
        ArrayList<Integer> arrayListOdd = new ArrayList<>();

        for (int number : intArr) {
            if (number % 2 == 0 ){
                arrayListEven.add(number);
            }
            else {
                arrayListOdd.add(number);
            }
        }
        System.out.println("Mang chan: " + arrayListEven);
        System.out.println("Mang le: " + arrayListOdd);
    }
}
