package org.beerSolution;

public class Sosution {


    public static void main(String[] args) {
        Sound cat = new Cat();
        cat.makeSound();
    }
}

interface Sound {
    void makeSound();
}

class Cat implements Sound {
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
