package Collections.practice;
import java.util.*;

import java.util.Stack;

public class stack_practice {
    // Stack implementation using an array
    // class ArrayStack {
    //     int top;
    //     int[] arr;
    //     int size;

    //     public ArrayStack(int size) {
    //         this.size = size;
    //         this.arr = new int[size];
    //         this.top = -1;
    //     }

    //     public boolean isEmpty() {
    //         return top == -1;
    //     }

    //     public void push(int data) {
    //         if (top == size - 1) {
    //             System.err.println("Stack overflow");
    //             return;
    //         }
    //         arr[++top] = data;
    //     }

    //     public int pop() {
    //         if (isEmpty()) {
    //             System.err.println("Stack underflow");
    //             return -1;
    //         }
    //         return arr[top--];
    //     }

    //     public int peek() {
    //         if (isEmpty()) {
    //             System.err.println("Stack is empty");
    //             return -1;
    //         }
    //         return arr[top];
    //     }
    // }

    // // Stack implementation using LinkedList
    // class LinkedListStack {
    //     Node head; // head of the stack

    //     class Node {
    //         int data;
    //         Node next;

    //         public Node(int data) {
    //             this.data = data;
    //             this.next = null;
    //         }
    //     }

    //     public boolean isEmpty() {
    //         return head == null;
    //     }

    //     public void push(int data) {
    //         Node newNode = new Node(data);
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     public int pop() {
    //         if (isEmpty()) {
    //             System.err.println("Stack underflow");
    //             return -1;
    //         }
    //         int topElement = head.data;
    //         head = head.next;
    //         return topElement;
    //     }

    //     public int peek() {
    //         if (isEmpty()) {
    //             System.err.println("Stack is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }



    //Two stacks in one array

    // public class TwoStack{
    //     int size;
    //     int top1;
    //     int top2;
    //     int[] arr;

    //     public TwoStack(int n){
    //         size = n;
    //         this.arr = new int[size];
    //         top1 = -1;
    //         top2 = n;
    //     }

    //     public void push1(int data){
    //         if(top1 < top2 - 1){
    //             top1++;
    //             arr[top1] = data;
    //         }else{
    //             System.out.println("Overflow");
    //         }
    //     }

    //     public void push2(int data){
    //         if(top1 < top2 - 1){
    //             top2--;
    //             arr[top2] = data;
    //         }else{
    //             System.out.println("Overflow");
    //         }
    //     }

    //     public int pop1(){
    //         if(top1 >= 0){
    //             int x = arr[top1];
    //             top1--;
    //             return x;
    //         }else{
    //             System.out.println("Underflow");
    //             return -1;
    //         }
    //     }

    //     public int pop2(){
    //         if(top2 < size){
    //             int x = arr[top2];
    //             top2++;
    //             return x;
    //         }else{
    //             System.out.println("Underflow");
    //             return -1;
    //         }
    //     }

    //     public int peek1(){
    //         if(top1 >= 0){
    //             return arr[top1];
    //         }else{
    //             System.out.println("Underflow");
    //             return -1;
    //         }
    //     }

    //     public int peek2(){
    //         if(top2 < size){
    //             return arr[top2];
    //         }else{
    //             System.out.println("Underflow");
    //             return -1;
    //         }
    //     }


    // }



    //Reverse a String using Stack

//     public class ReverseString{
//         public static String reverse(String str){
//             Stack<Character> stack = new Stack<>();
        
//         for(char ch: str.toCharArray()){
//             stack.push(ch);
//         }

//         StringBuilder ans = new StringBuilder();
//         while(!stack.isEmpty()){
//             ans.append(stack.pop());
//         }

//         return ans.toString();

//     }
// }




    
    public static void main(String[] args) {
        stack_practice sp = new stack_practice();

        // Array stack test
        // ArrayStack arrStack = sp.new ArrayStack(5);
        // arrStack.push(10);
        // arrStack.push(20);
        // arrStack.push(30);
        // System.out.println("ArrayStack Peek: " + arrStack.peek()); // 30
        // System.out.println("ArrayStack Pop: " + arrStack.pop());   // 30

        // // Linked list stack test
        // LinkedListStack listStack = sp.new LinkedListStack();
        // listStack.push(100);
        // listStack.push(200);
        // listStack.push(300);
        // System.out.println("LinkedListStack Peek: " + listStack.peek()); // 300
        // System.out.println("LinkedListStack Pop: " + listStack.pop());   // 300

        // TwoStack ts = sp.new TwoStack(10);
        // ts.push1(1);
        // ts.push1(2);
        // ts.push1(3);

        // ts.push2(100);
        // ts.push2(200);
        // ts.push2(300);

        // System.out.println("Popped from Stack1: " + ts.pop1()); // 3
        // System.out.println("Popped from Stack2: " + ts.pop2()); // 300

        // System.out.println("Top of Stack1: " + ts.peek1()); // 2
        // System.out.println("Top of Stack2: " + ts.peek2());

        // ReverseString rs = sp.new ReverseString();
        // String input = "hello";
        // String output = rs.reverse(input);

        // System.out.println("Original: " + input);   // hello
        // System.out.println("Reversed: " + output); // olleh
    }
}
