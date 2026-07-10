package strings;

public class CheckEmptyString {
    public static void main(String[] args) {

        String str = "";

        System.out.println(isEmpty(str));
    }

    static boolean isEmpty(String str) {

        return str.length() == 0;
    }
}