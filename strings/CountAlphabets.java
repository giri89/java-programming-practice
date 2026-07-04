package strings;

public class CountAlphabets {
    public static void main(String[] args) {

        String str = "Java123@Programming";

        System.out.println(countLetters(str));
    }

    static int countLetters(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}