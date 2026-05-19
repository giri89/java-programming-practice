package numbers;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        decimalToHexadecimal(26);
    }

    static void decimalToHexadecimal(int n) {

        String hex = "";

        while (n > 0) {

            int rem = n % 16;

            if (rem < 10) {
                hex = rem + hex;
            } else {
                hex = (char)(rem + 55) + hex;
            }

            n = n / 16;
        }

        System.out.println(hex);
    }
}