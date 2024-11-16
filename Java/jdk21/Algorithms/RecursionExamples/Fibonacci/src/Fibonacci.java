public class Fibonacci {

    public int head(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int fib1 = head(n-1);
        int fib2 = head(n-2);

        return fib1 + fib2;
    }

    public int tail(int f1, int f2, int count ){
        if(count == 0) return f1;

        return tail(f2, f1+f2, count - 1);
    }
}
