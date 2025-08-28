import java.util.*;
public class first_last_occurance {
    public static int first = -1;
    public static int last = -1;
    public static void first_last_occurance(char c, String str, int index) {
        if (index == str.length()) {
            return;
        }
        char current = str.charAt(index);
        if (current == c) {
            if (first == -1) {
                first = index;
            }
        } else {
            last = index;
        }

    first_last_occurance(c, str, index + 1);

    }

    public static void main(String[] args){
        first_last_occurance('a',"aaaaajhgjhguia",0);
        System.out.println(first);
        System.out.println(last);
    }
}