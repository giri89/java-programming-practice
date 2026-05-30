package strings;

public class StringLength {
    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(length(str));
    }

    static int length(String str) {

        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        return count;
    }
}