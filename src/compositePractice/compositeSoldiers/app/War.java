package compositePractice.compositeSoldiers.app;

import compositePractice.compositeSoldiers.factory.*;
import compositePractice.compositeSoldiers.soldiers.Company;

public class War {
    //Todo: medic healing system
    //Todo: make a range system with enums, a higher sniper rank makes it more accurate, a higher granadier rank makes more damage idk
    //Todo: logger or observer pattern to load different messages and manage them in a centralized way instead of making it on console.
    public static void main(String[] args) {
        AbstractSoldierFactory usaFactory = new USASoliderFactory();
        AbstractSoldierFactory ukFactory = new UKSoldierFactory();
        AbstractSoldierFactory germanyFactory = new GermanySoldierFactory();
        AbstractSoldierFactory mercenaryFactory = new MercenarySoldierFactory();

        Company alliedCompany = new Company("Allied Company");
        Company axisCompany = new Company("Axis Company");
        Company mercenaryArmy = new Company("Mercenary Army");

        alliedCompany.addSoldier(usaFactory.createInfantry("Allied Soldier 1", "Sergeant"));
        alliedCompany.addSoldier(usaFactory.createMedic("Allied Medic", "Lieutenant"));
        alliedCompany.addSoldier(usaFactory.createGrenadier("Allied Grenadier 1", "Corporal"));
        alliedCompany.addSoldier(usaFactory.createInfantry("Allied Soldier 3", "Corporal"));
        alliedCompany.addSoldier(usaFactory.createSniper("Allied Sniper", "Sergeant"));
        alliedCompany.addSoldier(ukFactory.createInfantry("Allied Soldier 4", "Corporal"));
        alliedCompany.addSoldier(ukFactory.createSniper("Allied Sniper 2", "Sergeant"));


        axisCompany.addSoldier(germanyFactory.createInfantry("Axis Soldier 1", "Sergeant"));
        axisCompany.addSoldier(germanyFactory.createMedic("Axis Medic", "Corporal"));
        axisCompany.addSoldier(germanyFactory.createInfantry("Axis Soldier 2", "Corporal"));
        axisCompany.addSoldier(germanyFactory.createInfantry("Axis Soldier 3", "Corporal"));

        mercenaryArmy.addSoldier(mercenaryFactory.createGrenadier("Mercenary Grenadier 1", "Corporal"));
        mercenaryArmy.addSoldier(mercenaryFactory.createInfantry("Mercenary Soldier 1", "Sergeant"));
        mercenaryArmy.addSoldier(mercenaryFactory.createMedic("Mercenary Medic", "Lieutenant"));

        axisCompany.addSubCompany(mercenaryArmy);

        while (!alliedCompany.isDead() && !axisCompany.isDead()) {
            if (!alliedCompany.isDead()) {
                System.out.println("-----Allied attack-----");
                System.out.println(alliedCompany.getInfo());
                alliedCompany.attack(axisCompany);
            }

            if (!axisCompany.isDead()) {
                System.out.println("-----Axis attack-----");
                System.out.println(axisCompany.getInfo());
                axisCompany.attack(alliedCompany);
            }
        }

        if (!alliedCompany.isDead()) {
            System.out.println("-----" + alliedCompany.getName() + " won the battle-----");
        } else {
            System.out.println("-----" + axisCompany.getName() + " won the battle-----");
        }
    }
}
