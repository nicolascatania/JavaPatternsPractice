package iteratorPractice.matrixIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixSpiralPattern<T> implements Iterator<T> {

    private final Matrix<T> matrix;
    private final int rows, cols;
    private int top, bottom, left, right;
    private int direction;
    private int currentRow, currentCol;
    private int elementsLeft;

    public MatrixSpiralPattern(Matrix<T> matrix) {
        this.matrix = matrix;
        this.rows = matrix.getRowCount();
        this.cols = matrix.getColCount();

        this.top = 0;
        this.bottom = rows - 1;
        this.left = 0;
        this.right = cols - 1;

        // Initial direction and position
        this.direction = 0; // 0 = left-to-right, 1 = top-to-bottom, 2 = right-to-left, 3 = bottom-to-top
        this.currentRow = 0;
        this.currentCol = 0;

        this.elementsLeft = rows * cols;
    }

    @Override
    public boolean hasNext() {
        return elementsLeft > 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the matrix.");
        }

        T value = matrix.getElement(currentRow, currentCol);

        switch (direction) {
            case 0:
                if (currentCol < right) {
                    currentCol++;
                } else {
                    direction = 1;
                    top++;
                    currentRow++;
                }
                break;

            case 1:
                if (currentRow < bottom) {
                    currentRow++;
                } else {
                    direction = 2;
                    right--;
                    currentCol--;
                }
                break;

            case 2:
                if (currentCol > left) {
                    currentCol--;
                } else {
                    direction = 3;
                    bottom--;
                    currentRow--;
                }
                break;

            case 3:
                if (currentRow > top) {
                    currentRow--;
                } else {
                    direction = 0;
                    left++;
                    currentCol++;
                }
                break;
        }

        elementsLeft--;
        return value;
    }
}
