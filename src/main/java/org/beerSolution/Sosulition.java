package org.beerSolution;

public class Sosulition {

        public static void main(String[] args) {
            Singer parrotSinger = new Parrot();
            Talker parrotTalker = new Parrot();

            parrotSinger.sing();
            parrotTalker.speak();
        }
    }

    interface Singer {
        void sing(); // поёт
    }

    interface Talker {
        void speak(); // говорит
    }

    class Parrot implements Singer, Talker {
        @Override
        public void speak() {
            System.out.println("Попугай говорит: Привет!");
        }

        @Override
        public void sing() {
            System.out.println("Попугай поёт");
        }
    }
