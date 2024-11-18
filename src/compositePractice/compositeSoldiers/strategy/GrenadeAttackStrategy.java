package compositePractice.compositeSoldiers.strategy;

import compositePractice.compositeSoldiers.Soldier;
import compositePractice.compositeSoldiers.soldiers.AbstractSoldier;
import compositePractice.compositeSoldiers.soldiers.Company;

public class GrenadeAttackStrategy implements AttackStrategy{
    @Override
    public void attack(AbstractSoldier attacker, Soldier objective) {
        if (!objective.isDead()) {
            System.out.println(attacker.getName() + " threw a grenade to " + objective.getName());
            objective.receiveDamage(attacker.getDamagePoints());
        }

        //once the attack is done, we tell the enemy company to remove its dead soldiers
        if(objective instanceof Company enemyCompany){
            enemyCompany.removeDeadSoldiers();
        }

    }
}
