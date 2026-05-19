package numbers;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        System.out.println(hexadecimalToDecimal("1A"));
    }

    static int hexadecimalToDecimal(String hex) {

        int sum = 0;
        int power = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {

            char ch = hex.charAt(i);

            int value = 0;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 55;
            }

            sum = sum + value * (int)Math.pow(16, power);

            power++;
        }

        return sum;
    }
}