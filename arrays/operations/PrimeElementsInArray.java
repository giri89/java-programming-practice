package arrays.operations;

public class PrimeElementsInArray {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 6, 2, 7};

        printPrime(a);
    }

    public static void printPrime(int[] a) {
        for (int x : a) {
            if (isPrime(x)) {
                System.out.println(x);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}