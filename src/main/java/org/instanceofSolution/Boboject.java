package org.instanceofSolution;

public class Boboject {
    public static void main(String[] args) {
        Object animal = new Tiger(); // исправь эту строку

        if (animal instanceof Tiger) {
            System.out.println("Bingo!");
        }
    }

    public static class Animal {}
    public static class Pet extends Animal {}
    public static class Cat extends Pet {}
    public static class Tiger extends Cat {}
}