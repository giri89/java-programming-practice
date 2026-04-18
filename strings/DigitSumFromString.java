package strings;

public class DigitSumFromString {
    public static void main(String[] args) {
        String s = "h12e5l2l5o7";
        System.out.println(digitSum(s));
    }

    static int digitSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                System.out.println(ch);
                sum = sum + ch - '0';
            }
        }
        System.out.println(sum);
        return sum;
    }
}