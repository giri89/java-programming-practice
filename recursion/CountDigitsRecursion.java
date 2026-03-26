package recursion;

public class CountDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(countDigits(41564841));
    }

    static int countDigits(int n) {
        if (n <= 9) return 1;
        return 1 + countDigits(n / 10);
    }
}