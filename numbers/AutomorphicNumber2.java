package numbers;

public class AutomorphicNumber2 {
    public static void main(String[] args) {
        System.out.println(isAutomorphic(6));
    }

    static boolean isAutomorphic(int n) {
        int square = n * n;
        return (square + "").endsWith(n + "");
    }
}