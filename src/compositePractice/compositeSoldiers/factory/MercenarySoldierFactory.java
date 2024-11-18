package compositePractice.compositeSoldiers.factory;

import compositePractice.compositeSoldiers.soldiers.*;

public class MercenarySoldierFactory implements  AbstractSoldierFactory{
    @Override
    public Infantry createInfantry(String name, String rank) {
        return new Infantry(name, rank, Nationality.MERCENARY);
    }

    @Override
    public Medic createMedic(String name, String rank) {
        return new Medic(name, rank, Nationality.MERCENARY);
    }

    @Override
    public Grenadier createGrenadier(String name, String rank) {
        return new Grenadier(name, rank, Nationality.MERCENARY);
    }

    @Override
    public Sniper createSniper(String name, String rank) {
        return new Sniper(name, rank, Nationality.MERCENARY);
    }
}
