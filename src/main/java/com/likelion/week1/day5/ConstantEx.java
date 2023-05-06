package com.likelion.week1.day5;

public class ConstantEx {
    public final int MAX_LEVEL = 3; // 이 클래스 내에서 사용 가능하다.
    // static을 붙이면 Class 인스턴스화 하지 않아도 아무데서나 쓸 수 있다.
    // ConstantEx c = new ~ ...
    // c.Max_LEVEL
    public static final int MIN_LEVEL = 1;
    public static void main(String[] args) {
        final int iVal; // 앞에 final을 붙인다.
        iVal = 1;   // 최초엔 한 번만 값을 지정할 수 있다.
        System.out.println(iVal);
    }
}
