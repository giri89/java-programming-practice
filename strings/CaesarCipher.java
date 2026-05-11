package strings;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "abcdestuvwxyz";
        String res = sol(s, 4);
        System.out.println(res);
    }

    static String sol(String s, int key) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char temp = (char) (ch + key);
            if (temp > 'z') {
                int used = 'z' - ch;
                int pending = key - used;
                temp = (char) (96 + pending);
            }
            res = res + temp;
        }
        return res;
    }
}