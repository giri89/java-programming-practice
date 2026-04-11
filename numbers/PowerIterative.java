package numbers;

public class PowerIterative {
    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }

    static int solution(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res = res * x;
        }
        return res;
    }
}