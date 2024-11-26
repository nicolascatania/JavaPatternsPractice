package ExamExercises.CitySportDay;

import java.util.ArrayList;

public class Sprint100 extends Competition{
    private ArrayList<Retired> competitors;

    public Sprint100(){
        this.competitors = new ArrayList<>();
        this.numberOfParticipants = 0;
    }

    public int addCompetitor(Retired r){
        this.competitors.add(r);
        numberOfParticipants++;
        return numberOfParticipants;
    }

    public ArrayList<Retired> getCompetitors(){
        return competitors;
    }

    @Override
    public void ShowCompetitorInfo() {
        System.out.println("Competitors: " + this.getClass().getSimpleName());
        for(Retired r : competitors){
            System.out.println(r.toString());
        }
    }
}
