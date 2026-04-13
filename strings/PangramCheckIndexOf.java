package strings;

public class PangramCheckIndexOf {
    public static void main(String[] args) {
        String s = "The five boxing wizards jump quickly.";
        s = s.toLowerCase();
        System.out.println(isPangram(s));
    }

    static boolean isPangram(String s) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}