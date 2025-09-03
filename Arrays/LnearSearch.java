import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=1; i<=arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int key = 10;
        for(int i= 1; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
}