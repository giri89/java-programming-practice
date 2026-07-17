package strings;

public class PrintUniqueCharacters {
    public static void main(String[] args) {

        String str = "programming";

        printUnique(str);
    }

    static void printUnique(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i))
                    == str.lastIndexOf(str.charAt(i))) {

                System.out.println(str.charAt(i));
            }
        }
    }
}