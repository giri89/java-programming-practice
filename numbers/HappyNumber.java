package numbers;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    static boolean isHappy(int n) {

        while (n != 1 && n != 4) {

            int sum = 0;

            while (n > 0) {

                int rem = n % 10;

                sum = sum + (rem * rem);

                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }
}