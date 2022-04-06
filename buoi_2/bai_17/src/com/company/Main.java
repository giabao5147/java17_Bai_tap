package com.company;

import java.util.Random;
import java.util.Scanner;

//Phát sinh ngẫu nhiên một số từ 1 đến 1000
//Người dùng sẽ đoán và nhập, nếu đúng với kết quả của máy, game sẽ dừng.
//Ngược lại máy sẽ báo bạn đang nhập một số lớn hơn hoặc nhỏ hơn số bí mật
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secretNumber, guessedNumber;

        secretNumber = random.nextInt(1000) + 1;
        do {
            System.out.print("Doan mot so: ");
            guessedNumber = sc.nextInt();
        } while (!isSecretNumber(guessedNumber,secretNumber));
    }

    public static boolean isSecretNumber(int guessedNumber, int secretNumber) {

        if (guessedNumber > secretNumber) {
            System.out.println("Ban da nhap mot so lon hon ");
            return false;
        }
        else if (guessedNumber < secretNumber) {
            System.out.println("Ban da nhap mot so nho hon");
            return false;
        }
        else {
            System.out.println("Ban da nhap dung");
            return true;
        }
    }
}
