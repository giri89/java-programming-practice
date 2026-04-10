package numbers;

public class GcdLoop {
    public static void main(String[] args) {
        System.out.println(gcd(3, 93));
    }

    static int gcd(int n1, int n2) {
        int min = n1 > n2 ? n2 : n1;
        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}