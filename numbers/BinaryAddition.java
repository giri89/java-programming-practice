package numbers;

public class BinaryAddition {
    public static void main(String[] args) {
        System.out.println(addBinary(1010, 1101));
    }

    static int addBinary(int a, int b) {

        int carry = 0;
        int sum = 0;
        int place = 1;

        while (a > 0 || b > 0 || carry > 0) {

            int digit1 = a % 10;
            int digit2 = b % 10;

            int total = digit1 + digit2 + carry;

            sum = sum + (total % 2) * place;

            carry = total / 2;

            place = place * 10;

            a = a / 10;
            b = b / 10;
        }

        return sum;
    }
}