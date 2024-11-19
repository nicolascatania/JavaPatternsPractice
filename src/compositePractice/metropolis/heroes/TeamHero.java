package compositePractice.metropolis.heroes;

import compositePractice.metropolis.villains.IVillain;

import java.util.ArrayList;

public class TeamHero implements IHero{

    private String teamName;
    private ArrayList<IHero> heroes;

    public TeamHero(String teamName, ArrayList<IHero> heroes) {
        this.teamName = teamName;
        this.heroes = heroes;
    }


    @Override
    public void fightAgainst(IVillain objective) {
        for(IHero hero : heroes) {
            hero.fightAgainst(objective.getSingleVillain());
        }
    }

    @Override
    public void receiveDamage(int damage) {
        for(IHero hero : heroes) {
            hero.receiveDamage(damage);
        }
    }

    public boolean isDefeated(){
        return heroes.isEmpty();
    }

    public void removeDefeated(){
        heroes.removeIf(IHero::isDefeated);
    }

    public IHero getSingleHero(){
        if(heroes.isEmpty()) return null;

        return heroes.getFirst();
    }

    public String getName(){
        return teamName;
    }
}
