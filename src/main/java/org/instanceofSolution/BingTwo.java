package org.instanceofSolution;

public class BingTwo {
    public static void main(String[] args) {
        Cat cat = new Tomcat(); // исправь строку

        if (cat instanceof Tomcat && cat instanceof CanMove) {
            System.out.println("Bingo!");
        }
    }

    public static interface CanMove {}

    public static class Cat {}

    public static class Tomcat extends Cat  implements CanMove{ // добавь реализацию интерфейса
    }
}