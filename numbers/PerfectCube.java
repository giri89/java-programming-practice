package numbers;

public class PerfectCube {
    public static void main(String[] args) {
        System.out.println(isPerfectCube(27));
    }

    static boolean isPerfectCube(int n) {

        for (int i = 1; i <= n; i++) {

            if (i * i * i == n) {
                return true;
            }
        }

        return false;
    }
}