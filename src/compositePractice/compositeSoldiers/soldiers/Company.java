package compositePractice.compositeSoldiers.soldiers;

import compositePractice.compositeSoldiers.Soldier;

import java.util.LinkedList;

public class Company implements Soldier {

    private LinkedList<Soldier> soldiers = new LinkedList<>();
    private final String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addSubCompany(Company company){
        this.soldiers.addLast(company);
    }

    @Override
    public void attack(Soldier objective) {
        if(objective.isDead()){
            System.out.println("Can not attack a null objective.");
            return;
        }
        for(Soldier soldier : soldiers) {
            soldier.attack(objective);
        }

    }


    @Override
    public void receiveDamage(int damage) {
        //this one is for grenadier attacks, where it deals damage to all the company
        for (Soldier soldier : soldiers) {
            soldier.receiveDamage(damage);
        }

        //after receiving the damage is important to remove the dead soldiers
        removeDeadSoldiers();
    }

    public void removeDeadSoldiers() {
        soldiers.removeIf(soldier -> {
            if (soldier instanceof Company subCompany) {
                subCompany.removeDeadSoldiers();
                return subCompany.getSoldiers().isEmpty();
            }
            return soldier.isDead();
        });
    }



    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder("Company: " + this.companyName + "\n" + "[\n");

        for (Soldier soldier : soldiers) {
            info.append(soldier.getInfo()).append("\n");
        }
        info.append("]");
        return info.toString();
    }

    @Override
    public String getName() {
        return this.companyName;
    }

    @Override
    public boolean isDead() {
        return this.soldiers.isEmpty();
    }

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
    }

    public void removeSoldier(Soldier soldier) {
        this.soldiers.remove(soldier);
    }

    public LinkedList<Soldier> getSoldiers() {
        return this.soldiers;
    }
}
