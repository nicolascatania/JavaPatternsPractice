package iteratorPractice.filter;

import java.util.ArrayList;
import java.util.Iterator;

public class filterNumbers implements Iterator<Integer> {

    private ArrayList<Integer> numbers;
    private int index = 0;
    private int threshold;

    public filterNumbers(ArrayList<Integer> numbers, int threshold) {
        this.numbers = numbers;
        this.threshold = threshold;
    }

    @Override
    public boolean hasNext() {
        while (index < numbers.size()) {
            if (numbers.get(index) >= threshold) {
                return true;
            } else {
                index++;
            }
        }
        return false;
    }

    @Override
    public Integer next() {
        return numbers.get(index++);
    }
}
