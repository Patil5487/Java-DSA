import java.util.*;
public class  NoPyramid_palindrome{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}