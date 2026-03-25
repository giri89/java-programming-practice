package numbers;

public class CountDigits2 {
    public static void main(String[] args) {
        System.out.println(countDigits(41564841));
    }

    static int countDigits(int n) {
        return (n + "").length();
    }
}