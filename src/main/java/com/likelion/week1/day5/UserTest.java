package com.likelion.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "윤수근";
        user.phoneNumber = "010-1111-2222";
        user.age = 29;

        System.out.println(user.name);
        System.out.println(user.phoneNumber);
        System.out.println(user.age);

        System.out.printf("이 사용자는 성인입니까? %b", user.isAdult());
    }
}
