package recursion;

public class MultiplicationUsingRecursion {
    public static void main(String[] args) {

        System.out.println(multiply(5, 4));
    }

    static int multiply(int a, int b) {

        if (b == 0) {
            return 0;
        }

        return a + multiply(a, b - 1);
    }
}