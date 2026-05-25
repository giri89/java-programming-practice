package numbers;

public class RomanToDecimal {
    public static void main(String[] args) {
        System.out.println(romanToDecimal("LVIII"));
    }

    static int romanToDecimal(String roman) {

        int sum = 0;

        for (int i = 0; i < roman.length(); i++) {

            int current = value(roman.charAt(i));

            if (i + 1 < roman.length()) {

                int next = value(roman.charAt(i + 1));

                if (current < next) {
                    sum = sum - current;
                } else {
                    sum = sum + current;
                }

            } else {
                sum = sum + current;
            }
        }

        return sum;
    }

    static int value(char ch) {

        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;

        return 0;
    }
}