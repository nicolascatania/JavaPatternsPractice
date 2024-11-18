package compositePractice.compositeSoldiers.strategy;

import compositePractice.compositeSoldiers.Soldier;
import compositePractice.compositeSoldiers.soldiers.AbstractSoldier;

public interface AttackStrategy {
    void attack(AbstractSoldier attacker, Soldier objective);
}
