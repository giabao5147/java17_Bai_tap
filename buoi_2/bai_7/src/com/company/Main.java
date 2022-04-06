package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Viết chương trình cho phép nhập vào một số tự nhiên và
//in ra các ước số của số tự nhiên đó
public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot so: ");
        num = sc.nextInt();
        System.out.println("Uoc so: " + findAllDivisors(num));
    }

    public static List<Integer> findAllDivisors(int num) {
        List<Integer> result = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
