/**
 * Created by djp4830 on 5/9/17.
 */
public class ClassA {
    public static void main(String[] args) {
        //part a
        ClassB a = new ClassB();
        a.identifyClass();

        //part b
        class partB extends ClassB{

        }
        partB b = new partB();
        b.identifyClass();

    }

}