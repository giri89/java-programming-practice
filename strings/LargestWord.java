package strings;

public class LargestWord {
    public static void main(String[] args) {

        String str = "Java is a powerful programming language";

        System.out.println(largestWord(str));
    }

    static String largestWord(String str) {

        String[] words = str.split(" ");

        String largest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }

        return largest;
    }
}