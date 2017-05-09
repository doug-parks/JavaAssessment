/**
 * Created by djp4830 on 5/9/17.
 */
public class Main {

    public static void main(String[] args) {


        int[][] doubleArray = {{50, 60, 55, 666, 70}, {62, 65, 70, 70, 81}};

        returnLargest(doubleArray);
    }

    public static int returnLargest(int[][] doubleArray) {
        int largest = 0;

        for (int row = 0; row < doubleArray.length; row++) {
            for (int col = 0; col < doubleArray[row].length; col++) {
                if (doubleArray[row][col] > largest) {
                    largest = doubleArray[row][col];
                }
            }
        }
        return largest;
    }
}

