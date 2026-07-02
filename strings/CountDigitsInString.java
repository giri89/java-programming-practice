package strings;

public class CountDigitsInString {
    public static void main(String[] args) {

        String str = "Java123Programming45";

        System.out.println(countDigits(str));
    }

    static int countDigits(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}