package strings;

public class ReverseStringTwoPointer {
    public static void main(String[] args) {
        String s = "mom";
        System.out.println(reverse(s));
        System.out.println(isPallindrome(s));
    }

    static boolean isPallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static String reverse(String s) {
        char ch[] = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}