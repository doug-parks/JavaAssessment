/**
 * Created by djp4830 on 5/9/17.
 */
public class Main {

    public static void main(String[] args) {

    int a = 13, b = 3;

       division(a, b);

    }

    public static double division(int a, int b){
        double result = 0;

        try {
            result = a/b;


        } catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }
        return result;

    }


}
