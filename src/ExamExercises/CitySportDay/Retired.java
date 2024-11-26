package ExamExercises.CitySportDay;

public class Retired extends Competitor{
    public Retired(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Retired{" +
                "id=" + id +
                '}';
    }
}
