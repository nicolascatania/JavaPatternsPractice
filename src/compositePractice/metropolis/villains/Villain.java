package compositePractice.metropolis.villains;

import compositePractice.metropolis.heroes.IHero;

public class Villain implements IVillain {
    private final int hitPoints = 120;
    private int healthPoints = 120;
    private final String name;

    public Villain(String name){
        this.name = name;
    }

    @Override
    public void fightAgainst(IHero objective) {
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

    public IVillain getSingleVillain(){
        return this;
    }

    public String getName(){
        return name;
    }
}
