import java.util.*;
public class sum_of_first_n_natutral_no {
    public static void sum_of_first_n_natutral_no(int n, int sum) {
        if(n==0){
            System.out.print(sum);
            return;
        }
        sum+=n;
        sum_of_first_n_natutral_no(n-1,sum);
    }


    public static void main(String[] args) {
        sum_of_first_n_natutral_no(5,0);
    }
}