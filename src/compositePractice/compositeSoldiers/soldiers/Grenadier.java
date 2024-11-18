package compositePractice.compositeSoldiers.soldiers;

import compositePractice.compositeSoldiers.strategy.AttackStrategy;
import compositePractice.compositeSoldiers.strategy.GrenadeAttackStrategy;

public class Grenadier extends AbstractSoldier {
    private static final int MAX_LIFE = 100;
    private static final AttackStrategy attackStrategy = new GrenadeAttackStrategy();
    private static final int DAMAGE = 45;
    public Grenadier(String name, String rank, Nationality nationality) {
        super(name, rank, MAX_LIFE, DAMAGE, attackStrategy, nationality);
    }

}
