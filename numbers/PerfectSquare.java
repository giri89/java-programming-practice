package numbers;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(49));
    }

    static boolean isPerfectSquare(int n) {

        for (int i = 1; i <= n; i++) {

            if (i * i == n) {
                return true;
            }
        }

        return false;
    }
}