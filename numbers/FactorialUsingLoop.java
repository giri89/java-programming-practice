package numbers;

public class FactorialUsingLoop {

    public static void main(String[] args) {

        System.out.println(fact(5));

    }

    static int fact(int n){

        int res=1;

        for(int i=1;i<=n;i++){
            res*=i;
        }

        return res;

    }

}