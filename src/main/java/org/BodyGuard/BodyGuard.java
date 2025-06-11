package org.BodyGuard;

abstract class BodyGuard {
    abstract void applyMartialArts(Attacker attacker);


    public void shoot(Attacker attacker){
        System.out.println("Выстрел в " + attacker.name);
    }

    public void saveClientLife(Attacker attacker){
        if (attacker.hasGun()){
            shoot(attacker);
        }else {
            applyMartialArts(attacker);
        }
    }


    public static void main(String[] args) {
        Attacker attackerWithGun = new Attacker("Гангстер", true);
        Attacker attackerWithoutGun = new Attacker("Хулиган", false);

        BodyGuard karate = new KarateBodyGuard();
        BodyGuard boxer = new BoxingBodyGuard();

        karate.saveClientLife(attackerWithGun);
        karate.saveClientLife(attackerWithoutGun);

        boxer.saveClientLife(attackerWithGun);
        boxer.saveClientLife(attackerWithoutGun);
    }

}
