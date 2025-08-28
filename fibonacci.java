import java.util.*;
public class fibonacci {
    public static void fibonacci_series(int a, int b, int n) {

        if(n==0){
            return;
        }
        System.out.print(a);
        fibonacci_series(b,a+b,n-1);
    }
    public static void main(String[] args) {
        fibonacci_series(0,1,5);
    }
}