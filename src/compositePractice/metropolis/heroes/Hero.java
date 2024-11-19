package compositePractice.metropolis.heroes;

import compositePractice.metropolis.villains.IVillain;

public class Hero implements IHero{

    private final int hitPoints = 120;
    private int healthPoints = 120;
    private final String name;

    public Hero(String name){
        this.name = name;
    }

    @Override
    public void fightAgainst(IVillain objective) {
        System.out.println(name + " fight against " + objective.getName());
        objective.receiveDamage(hitPoints);
    }

    @Override
    public void receiveDamage(int damage) {
        this.healthPoints-=damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public boolean isDefeated(){
        return healthPoints <= 0;
    }

    public IHero getSingleHero(){
        return this;
    }

    public String getName(){
        return name;
    }
}
