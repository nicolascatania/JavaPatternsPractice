package compositePractice.compositeSoldiers.strategy;

import compositePractice.compositeSoldiers.Soldier;
import compositePractice.compositeSoldiers.soldiers.AbstractSoldier;
import compositePractice.compositeSoldiers.soldiers.Company;

import java.util.LinkedList;

public class NormalAttackStrategy implements AttackStrategy {

    @Override
    public void attack(AbstractSoldier attacker, Soldier objective) {
        if (objective instanceof Company enemyCompany) {
            LinkedList<Soldier> enemySoldiers = enemyCompany.getSoldiers();

            if (enemySoldiers.isEmpty()) {
                return;
            }

            Soldier target = getFirstNonCompanySoldier(enemySoldiers);

            if (target != null) {
                System.out.println(attacker.getName() + " attacks " + target.getName());
                target.receiveDamage(attacker.getDamagePoints());

                if (target.isDead()) {
                    enemyCompany.removeDeadSoldiers();
                }
            }
        }
    }

    private Soldier getFirstNonCompanySoldier(LinkedList<Soldier> soldiers) {
        for (Soldier soldier : soldiers) {
            if (!(soldier instanceof Company company)) {
                return soldier;
            }
            Soldier result = getFirstNonCompanySoldier(company.getSoldiers());
            if (result != null) {
                return result;
            }
        }
        return null;
    }

}

