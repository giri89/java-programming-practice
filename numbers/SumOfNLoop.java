package numbers;

public class SumOfNLoop {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    static int sum(int n) {
        int res = 0;
        for (int i = n; i >= 1; i--) {
            res += i;
        }
        return res;
    }
}