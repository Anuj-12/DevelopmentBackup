public class Factorial {

    public int head(int n ){

        if(n == 1) return 1;

        int res1 = head(n-1);
        int result = n * res1;
        return result;
    }

    public int tail(int n, int acc){
        if(n==1) return acc;

        return tail(n-1, acc * n);
    }
}
