package compositePractice.compositeSoldiers.strategy;

import compositePractice.compositeSoldiers.Soldier;
import compositePractice.compositeSoldiers.soldiers.AbstractSoldier;
import compositePractice.compositeSoldiers.soldiers.Company;
import compositePractice.compositeSoldiers.soldiers.Sniper;

import java.util.LinkedList;

public class SniperAttackStrategy implements  AttackStrategy{



    @Override
    public void attack(AbstractSoldier attacker, Soldier objective) {
        Sniper sniper = (Sniper) attacker;
        double hitRatio = sniper.getHitRatio();

        AbstractSoldier target = null;

        if(objective instanceof Company enemyCompany){
            LinkedList<Soldier> enemySoldiers = enemyCompany.getSoldiers();

            if (enemySoldiers.isEmpty()) {
                return;
            }

            target = getSoldierWithMostLife(enemySoldiers);
        }
        else{
            target = (AbstractSoldier) objective;
        }

        if(target != null && Math.random() > hitRatio){
            System.out.println(attacker.getName() + " shot " + target.getName());
            target.receiveDamage(attacker.getDamagePoints());
        }
        else {
            System.out.println(attacker.getName() + "missed the shot");
        }
    }

    private AbstractSoldier getSoldierWithMostLife(LinkedList<Soldier> soldiers) {
        AbstractSoldier strongest = null;

        for (Soldier soldier : soldiers) {
            if (soldier instanceof Company company) {
                AbstractSoldier candidate = getSoldierWithMostLife(company.getSoldiers());
                if (candidate != null && (strongest == null || candidate.getLifePoints() > strongest.getLifePoints())) {
                    strongest = candidate;
                }
            } else {
                AbstractSoldier candidate = (AbstractSoldier) soldier;
                if (strongest == null || candidate.getLifePoints() > strongest.getLifePoints()) {
                    strongest = candidate;
                }
            }
        }

        return strongest;
    }

}
