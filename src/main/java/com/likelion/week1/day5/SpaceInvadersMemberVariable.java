package com.likelion.week1.day5;

public class SpaceInvadersMemberVariable {
    int location;

    public void moveLeft() {
        location = location -1;
    }
    public void moveRight() {
        location = location + 1;
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        System.out.println(simv.location);
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        System.out.println("최종 위치 =" + simv.location);
    }
}
