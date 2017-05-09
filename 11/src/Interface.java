/**
 * Created by djp4830 on 5/9/17.
 */
public interface Interface {

    //abstract method and default method

    void method1(); //abstract by default

    default void method2() {
        isEven(11);

    }

    static boolean isEven(int number) {
        if (number != 0) {
            return true;
        } else return false;


        //default method

        //static method

    }
}
