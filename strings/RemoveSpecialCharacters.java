package strings;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {

        String str = "Java@123#$Programming";

        System.out.println(removeSpecial(str));
    }

    static String removeSpecial(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }
        }

        return result;
    }
}