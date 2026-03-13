package basics;

// Check if a number is power of 2

public class PowerOfTwoCheck {

    public static void main(String[] args) {

        int n = 16;

        if ((n & (n - 1)) == 0) {
            System.out.println(n + " is power of 2");
        } else {
            System.out.println(n + " is not power of 2");
        }

    }

}