import java.util.*;
public class tower_of_hanoi {
    public static void tower_of_hanoi(int n, String start, String help, String dest) {

        if (n == 1) {
            System.out.print("Move disk " + n + " from " + start + " to " + dest + "\n");
            return;
        }

        tower_of_hanoi(n - 1, start, dest, help);
        System.out.print("Move disk " + n + " from " + start + " to " + dest + "\n");
        tower_of_hanoi(n - 1, help, start, dest);
    }

    public static void main(String[] args) {
        tower_of_hanoi(3, "A", "B", "C");
    }

}