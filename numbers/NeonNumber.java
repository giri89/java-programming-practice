package numbers;

public class NeonNumber {
    public static void main(String[] args) {
        System.out.println(isNeon(9));
    }

    static boolean isNeon(int n) {

        int square = n * n;
        int sum = 0;

        while (square > 0) {
            int rem = square % 10;
            sum = sum + rem;
            square = square / 10;
        }

        return sum == n;
    }
}