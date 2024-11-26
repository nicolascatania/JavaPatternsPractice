package ExamExercises.CitySportDay;

public class Professional extends Competitor {
    public Professional(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Professional{" +
                "id=" + id +
                '}';
    }
}
