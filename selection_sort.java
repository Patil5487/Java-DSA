public class selection_sort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[] = {8,7,1,3,2};

        for(int i=0;i<array.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<array.length;j++){
                if(array[smallest]>array[j]){
                    int temp = array[smallest];
                    array[smallest] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
    }
}


// time complexity = O(n^2)=