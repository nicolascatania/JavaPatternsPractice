package compositePractice.compositeSoldiers.soldiers;

import compositePractice.compositeSoldiers.strategy.AttackStrategy;
import compositePractice.compositeSoldiers.strategy.NormalAttackStrategy;

public class Infantry extends AbstractSoldier {

    private static final int MAX_LIFE = 200;
    private static final AttackStrategy attackStrategy = new NormalAttackStrategy();
    private static final int DAMAGE = 60;
    public Infantry(String name, String rank, Nationality nationality) {
        super(name, rank, MAX_LIFE, DAMAGE, attackStrategy, nationality);
    }

}
