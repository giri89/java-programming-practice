package strings;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        String s = "abcdeabcghiabcdef";
        String key = "abc";
        System.out.println(s.length());
        String temp = s.replace(key, "");
        System.out.println(temp.length());
        int removed = s.length() - temp.length();
        System.out.println(removed);
        System.out.println(removed / key.length());
    }
}