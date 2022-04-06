package com.company;
//Viết chương trình cho phép nhập vào String, tìm palindromic.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao chuoi: ");
        str = sc.nextLine();

        System.out.println("Palindromic substring dai dai nhat la: " + longestPalindromicWords(str));

    }

    public static String longestPalindromicWords(String str) {
        String result = "";
        String[] strArr = str.split(" ");

        for (String word : strArr) {
            if (isPalindromic(word)) {
                if (word.length() >= result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    public static boolean isPalindromic(String str) {
        char[] chars = str.toCharArray();
        int leftIndex = 0;
        int rightIndex = chars.length - 1;

        while (leftIndex < rightIndex) {
            if (chars[leftIndex] != chars[rightIndex]) {
                return false;
            }
            rightIndex--;
            leftIndex++;
        }
        return true;
    }
}
