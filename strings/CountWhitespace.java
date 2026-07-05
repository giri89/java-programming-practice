package strings;

public class CountWhitespace {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        System.out.println(countSpaces(str));
    }

    static int countSpaces(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }
}