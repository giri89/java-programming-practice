package numbers;

public class PrimeCheck1To100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (solution(i)) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }
        }
    }

    static boolean solution(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
