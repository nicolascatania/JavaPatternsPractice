package ExamExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class findMaxTemp {

    public static double findmaxtemp2(List<TempRegistry> temps, int m, int y){
        double max = Double.NEGATIVE_INFINITY;

        for(TempRegistry temp : temps){
            if (temp.getTemp() > max && temp.getMonth() == m && temp.getYear() == y){
                max = temp.getTemp();
            }
        }

        if(max == Double.NEGATIVE_INFINITY){
            throw new RuntimeException("Temp not found for this month and year");
        }

        return max;

    }

    public static double findMaxTempe(List<TempRegistry> temps, int m, int y) {
        //elegant but not efficient, could be done in just one loop.
        List<TempRegistry> filtered = new ArrayList<TempRegistry>();
        for (TempRegistry temp : temps) {
            if (temp.getYear() == y && temp.getMonth() == m) {
                filtered.add(temp);
            }
        }

        if(filtered.isEmpty()){
            throw new RuntimeException("No temps found");
        }


        Collections.sort(filtered);

        return filtered.getLast().getTemp();
    }

    public static void main(String[] args) {
        List<TempRegistry> temps = new ArrayList<>();
        temps.add(new TempRegistry(2024, 1, 30));
        temps.add(new TempRegistry(2024, 1, 28));
        temps.add(new TempRegistry(2024, 1, 34));
        temps.add(new TempRegistry(2024, 2, 30));
        temps.add(new TempRegistry(2024, 1, 30));
        temps.add(new TempRegistry(2024, 3, 10));
        temps.add(new TempRegistry(2024, 1, 30));
        temps.add(new TempRegistry(2024, 5, 25));

        System.out.println(findmaxtemp2(temps, 1, 2024));

    }
}
