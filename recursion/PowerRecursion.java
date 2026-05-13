package recursion;

public class PowerRecursion {
    public static void main(String[] args) {
        System.out.println(solution(3, 3));
    }

    static int solution(int x, int y) {
        if (y == 0) return 1;
        return x * solution(x, y - 1);
    }
}