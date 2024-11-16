public class EucledianAlgorithm {

    public int GCD(int a, int b){
        if(b % a == 0) return a;
        return GCD(b, a % b);
    }
}
