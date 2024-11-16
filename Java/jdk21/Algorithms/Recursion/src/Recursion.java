public class Recursion {

    public void head(int n){

        System.out.println("Calling the function with n = " + n);

        if(n == 0) return;

        head(n-1);  //recursive call

        System.out.println("The value of n = " + n);    //operation performed
    }

    public void tail(int n){

        System.out.println("Calling the function with n = " + n);

        if(n==0)return;

        System.out.println("The value is n="+n);
        tail(n-1);
    }
}
