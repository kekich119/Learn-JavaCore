package org.abstractSolutions;

public class Solution {
    public static void main(String[] args) {
        Pet cat = new Cat();
        System.out.println(cat.getName());
    }

    public static abstract class Pet {
        public abstract String getName();
    }

    public static class Cat extends Pet{
        @Override
        public String getName() {
            return "Я кот";
        }
    }
}
