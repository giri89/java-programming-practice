package numbers;

public class OctalToDecimal {
    public static void main(String[] args) {
        System.out.println(octalToDecimal(17));
    }

    static int octalToDecimal(int n) {

        int sum = 0;
        int power = 0;

        while (n > 0) {

            int rem = n % 10;

            sum = sum + rem * (int)Math.pow(8, power);

            power++;

            n = n / 10;
        }

        return sum;
    }
}