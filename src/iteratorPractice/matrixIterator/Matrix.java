package iteratorPractice.matrixIterator;

import java.util.Iterator;

public class Matrix<T> implements Iterable<T> {

    private final T[][] matrix;
    private int row, col;

    public Matrix(T[][] content) {
        this.matrix = content;
    }

    public T getElement(int row, int col) {
        if(row > matrix.length || col > matrix[0].length){
            throw new IndexOutOfBoundsException();
        }
        return matrix[row][col];
    }

    public void setElement(int row, int col, T element) {
        if(row > matrix.length || col > matrix[0].length){
            throw new IndexOutOfBoundsException();
        }
        matrix[row][col] = element;
    }

    public int getRowCount() {
        return matrix.length;
    }

    public int getColCount() {
        return matrix[0].length;
    }

    //default one
    @Override
    public Iterator<T> iterator() {
        return new MatrixChessPatternIterator<T>(this);
    }

    //Repeated code just to improve future code readability
    public Iterator<T> chessIterator(){
        return new MatrixChessPatternIterator<T>(this);
    }

    public Iterator<T> spiralIterator() {
        return new MatrixSpiralPattern<T>(this);
    }

    public T[][] getMatrix() {
        return matrix;
    }
}
