package numbers;

public class HarshadNumber {
    public static void main(String[] args) {
        System.out.println(isHarshad(18));
    }

    static boolean isHarshad(int n) {

        int temp = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        return temp % sum == 0;
    }
}