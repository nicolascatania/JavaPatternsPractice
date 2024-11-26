package ExamExercises;

public class TempRegistry implements Comparable<TempRegistry> {

    public int year;
    public int month;
    public double temp;

    public TempRegistry(int year,int month, double temp) {
        if (month < 1 || month > 12){
            throw new IllegalArgumentException("Invalid month");
        }
        this.year = year;
        this.month = month;
        this.temp = temp;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public double getTemp(){
        return temp;
    }

    @Override
    public int compareTo(TempRegistry o) {
        return Double.compare(this.temp, o.temp);
    }
}
