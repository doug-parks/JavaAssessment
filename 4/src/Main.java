/**
 * Created by djp4830 on 5/9/17.
 */
public class Main {
    public static void main(String[] args) {

        int[] newArray = {1,2,3,4,5,6,7,8,9};

        returnLargest(newArray);

    }
    public static int returnLargest(int[] newArray){
        int largest = 0;

        for (int i = 0; i < newArray.length; i++){
            if (newArray[i] > largest){
                largest = newArray[i];
            }
        }
        return largest;
    }
}
