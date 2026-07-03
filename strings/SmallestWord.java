package strings;

public class SmallestWord {
    public static void main(String[] args) {

        String str = "Java is a powerful programming language";

        System.out.println(smallestWord(str));
    }

    static String smallestWord(String str) {

        String[] words = str.split(" ");

        String smallest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }

        return smallest;
    }
}