package strings;

public class ReverseAlternateCharacters {
    public static void main(String[] args) {

        String str = "PROGRAM";

        for (int i = str.length() - 1; i >= 0; i -= 2) {
            System.out.print(str.charAt(i));
        }
    }
}