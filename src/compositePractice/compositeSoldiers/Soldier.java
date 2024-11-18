package compositePractice.compositeSoldiers;

public interface Soldier {

    void attack(Soldier objective);

    void receiveDamage(int damage);

    String getInfo();

    String getName();

    boolean isDead();

}
