package strings;

import java.util.Arrays;

public class CharacterFrequency {
    public static void main(String[] args) {
        solution("abcdefabghkilj");
    }

    static void solution(String s) {
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            a[index]++;
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) continue;
            System.out.println((char) (i + 'a') + " " + a[i]);
        }
    }
}