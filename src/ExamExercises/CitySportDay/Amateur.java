package ExamExercises.CitySportDay;

public class Amateur extends Competitor{

    public Amateur(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Amateur{" +
                "id=" + id +
                '}';
    }
}
