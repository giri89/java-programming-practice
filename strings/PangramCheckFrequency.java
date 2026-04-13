package strings;

public class PangramCheckFrequency {
    public static void main(String[] args) {
        String s = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(isPangram(s));
    }

    static boolean isPangram(String s) {
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            a[index]++;
        }
        for (int x : a) {
            if (x == 0) {
                return false;
            }
        }
        return true;
    }
}