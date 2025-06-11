package org.BodyGuard;

public class BoxingBodyGuard extends BodyGuard{
    @Override
    void applyMartialArts(Attacker attacker) {
        System.out.println("Забил руками " + attacker.name);
    }
}
