/**
 * Created by djp4830 on 5/9/17.
 */
public class ClassB {

    public static int identifyClass(int a, int b){


        if (a == 0){
            ArithmeticException e = new ArithmeticException(); //throwing an exception without try/catch.
            throw e;
        }
        else return a+b;
    }
}
