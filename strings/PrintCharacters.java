package strings;

public class PrintCharacters {
    public static void main(String[] args) {

        String str = "Java";

        printCharacters(str);
    }

    static void printCharacters(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}