import java.util.*;
import java.util.ArrayList;
public class stack{


    // This class implements a simple stack using a linked list.
    // It provides methods to push, pop, and peek at the top element of the stack
    
    // static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // static class stackclass{
    //     public static Node head;
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }

    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }

    //         newNode.next = head;
    //         head = newNode;

    //     }


    //     public static int pop(){
    //         if(isEmpty()){
    //            return -1; 
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }


    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }


    //Implementation using ArrayList
    // class StackClass{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return list.size()==0;
    //     }

    //     public static void push(int data){
    //         list.add(data);
    //     }

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }



    //Stack implementation using array

    class stackClass{
        int size;
        int top;
        int[] arr;

        public stackClass(int size){
            this.size = size;
            this.top = -1;
            this.arr = new int[size];
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public void push(int data){
            if(top == size-1){
                System.out.println("Stack Overflow");
                return;                
            }else{
                top++;
                arr[top] = data;
            }
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack Underlow");
                return -1;
            }
            int topElement = arr[top];
            top--;
            return topElement;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        }
    public static void main(String[] args) {
        // StackClass s = new StackClass();

    //     Stack<Integer> StackClass = new Stack<>();
    //     StackClass.push(1);
    //     StackClass.push(2);
    //     StackClass.push(3);
    //     StackClass.push(4);

    //     while(!StackClass.isEmpty()){
    //         System.out.println(StackClass.peek());
    //         StackClass.pop();
    // }

        stack s = new stack();
        stackClass sc = s.new stackClass(0);
        sc.peek();
        
        
}
}