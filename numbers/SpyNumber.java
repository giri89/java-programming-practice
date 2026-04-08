package numbers;

public class SpyNumber {

    public static void main(String[] args) {
        System.out.println(isSpy(123));
    }

    static boolean isSpy(int n) {
        int sum = 0;
        int multiply = 1;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
            multiply *= rem;
        }
        return sum == multiply;
    }
}