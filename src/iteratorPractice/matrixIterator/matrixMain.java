package iteratorPractice.matrixIterator;

import java.util.Iterator;

public class matrixMain {
    public static void main(String[] args) {
        Integer[][] numbers = new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};
        Matrix<Integer> matrix = new Matrix<>(numbers);
        Iterator<Integer> iterator = matrix.chessIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------------------------------------");
        for(Integer i : matrix){
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------------");
        Iterator<Integer> iterator2 = matrix.spiralIterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
