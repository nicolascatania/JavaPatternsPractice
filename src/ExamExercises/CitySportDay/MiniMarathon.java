package ExamExercises.CitySportDay;

import java.util.ArrayList;

public class MiniMarathon extends Competition{
    private ArrayList<Competitor> competitors;

    public MiniMarathon() {
        this.competitors = new ArrayList<>();
        this.numberOfParticipants = 0;
    }

    public int addCompetitor(Competitor c){
        this.competitors.add(c);
        numberOfParticipants++;
        return numberOfParticipants;
    }

    public ArrayList<Competitor> getCompetitors(){
        return competitors;
    }

    @Override
    public void ShowCompetitorInfo() {
        System.out.println("Competitors: " + this.getClass().getSimpleName());
        for(Competitor c : competitors){
            System.out.println(c.toString());
        }
    }
}
