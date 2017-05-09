/**
 * Created by djp4830 on 5/9/17.
 */
public class Main {
    public static void main(String[] args) {
        double score = 87.5;

        System.out.println("Your score of " + score + " has earned you a " + returnTestGrade(score));


    }

    public static String returnTestGrade(double score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        return "F";
    }
}