package strings;

public class ReverseCase {
    public static void main(String[] args) {

        String str = "Java";

        System.out.println(reverseCase(str));
    }

    static String reverseCase(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }

        return result;
    }
}