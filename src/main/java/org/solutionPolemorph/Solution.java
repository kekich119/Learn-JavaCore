package org.solutionPolemorph;

public class Solution {
    public static void identify(Object o) {
        if (o instanceof Cat) {
            System.out.println("Это кошка");
        } else if (o instanceof Dog) {
            System.out.println("Это собака");
        } else if (o instanceof TV) {
            System.out.println("Это телевизор");
        } else {
            System.out.println("Это неизвестный объект");
        }
    }

    public static void main(String[] args) {
        identify(new Cat());
        identify(new Dog());
        identify(new TV());
        identify("строка");
    }
}

class Cat {}
class Dog {}
class TV {}