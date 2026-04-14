package strings;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "java is easy";
        String res = reverse(s);
        System.out.println(res);
    }

    static String reverse(String s) {
        String sa[] = s.split(" ");
        System.out.println(Arrays.toString(sa));
        String res = "";
        for (int i = 0; i < sa.length; i++) {
            String temp = reverseWord(sa[i]);
            res = res + temp;
            res = res + " ";
        }
        return res;
    }

    static String reverseWord(String word) {
        char ch[] = word.toCharArray();
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