package ExamExercises.CitySportDay;

public abstract class Competition {
    protected int numberOfParticipants;

    public int getNumberOfParticipants(){
        return numberOfParticipants;
    }

    public abstract void ShowCompetitorInfo();

}
