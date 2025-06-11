package org.beerSolution;

public class Solution {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.say();
    }
}

interface Speakable {
    void say();
}

class Robot implements Speakable {
    public void say() {
        System.out.println("Я робот. Привет!");
    }
}