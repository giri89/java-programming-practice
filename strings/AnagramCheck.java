package strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "abcabcabbac";
        String s2 = "caabacbabbd";
        System.out.println(solution(s1, s2));
    }

    static boolean solution(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int a[] = new int[26];
        int b[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int index1 = s1.charAt(i) - 'a';
            a[index1]++;
            int index2 = s2.charAt(i) - 'a';
            b[index2]++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}