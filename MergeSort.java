import java.util.*;
public class MergeSort {
    //Dividing
    public static void divide(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int mid = start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr, start, mid, end);
    }

    //Conquer

    public static void conquer(int arr[], int start, int mid, int end){
        int merged[] = new int[end-start+1];
        int index1 = start;
        int index2 = mid+1;
        int index = 0;
        while(index1<=mid && index2<=end){
            if(arr[index1]<=arr[index2]){
                merged[index++] = arr[index1++];
            }
            else {
                merged[index++] = arr[index2++];
            }
        }


        while(index1<=mid){
            merged[index++] = arr[index1++];
        }

        while(index2<=end){
            merged[index++] = arr[index2++];
        }

        for(int i=0, j=start;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }

    }

// Time complexity : O(nlogn)


    public static void main(String[] args){
        int arr[] = {2,3,1,46,7,6,3};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}