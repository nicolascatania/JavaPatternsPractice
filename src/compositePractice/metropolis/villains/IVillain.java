package compositePractice.metropolis.villains;

import compositePractice.metropolis.heroes.IHero;

public interface IVillain {
     void fightAgainst(IHero objective);
     void receiveDamage(int damage);
     boolean isDefeated();
     IVillain getSingleVillain();
     String getName();
}
