package numbers;

public class DecimalToOctal {
    public static void main(String[] args) {
        decimalToOctal(20);
    }

    static void decimalToOctal(int n) {

        String octal = "";

        while (n > 0) {

            int rem = n % 8;

            octal = rem + octal;

            n = n / 8;
        }

        System.out.println(octal);
    }
}