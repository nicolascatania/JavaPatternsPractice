package compositePractice.compositeSoldiers.soldiers;

import compositePractice.compositeSoldiers.strategy.AttackStrategy;
import compositePractice.compositeSoldiers.strategy.NormalAttackStrategy;

public class Medic extends AbstractSoldier {

    private static final int MAX_LIFE = 150;
    private static final AttackStrategy attackStrategy = new NormalAttackStrategy();
    private static final int DAMAGE = 60;
    private int medicKits = 3;
    private static final int healthToRecover = 70; //medic recovers 70 hp to each soldier

    public Medic(String name, String rank, Nationality nationality) {
        super(name, rank, MAX_LIFE, DAMAGE, attackStrategy, nationality);
    }

    public int getMedicKits() {
        return medicKits;
    }

    public int getHealthToRecover() {
        return healthToRecover;
    }

    public void useMedicKit(){
        medicKits--;
    }
}
