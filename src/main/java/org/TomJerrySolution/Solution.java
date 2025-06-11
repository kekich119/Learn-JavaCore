package org.TomJerrySolution;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CheckedInputStream;

public class Solution {
    public static void main(String[] args) {
        Tom tom = new Tom();
        Jerry jerry = new Jerry();
        Spike spike = new Spike();

        tom.move();
        tom.beEaten();
        tom.eat(jerry);

        jerry.beEaten();
        jerry.move();

        spike.eat(tom);
        spike.move();



    }


    interface Moveable {
        void move();
    }


    interface Eatable {
        void beEaten();
    }

    interface Eat {
        void eat(Eatable target);
    }

    static class Cat {
        // базовый класс для котов
    }

    static class Mouse {
        // базовый класс для мышей
    }

    static class Dog {
        // базовый класс для собак
    }

    static class Tom extends Cat implements Moveable, Eat, Eatable {
        public void move(){
            System.out.println("Tom is moving");
        }
        public void eat(Eatable target){
            System.out.println("Tom eats Jerry");
        }
        public void beEaten(){
            System.out.println("Spike eats Tom");
        }
    }

    static class Jerry extends Mouse implements Moveable, Eatable {
        public void move(){
            System.out.println("Jerry is moving");
        }
        public void beEaten(){
            System.out.println("Jerry съели");
        }
    }

    static class Spike extends Dog implements Moveable, Eat {
        public void move(){
            System.out.println("Spike is moving");
        }
        public void eat(Eatable target){
            System.out.println("Spike eats Jerry or Tom");
        }
    }
}