package recursion;

public class DecimalToHexRecursion {
    public static void main(String[] args) {

        hex(255);
    }

    static void hex(int n) {

        if (n == 0) {
            return;
        }

        hex(n / 16);

        int rem = n % 16;

        if (rem < 10) {
            System.out.print(rem);
        } else {
            System.out.print((char)(rem + 55));
        }
    }
}