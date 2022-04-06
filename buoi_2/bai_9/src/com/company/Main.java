package com.company;
//Viết chương trình cho phép nhập vào 2 số nguyên dương, in TRUE
//nếu 2 số trên có cùng một hoặc 2 chữ số, ngược lại in ra FALSE (VD: (12, 81)
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String num1, num2;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---Nhap hai so---");
            System.out.print("Nhap so thu nhat: ");
            num1 = sc.nextLine();
            System.out.print("Nhap so thu hai: ");
            num2 = sc.nextLine();
        }while (!isValidNumber(num1) || !isValidNumber(num2));
        System.out.println("Ket qua: " + isSameDigit(num1,num2));
    }

     public static boolean isValidNumber(String str) {
        return str.matches("^[1-9]\\d{1}");
     }

     public static boolean isSameDigit(String str1, String str2) {
         HashMap<Character,Integer> hashMap = new HashMap<>();

         hashMap.put(str1.charAt(0),1);
         hashMap.put(str1.charAt(1),1);
         if (hashMap.containsKey(str2.charAt(0)) || hashMap.containsKey(str2.charAt(1))) {
             return true;
         }
         return false;
     }
}
