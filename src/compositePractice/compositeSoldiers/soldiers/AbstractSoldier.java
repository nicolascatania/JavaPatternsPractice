package compositePractice.compositeSoldiers.soldiers;

import compositePractice.compositeSoldiers.Soldier;
import compositePractice.compositeSoldiers.strategy.AttackStrategy;

public abstract class AbstractSoldier implements Soldier {
    protected final String name;
    protected final String rank;
    protected final int damagePoints;
    protected int lifePoints;
    protected AttackStrategy attackStrategy;
    protected final int maxLife;
    protected final Nationality nationality;
    public AbstractSoldier(String name, String rank, int lifePoints, int damagePoints, AttackStrategy attackStrategy, Nationality nationality) {
        this.name = name;
        this.rank = rank;
        this.damagePoints = damagePoints;
        this.lifePoints = lifePoints;
        this.maxLife = lifePoints;
        this.attackStrategy = attackStrategy;
        this.nationality = nationality;

    }

    public int getMaxLife(){
        return this.maxLife;
    }

    public void attack(Soldier objective){
        attackStrategy.attack(this, objective);
    }
    public void receiveDamage(int damage){
        this.lifePoints -= damage;
        if(this.lifePoints <= 0){
            System.out.println(this.name + " was KIA.");
        }
    }

    public String getInfo(){
        return this.toString();
    }

    public String getName(){
        return this.name;
    }

    public boolean isDead(){
        return this.lifePoints<=0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{"+
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", damagePoints=" + damagePoints +
                ", lifePoints=" + lifePoints +
                ", nationality=" + nationality +
                '}';
    }


    public int getDamagePoints(){
        return this.damagePoints;
    }

    public int getLifePoints(){
        return this.lifePoints;
    }
}
