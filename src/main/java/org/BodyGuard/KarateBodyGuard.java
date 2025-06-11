package org.BodyGuard;

public class KarateBodyGuard extends BodyGuard{
    @Override
    void applyMartialArts(Attacker attacker) {
        System.out.println("Отпинал ногами " + attacker.name );
    }
}
