package compositePractice.metropolis.villains;

import compositePractice.metropolis.heroes.IHero;

import java.util.ArrayList;

public class TeamVillain implements  IVillain{

    private String teamName;
    private ArrayList<IVillain> villains;

    public TeamVillain(String teamName, ArrayList<IVillain> villains) {
        this.teamName = teamName;
        this.villains = villains;
    }


    @Override
    public void fightAgainst(IHero objective) {
        for(IVillain iVillain : villains) {
            iVillain.fightAgainst(objective.getSingleHero());
        }
    }

    @Override
    public void receiveDamage(int damage) {
        for(IVillain iVillain : villains) {
            iVillain.receiveDamage(damage);
        }
    }

    @Override
    public boolean isDefeated() {
        return villains.isEmpty();
    }

    public void removeDefeated(){
        villains.removeIf(IVillain::isDefeated);
    }

    public IVillain getSingleVillain(){
        if(villains.isEmpty()) return null;

        return villains.getFirst();
    }

    public String getName(){
        return teamName;
    }
}
