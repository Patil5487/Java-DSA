import java.util.*;
public class reverse_string {
    public static String reverseString(String s){
        if(s.length()==1){
            return s;
        }

        char a = s.charAt(0);
        String nextString =  reverseString(s.substring(1));
        return nextString+a;

    }

    public static void main(String[] args) {
        String reversed = reverseString("ABC");
        System.out.println(reversed);
    }
}