package numbers;

public class AutomorphicNumber1 {
    public static void main(String[] args) {
        System.out.println(isAutomorphic(36)); // false
        System.out.println(isAutomorphic(6));  // true
    }

    static boolean isAutomorphic(int n) {
        int square = n * n;

        while (n > 0) {
            if (n % 10 != square % 10) {
                return false;
            }
            n /= 10;
            square /= 10;
        }
        return true;
    }
}