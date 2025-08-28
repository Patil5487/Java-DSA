import java.util.*;
class myLinkedList{
    // public static void main(String[] args){
        // LinkedList<String> list = new LinkedList<String>();
        // list.add("is");
        // list.add("a");
        // list.addFirst("This");
        // list.add(3,"LinkedList");
        // System.out.println("LinkedList: " + list);

        // System.out.println(list.get(0));
        // System.out.println(list.size());



        //Scratch implementation of LinkedList
        Node head;
        class Node{
            String data;
            Node next;

            Node(String data){
                this.data = data; 
                this.next = null;
            }
        }

        //addFirst method
        public void addFirst(String data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //addLast method
        public void addLast(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            } 
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

        //printList

        public void printList(){
            if(head == null){
                System.out.println("Empty List");
                return;
            }
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            } 
            System.out.println("Null");
        }


        //deleteFirst method
        public void deleteFirst(){
            if(head == null){
                System.out.println("List is empty, nothing to delete.");
                return;
            }

            head = head.next;
        }

        //deleteLast method
        public void deleteLast(){
            if(head == null){
                System.out.println("List is empty, nothing to delete.");
                return;
            }

            if(head.next == null){
                head = null;
                return;
            }

            Node secondLast = head;
            Node last = head.next;
            while(last.next != null){
                last = last.next;
                secondLast = secondLast.next;
            }

            secondLast.next = null;
        }
        
        
        //Reverse the linked list
        public void reverseIterate(){
            if(head == null || head.next == null){
                return; // No need to reverse if list is empty or has only one element
            }
            Node prev = head;
            Node current = head.next;

            while(current != null){
                Node next = current.next;
                current.next = prev;

                //update
                prev = current;
                current = next;
            }
            head.next = null; // Set the old head's next to null
            head = prev; // Update head to the new first element
        }


        public Node reverseRecursive(Node head){
            if(head == null || head.next == null){
                return head; // Base case: if list is empty or has one element
            }
            // Recursive case: reverse the rest of the list
               Node newHead = reverseRecursive(head.next);
               head.next.next = head;
                head.next = null;
                return newHead;
        }


        public static void main(String[] args) {
            myLinkedList list = new myLinkedList();
            list.addFirst("1");
            list.addLast("2");
            list.addLast("3");
            list.addLast("4");
            list.printList(); // Output: 1 2 3 4 Null

            list.reverseIterate();
            list.printList(); // Output: 4 3 2 1 Null
            }
}