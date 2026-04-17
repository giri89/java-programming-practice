package strings;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String s = "hello world";
        int vowels = countVowels(s);
        System.out.println(vowels);
        System.out.println(s.length() - vowels);
    }

    static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}