import java.util.*;
public class factorial {
    public static void factorial(int n, int fact){
        if(n==1){
            System.out.print(fact);
            return;
        }
        fact*=n;
        factorial(n-1,fact);
    }
    public static void main(String[] args) {
        factorial(5,1);
    }
}