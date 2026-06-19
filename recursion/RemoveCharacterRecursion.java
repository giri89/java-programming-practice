package recursion;

public class RemoveCharacterRecursion {
    public static void main(String[] args) {

        System.out.println(remove("banana", 'a'));
    }

    static String remove(String str, char ch) {

        if (str.length() == 0) {
            return "";
        }

        char first = str.charAt(0);

        if (first == ch) {
            return remove(str.substring(1), ch);
        }

        return first + remove(str.substring(1), ch);
    }
}