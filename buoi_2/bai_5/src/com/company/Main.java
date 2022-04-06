package com.company;
//Viết chương trình nhập vào tọa độ A(x1, y1) và B(x2, y2) trên hệ trục toạ độ Oxy.
//Tính và in ra độ dài đoạn thẳng AB.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x1, y1;
        int x2, y2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap toa do x1: ");
        x1 = sc.nextInt();
        System.out.print("Nhap toa do y1: ");
        y1 = sc.nextInt();
        System.out.print("Nhap toa do x2: ");
        x2 = sc.nextInt();
        System.out.print("Nhap toa do y2: ");
        y2 = sc.nextInt();
        System.out.println("Do dai doan thang la: " +
                point.findLengthOfLine(new point(x1,y1),new point(x2,y2)));
    }

}

class point {
    private int x;
    private int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double findLengthOfLine(point a, point b) {
        return Math.sqrt(Math.pow(b.x - a.x,2) + Math.pow(b.y - a.y,2));
    }
}
