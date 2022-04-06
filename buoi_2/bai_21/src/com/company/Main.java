package com.company;
//Kangaroo
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x1, v1, x2, v2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x1: ");
        x1 = sc.nextInt();
        System.out.print("Nhap v1: ");
        v1 = sc.nextInt();
        System.out.print("Nhap x2: ");
        x2 = sc.nextInt();
        System.out.print("Nhap v2: ");
        v2 = sc.nextInt();
        System.out.printf("Kangaroo %s gap nhau",
                kangaroo(x1,v1,x2,v2) ? "co" : "khong");
    }

    public static boolean kangaroo(int x1, int v1, int x2, int v2) {
        if ((v1 > v2) && ((x2-x1) % (v2-v1) == 0)) {
            return true;
        }
        else {
            return false;
        }
    }
}
