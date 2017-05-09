import java.util.Random;

/**
 * Created by djp4830 on 5/9/17.
 */
public class Main {

    public static void main(String[] args) {

        returnRandom();

    }

    public static int returnRandom(){
        Random random = new Random();

        return random.nextInt(100);
    }
}
