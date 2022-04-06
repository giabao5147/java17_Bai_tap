package com.company;
//Xu ly mang
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, index;
        Integer[] intArr;
        Map<String,Integer> result;
        Scanner sc = new Scanner(System.in);

        System.out.print("---Nhap so phan tu: ");
        number = sc.nextInt();
        intArr = new Integer[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Nhap phan tu " + i + ": ");
            intArr[i] = sc.nextInt();
        }
        result = findMaxMin(intArr);
        System.out.println("Gia tri trung binh: " + calculateAverage(intArr));
        System.out.println("Phan tu lon nhat: " + result.get("max"));
        System.out.println("Phan tu nho nhat: " + result.get("min"));
        System.out.println("Phan tu am lon nhat: " + result.get("maxNegativeValue"));
        System.out.println("Phan tu am nho nhat: " + result.get("minNegativeValue"));
        System.out.println("Phan tu duong lon nhat: " + result.get("maxPositiveValue"));
        System.out.println("Phan tu duong nho nhat: " + result.get("minPositiveValue"));
        printNumber(intArr);    //In ra cac phan tu chan le

        System.out.print("Nhap index can them: ");
        index = sc.nextInt();
        System.out.print("Nhap phan tu: ");
        number = sc.nextInt();
        intArr = insertElementAtIndex(intArr,number,index);
        System.out.println("Mang sau khi them: " + Arrays.toString(intArr));
        System.out.print("Nhap index can xoa: ");
        index = sc.nextInt();
        intArr = removeElementByIndex(intArr,index);
        System.out.println("Mang sau khi xoa " + Arrays.toString(intArr));
    }
    //Tinh gia tri trung binh
    public static double calculateAverage(Integer[] intArr) {
        double average = 0;

        for (Integer number : intArr) {
            average += number;
        }
        return average / intArr.length;
    }
    //Tim phan tu lon nhat, nho nhat
    public static Map<String, Integer> findMaxMin(Integer[] arr) {
        int index = 0;
        Integer[] intArr = arr.clone();
        Map<String, Integer> result = new HashMap<>();

        Arrays.sort(intArr);
        result.put("max",intArr[intArr.length - 1]);
        result.put("min",intArr[0]);
        result.put("minNegativeValue",intArr[0] < 0 ? intArr[0] : null);    //So am nho nhat o dau mang
        result.put("maxPositiveValue",intArr[intArr.length - 1] >= 0 ? intArr[intArr.length -1] : null); //So duong lon nhat o cuoi mang

        result.put("maxNegativeValue",result.get("minNegativeValue"));
        if (result.get("maxNegativeValue") != null) {
            while (index < intArr.length && intArr[index] < 0 ) {   //Tim so am lon nhat trong mang
                if (result.get("maxNegativeValue") <= intArr[index]) {
                    result.put("maxNegativeValue", intArr[index]);
                }
                index++;
            }
        }
        if (index < intArr.length) {    // Lay so duong nho nhat tu vi tri so am lon nhat + 1
            result.put("minPositiveValue", intArr[index]);
        }
        else {  //So am nho nhat nam o cuoi day, khong co so duong trong day
            result.put("minPositiveValue", null);
        }
        return result;
    }

    //In cac phan tu chan le
    public static void printNumber(Integer[] intArr) {
        StringBuilder evenNumbers = new StringBuilder("Cac so chan: ");
        StringBuilder oddNumbers = new StringBuilder("Cac so le: ");

        for (int num : intArr) {
            if (num % 2 == 0) {
                evenNumbers.append(num).append(" ");
            }
            else {
                oddNumbers.append(num).append(" ");
            }
        }
        System.out.println(evenNumbers.toString());
        System.out.println(oddNumbers.toString());
    }
    //Them mot phan tu va xoa mot phan tu theo index
    public static void arrayCopy(Integer[] arrSrc, int indexSrc, Integer[] arrDes, int indexDes, int length) {
        for (int i = 0; i < length; i++) {
            arrDes[indexDes++] = arrSrc[indexSrc++];
        }
    }

    public static Integer[] insertElementAtIndex(Integer[] intArr, int element, int index) {
        Integer[] newArr = new Integer[intArr.length + 1];

        if (index == intArr.length) {   //Phan tu o cuoi mang
            arrayCopy( intArr, 0, newArr, 0, intArr.length);
            newArr[index] = element;
        }
        else {
            arrayCopy(intArr, 0, newArr, 0, index);
            newArr[index] = element;
            arrayCopy(intArr, index, newArr, index + 1, intArr.length - index);
        }
        return newArr;
    }

    public static Integer[] removeElementByIndex(Integer[] intArr, int index) {
        Integer[] newArr = new Integer[intArr.length -1];

        if (index == intArr.length - 1) {   //Phan tu o cuoi mang
            arrayCopy(intArr, 0, newArr, 0, intArr.length - 1);
        }
        else {
            arrayCopy(intArr, 0, newArr, 0, index);
            arrayCopy(intArr, index + 1, newArr, index, intArr.length - index - 1);
        }
        return newArr;
    }

}
