package recursion;

public class CountZerosRecursion {
    public static void main(String[] args) {
        System.out.println(countZeros(1002000));
    }

    static int countZeros(int n) {

        if (n == 0) {
            return 0;
        }

        int count = (n % 10 == 0) ? 1 : 0;

        return count + countZeros(n / 10);
    }
}