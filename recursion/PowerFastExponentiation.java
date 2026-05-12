package recursion;

public class PowerFastExponentiation {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
    }

    static int solution(int x, int y) {
        if (y == 0) return 1;
        int temp = solution(x, y / 2);
        if (y % 2 == 0)
            return temp * temp;
        else
            return temp * temp * x;
    }
}