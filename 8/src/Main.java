/**
 * Created by djp4830 on 5/9/17.
 */
public class Main {

    public static void main(String[] args) {

        returnWithoutVowels("Hello my name is Doug Parks");
    }

    public static String returnWithoutVowels(String string) {
        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            if ((string.substring(i, i + 1).equals("a")) ||
                    (string.substring(i, i + 1).equals("e")) ||
                    (string.substring(i, i + 1).equals("i")) ||
                    (string.substring(i, i + 1).equals("o")) ||
                    (string.substring(i, i + 1).equals("u"))) {
                newString = newString + "*";
                i++;
            }
            newString = newString + string.substring(i, i + 1);
        }
        return string;
    }
}