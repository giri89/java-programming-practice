package strings;

public class ReverseStringLoop {
    public static void main(String[] args) {
        String s = "maximum";
        System.out.println(reverse(s));
    }

    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            rev = rev + ch;
        }
        return rev;
    }
}