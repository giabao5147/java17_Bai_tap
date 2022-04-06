package com.company;
//Giai phuong trinh bac 1 va 2
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        do {} while (showMenu());
    }

    public static boolean showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("----Menu----");
        System.out.println("1: Giai phuong tring bac 1");
        System.out.println("2: Giai phuong trinh bac 2");
        System.out.println("3: Thoat");
        System.out.print("Lua chon: ");
        choice = sc.nextInt();
        if (choice == 3) {
            return false;
        }
        else {
            menuChoices(choice);
            return true;
        }
    }


    public static void menuChoices(int choice) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double nghiem, delta, x1, x2;

        System.out.print("Nhap vao a: ");
        a = sc.nextDouble();
        System.out.print("Nhap vao b: ");
        b = sc.nextDouble();
        switch (choice) {
            case 1:
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("Phuong trinh co vo so nghiem");
                    } else {
                        System.out.println("Phuong trinh vo nghiem");
                    }
                } else {
                    x1 = -b / a;
                    System.out.println("Phuong trinh co nghiem x = " + x1);
                }
                break;
            case 2:
                System.out.print("Nhap vao c: ");
                c = sc.nextDouble();
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("Phương trinh vo nghiem");
                    } else {
                        System.out.println("Phuong trinh co mot nghiem: " + "x = " + (-c / b));
                    }
                    break;
                }
                delta = b*b - 4*a*c;;
                if (delta > 0) {
                    x1 = (-b + Math.sqrt(delta)) / (2*a);
                    x2 = (-b - Math.sqrt(delta)) / (2*a);
                    System.out.println("Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + " va x2 = " + x2);
                } else if (delta == 0) {
                    x1 = (-b / (2 * a));
                    System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
                break;
        }
    }
}
