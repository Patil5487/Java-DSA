import java.util.*;
public class p12 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=10; j++){
//                System.out.print("*");
                if(i==1 || i==10 || j==1 || j==10){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}