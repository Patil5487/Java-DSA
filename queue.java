public class queue {

    //Implementation using Array
    // static class Queue{
    //     int arr[];
    //     int size;
    //     static int rear = -1;

    //     public Queue(int size) {
    //     arr = new int[size];
    //     this.size = size;
    //     }


    //     public static boolean isEmpty(){
    //         return rear == -1;
    //     }

    //     public void enqueue(int data){
    //         if(rear == size - 1){
    //             System.out.println("Queue Overflow");
    //             return;
    //         }

    //         rear++;
    //         arr[rear] = data;
    //     }

    //     public int dequeue(){
    //         if(isEmpty()){
    //             System.out.println("Queue Underflow");
    //             return -1;
    //         }

    //         int frontElement = arr[0];
    //         for(int i=0; i<rear; i++){
    //             arr[i] = arr[i+1];
    //         }
    //         rear--;
    //         return frontElement;
    //     }

    //     public int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return arr[0];
    //     }

    // }
    //     public static void main(String[] args) {
    //         Queue queue = new Queue(5);
    //         queue.enqueue(10);
    //         queue.enqueue(20);
    //         queue.enqueue(30);
    //         System.out.println("Peek: " + queue.peek());
    //     }

//Circular queue implementation using array
// static class circularQueue{
//     static int arr[];
//     static int size;
//     static int front = -1;
//     static int rear = -1;

//     circularQueue(int size){
//         arr = new int[size];
//         this.size = size;
//     }

//     public static boolean isEmpty(){
//         return front == -1 && rear == -1;
//     }

//     public static boolean isFull(){
//         return (rear+1) % size == front;
//     }

//     public static void enqueue(int data){
//         if(isFull()){
//             System.out.println("Queue Overflow");
//             return;
//         }

//         //If the queue is empty, adding 1st elemet
//         if(front == -1){
//             front = 0;
//         }
//         rear = (rear + 1) % size;
//         arr[rear] = data;
//     }


//     public static int dequeue(){
//         if(isEmpty()){
//             System.out.println("Queue Underflow");
//             return -1;
//         }

//         int frontElement = arr[front];
//         if(front == rear){
//             rear = front = -1;
//         }
//         else{
//         front = (front + 1) % size;
//         }
//         return frontElement;

//     }
//         public static int peek(){
//         if(isEmpty()){
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         return arr[front];
          
// }
// public static void main(String[] args) {
//     circularQueue queue = new circularQueue(5);
//     queue.enqueue(10);
//     queue.enqueue(20);
//     queue.enqueue(30);
//     System.out.println("Peek: " + queue.peek());
//     System.out.println("Dequeue: " + queue.dequeue());
//     System.out.println("Peek after dequeue: " + queue.peek());
// }
// }


// queue implementation using likedlist


    public class QueueUsingLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Queue variables
    static Node head = null;
    static Node tail = null;

    // Check if queue is empty
    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    // Enqueue -> add at the end
    public static void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode; // first element
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Dequeue -> remove from front
    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int frontVal = head.data;
        if (head == tail) { // only 1 element
            head = tail = null;
        } else {
            head = head.next;
        }
        return frontVal;
    }

    // Peek -> front element
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    // Test
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);

        System.out.println("Peek: " + peek());   // 10
        System.out.println("Dequeue: " + dequeue()); // 10
        System.out.println("Peek after dequeue: " + peek()); // 20
    }
}
}
