package org.BodyGuard;

public class Attacker {
    String name;
    boolean hasGun;

    public Attacker(String name, boolean hasGun){
        this.name = name;
        this.hasGun = hasGun;
    }

    public boolean hasGun(){
        return hasGun;
    }

    public String getName(){
        return name;
    }
}
