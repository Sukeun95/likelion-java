package com.likelion.week1.day5;

public class User {
    String name;
    String phoneNumber;
    int age;

    boolean isAdult() {
        if(age >= 20) {
            return true;
        }
        else {
            return false;
        }
    }
}
