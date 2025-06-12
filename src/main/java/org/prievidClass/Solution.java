package org.prievidClass;

import org.instanceofSolution.Boboject;

public class Solution {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();

        // расширение
        Object obj = new Tiger();
        Animal animal = tiger;
        Pet pet = tiger;
        Cat cat = tiger;

        // сужение
        Tiger tiger2 = (Tiger) obj;

        tiger2.roar();
    }

    public static class Animal {}
    public static class Pet extends Animal {}
    public static class Cat extends Pet {}
    public static class Tiger extends Cat {
        public void roar() {
            System.out.println("Roooaar!");
        }
    }
}