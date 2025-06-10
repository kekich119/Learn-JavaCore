package org.interfaceSolution;

public class Car implements Moveable {

    public void move(String destination) {
        System.out.println("Машина едет в город: "+ destination);
    }
}
