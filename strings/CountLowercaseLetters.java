package strings;

public class CountLowercaseLetters {
    public static void main(String[] args) {

        String str = "JaVaProgramming";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }

        System.out.println(count);
    }
}