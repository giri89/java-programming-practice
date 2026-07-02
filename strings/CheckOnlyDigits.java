package strings;

public class CheckOnlyDigits {
    public static void main(String[] args) {

        String str = "123456";

        System.out.println(isDigits(str));
    }

    static boolean isDigits(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}