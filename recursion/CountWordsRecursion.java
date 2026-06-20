package recursion;

public class CountWordsRecursion {
    public static void main(String[] args) {

        String str = "Java is easy to learn";

        System.out.println(countWords(str, 0));
    }

    static int countWords(String str, int index) {

        if (index == str.length()) {
            return 1;
        }

        if (str.charAt(index) == ' ') {
            return 1 + countWords(str, index + 1);
        }

        return countWords(str, index + 1);
    }
}