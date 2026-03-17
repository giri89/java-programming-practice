package numbers;

// Check if a number is prime (basic method)

public class PrimeCheckBasic {

    public static void main(String[] args) {

        System.out.println(isPrime(10));

    }

    static boolean isPrime(int n){

        if(n <= 1) return false;

        int count = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }

        return count == 2;

    }

}