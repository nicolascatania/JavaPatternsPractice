package ExamExercises.CitySportDay;

import java.util.HashMap;

public abstract class Competitor {
    protected HashMap<Competition, Integer> numberPerCompetence;
    protected int id;

    public int getNumberFromCompetition(Competition competition) {
        return numberPerCompetence.get(competition);
    }

    public void inscribeToCompetition(Competition competition) {
        //Todo: invoque the competition and to logic there
        numberPerCompetence.put(competition, numberPerCompetence.get(competition) + 1);
    }

}
