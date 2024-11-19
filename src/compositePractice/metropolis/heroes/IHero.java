package compositePractice.metropolis.heroes;

import compositePractice.metropolis.villains.IVillain;

public interface IHero {
    void fightAgainst(IVillain objective);
    void receiveDamage(int damage);
    boolean isDefeated();
    IHero getSingleHero();
    String getName();
}
