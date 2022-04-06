package com.company;
//Viết chương trình chuyển đổi số từ hệ cơ số 10
//sang hệ cơ số nhị phân và ngược lại.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int number1 = 142;
        String number2 = "100010010000001011";

        System.out.println(decToBin(number1));
        System.out.println(binToDec(number2));
    }

    public static String decToBin(int decNumber) {
        Stack<Integer> numberStack = new Stack<>();
        StringBuilder result = new StringBuilder();

        while (decNumber > 0) {
            numberStack.push(decNumber % 2);
            decNumber /= 2;
        }
        while (!numberStack.isEmpty()) {
            result.append(numberStack.pop());
        }
        return result.toString();
    }

    public static int binToDec(String binNumber) {
        int result = 0;
        int count = 0;
        char[] numberArr = binNumber.toCharArray();

        for (int i = numberArr.length - 1; i >= 0 ; i--) {
            if (numberArr[i] == '1'){
                result += Math.pow(2,count);
            }
            count++;
        }
        return result;
    }
}
