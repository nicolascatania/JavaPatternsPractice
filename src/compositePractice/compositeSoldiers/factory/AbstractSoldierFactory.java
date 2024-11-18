package compositePractice.compositeSoldiers.factory;

import compositePractice.compositeSoldiers.soldiers.Grenadier;
import compositePractice.compositeSoldiers.soldiers.Infantry;
import compositePractice.compositeSoldiers.soldiers.Medic;
import compositePractice.compositeSoldiers.soldiers.Sniper;

public interface AbstractSoldierFactory {
    Infantry createInfantry(String name, String rank);
    Medic createMedic(String name, String rank);
    Grenadier createGrenadier(String name, String rank);
    Sniper createSniper(String name, String rank);
}
