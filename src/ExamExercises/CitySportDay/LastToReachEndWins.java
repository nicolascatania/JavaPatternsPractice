package ExamExercises.CitySportDay;

import java.util.ArrayList;

public class LastToReachEndWins extends Competition{
    private ArrayList<Professional> competitors;

    public LastToReachEndWins(){
        this.competitors = new ArrayList<>();
        this.numberOfParticipants = 0;
    }

    public int addCompetitor(Professional p){
        this.competitors.add(p);
        numberOfParticipants++;
        return numberOfParticipants;
    }

    public ArrayList<Professional> getCompetitors(){
        return competitors;
    }

    @Override
    public void ShowCompetitorInfo() {
        System.out.println("Competitors: " + this.getClass().getSimpleName());
        for(Professional p : competitors){
            System.out.println(p.toString());
        }
    }
}
