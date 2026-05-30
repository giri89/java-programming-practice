package strings;

public class RemoveSpaces {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        System.out.println(removeSpaces(str));
    }

    static String removeSpaces(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}