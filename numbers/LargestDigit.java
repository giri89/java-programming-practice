package numbers;

public class LargestDigit {
    public static void main(String[] args) {
        System.out.println(largestDigit(9274));
    }

    static int largestDigit(int n) {

        int max = 0;

        while (n > 0) {

            int rem = n % 10;

            if (rem > max) {
                max = rem;
            }

            n = n / 10;
        }

        return max;
    }
}