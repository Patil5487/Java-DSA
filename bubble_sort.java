import java.util.*;
public class bubble_sort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //ascending order
    public static void main(String[] args) {
        int array[] = {7,8,3,1,2};

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
            //descending order
//        for(int i=0; i<array.length-1; i++){
//            for(int j=0; j<array.length-i-1; j++){
//                if(array[j]<array[j+1]){
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
        printArray(array);
        }
    }

// time complexity = O(n^2)