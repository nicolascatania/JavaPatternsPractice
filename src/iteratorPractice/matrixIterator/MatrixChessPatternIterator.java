package iteratorPractice.matrixIterator;

import java.util.Iterator;

public class MatrixChessPatternIterator<T> implements Iterator<T> {

    private Matrix<T> matrix;
    private int i = 0, j = 0;

    public MatrixChessPatternIterator(Matrix<T> matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return i < matrix.getRowCount() && j < matrix.getColCount();
    }

    @Override
    public T next() {
        T element = matrix.getElement(i, j);
        j+=2;
        if (j >= matrix.getColCount()) {
            i++;
            if(i%2==0){
                j = 0;
            }
            else{
                j = 1;
            }
        }
        return element;
    }
}
