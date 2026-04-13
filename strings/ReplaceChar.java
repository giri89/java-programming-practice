package strings;

public class ReplaceChar {
    public static void main(String[] args) {
        String s = "hello world";
        String op = solution(s, 'o', '$');
        System.out.println(op);
    }

    static String solution(String s, char oldChar, char newChar) {
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == oldChar) {
                ch[i] = newChar;
            }
        }
        return new String(ch);
    }
}