package iteratorPractice.filter;

import java.util.ArrayList;

public class filterMain {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(3);

        NumberList numberList = new NumberList(numbers, 5);

        for (int num : numberList) {
            System.out.println(num);
        }
    }
}
