package numbers;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        printArmstrong(1, 1000);
    }

    static void printArmstrong(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {

        int temp = n;
        int digitCount = countDigits(n);
        int sum = 0;

        while (n > 0) {

            int rem = n % 10;

            sum = sum + power(rem, digitCount);

            n = n / 10;
        }

        return temp == sum;
    }

    static int countDigits(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    static int power(int x, int y) {

        int result = 1;

        for (int i = 1; i <= y; i++) {
            result = result * x;
        }

        return result;
    }
}