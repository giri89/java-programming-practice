package numbers;

public class SmallestDigit {
    public static void main(String[] args) {
        System.out.println(smallestDigit(9274));
    }

    static int smallestDigit(int n) {

        int min = 9;

        while (n > 0) {

            int rem = n % 10;

            if (rem < min) {
                min = rem;
            }

            n = n / 10;
        }

        return min;
    }
}