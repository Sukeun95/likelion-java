package com.likelion.week2.day2;

public class StringSplit {
    public static void main(String[] args) {
        String str = "7 3 13 28 10 240";
        String[] strArr = str.split(" ");
        System.out.println(strArr[0]); // 7
        System.out.println(strArr[1]); // 3
        System.out.println(strArr[2]); // 13
        System.out.println(strArr[3]); // 28
        System.out.println(strArr[4]); // 10
        System.out.println(strArr[5]); // 240
    }
}
