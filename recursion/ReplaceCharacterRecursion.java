package recursion;

public class ReplaceCharacterRecursion {
    public static void main(String[] args) {

        System.out.println(replace("banana", 'a', 'x'));
    }

    static String replace(String str, char oldChar, char newChar) {

        if (str.length() == 0) {
            return "";
        }

        char first = str.charAt(0);

        if (first == oldChar) {
            first = newChar;
        }

        return first + replace(
                str.substring(1),
                oldChar,
                newChar);
    }
}