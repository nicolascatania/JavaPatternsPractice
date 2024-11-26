package ExamExercises;

import java.util.ArrayList;

public class SumPositiveNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(0);
        numbers.add(-10);
        numbers.add(6);

        System.out.println(solution(numbers));
    }


    static double solution(ArrayList<Integer> numbers){
        int positives = 0;
        int sum = 0;

        if(numbers.isEmpty()){
            return 0;
        }

        for(Integer num : numbers){
            if(num>0){
                positives++;
                sum += num;
            }
        }

        if(positives == 0){
            return 0;
        }

        return (double) sum /positives;
    }

}

