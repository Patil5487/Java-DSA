import java.util.*;
public class p9 {
    public static void main(String[] args) {
        int k=0, l=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(l);
                }
                else {
                    System.out.print(k);
                }

            }
            System.out.println();
        }
    }
}