package recursion;

public class DecimalToOctalRecursion {
    public static void main(String[] args) {

        octal(83);
    }

    static void octal(int n) {

        if (n == 0) {
            return;
        }

        octal(n / 8);

        System.out.print(n % 8);
    }
}