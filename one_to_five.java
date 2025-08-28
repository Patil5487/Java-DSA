import java.util.*;
public class one_to_five {
    public static void print_one_to_five(int start, int end) {
        if(start==end+1){
            return;
        }
        System.out.print(start);
        print_one_to_five(start+1,end);

    }

    public static void five_to_one(int starting) {
        if(starting==0){
            return;
        }
        System.out.print(starting);
        five_to_one(starting-1);
    }
    public static void main(String[] args) {
        print_one_to_five(1,5);
        System.out.println();
        five_to_one(5);
    }
}