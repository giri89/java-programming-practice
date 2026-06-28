package strings;

public class CountSpecialCharacter {
    public static void main(String[] args) {

        String str = "Java@123#$";

        System.out.println(countSpecial(str));
    }

    static int countSpecial(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }

        return count;
    }
}