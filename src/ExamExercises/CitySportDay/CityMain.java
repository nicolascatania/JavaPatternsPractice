package ExamExercises.CitySportDay;

public class CityMain {
    public static void main(String[] args) {
        Retired retired = new Retired(44699001);
        Retired retired2 = new Retired(44699002);
        Retired retired3 = new Retired(44699003);
        Retired retired4 = new Retired(44699004);

        Professional p1 = new Professional(33777001);

        Sprint100 s100 = new Sprint100();
        s100.addCompetitor(retired);
        s100.addCompetitor(retired2);
        s100.addCompetitor(retired3);
        s100.addCompetitor(retired4);
        // s100.addCompetitor(p1); it wont work so the system works!

        s100.ShowCompetitorInfo();


    }
}
