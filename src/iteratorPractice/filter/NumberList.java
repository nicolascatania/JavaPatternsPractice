package iteratorPractice.filter;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList implements Iterable<Integer> {

    private ArrayList<Integer> list;
    private int threshold;

    public NumberList(ArrayList<Integer> list, int threshold) {
        this.list = list;
        this.threshold = threshold;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new filterNumbers(list, threshold);
    }
}
