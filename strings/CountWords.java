package strings;

public class CountWords {
    public static void main(String[] args) {

        String str = "Java is easy to learn";

        System.out.println(countWords(str));
    }

    static int countWords(String str) {

        String[] words = str.split(" ");

        return words.length;
    }
}