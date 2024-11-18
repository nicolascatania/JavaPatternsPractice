package compositePractice.compositeSoldiers.soldiers;

import compositePractice.compositeSoldiers.strategy.AttackStrategy;
import compositePractice.compositeSoldiers.strategy.SniperAttackStrategy;

public class Sniper extends AbstractSoldier{

    private static final int MAX_LIFE = 100;
    private static final AttackStrategy attackStrategy = new SniperAttackStrategy();
    private static final int DAMAGE = 200;
    private static final double hitRatio = 0.58;

    public Sniper(String name, String rank, Nationality nationality) {
        super(name, rank, MAX_LIFE, DAMAGE, attackStrategy, nationality);
    }

    public double getHitRatio() {
        return hitRatio;
    }
}
