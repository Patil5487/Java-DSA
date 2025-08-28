import java.util.*;
public class array_increasing_or_not{
    public static boolean array_increasing_or_not(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(!array_increasing_or_not(arr, index+1)){
            return false;
        }

        return arr[index]<arr[index+1];

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,1,10};
        System.out.println(array_increasing_or_not(arr, 0));
    }
}