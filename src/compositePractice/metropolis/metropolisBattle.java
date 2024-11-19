package compositePractice.metropolis;

import compositePractice.metropolis.heroes.Hero;
import compositePractice.metropolis.heroes.IHero;
import compositePractice.metropolis.heroes.TeamHero;
import compositePractice.metropolis.villains.IVillain;
import compositePractice.metropolis.villains.TeamVillain;
import compositePractice.metropolis.villains.Villain;

import java.util.ArrayList;
import java.util.Arrays;

public class metropolisBattle {
    public static void main(String[] args) {
        ArrayList<IHero> heroes = new ArrayList<>(Arrays.asList(
                new Hero("bob"),
                new Hero("Wade")
        ));
        TeamHero th = new TeamHero("Heroes team", heroes);

        ArrayList<IVillain> villains = new ArrayList<>(Arrays.asList(
                new Villain("Villain 1"),
                new Villain("Villain 2"),
                new Villain("Villain 3")
        ));
        TeamVillain tv = new TeamVillain("Villains team", villains);

        while (!th.isDefeated() && !tv.isDefeated()) {
            th.fightAgainst(tv);
            tv.removeDefeated();
            tv.fightAgainst(th);
            th.removeDefeated();
        }

        if (th.isDefeated()) {
            System.out.println("Villains won");
        } else {
            System.out.println("Heroes won");
        }
    }
}
