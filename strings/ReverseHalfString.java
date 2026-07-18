package strings;

public class ReverseHalfString {
    public static void main(String[] args) {

        String str = "PROGRAMMING";

        for (int i = str.length() / 2 - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        for (int i = str.length() / 2; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}