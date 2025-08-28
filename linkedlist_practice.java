package Collections.practice;

import java.util.LinkedList;

public class linkedlist_practice {
    static Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Add First

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
}

    //Add Last
    public void addLast(int data){
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
    public static void printList(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    
    
    //Insertion at the given position = 4
    public void insertionAtGiven(int data,int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }
        Node current = head;
        for(int i=1; current != null && i < pos-1; i++){
            current = current.next;
        }
        
        if(current == null){
            System.out.println("Out of bound");
        }
        
        newNode.next = current.next;
        current.next = newNode;
    }
    
    
    //Deletion of the node
    public void deletion(int pos){
        Node current = head;
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        if(pos == 1){
            head = head.next;
            return;
        }
        
        for(int i=0; current != null && i < pos-1; i++){
            current = current.next;
        }
        current.next = current.next.next;
      
    }
    
    //count the no of nodes
    public int countNodes(){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
        
        
    }
    
    public int recursiveCounting(Node node){
        if(node == null) return 0;
        return 1+recursiveCounting(node.next);
    }
    
    
    //searching
    
    public boolean searchingNode(int key){
        if(head == null){
            System.out.println("Empty");
            return false;
        }
        
        Node current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public boolean recursiveSearching(int key,Node node){
        if(node == null) return false;
        if(node.data == key) return true;
        return recursiveSearching(key,node.next);
    }
    

    //Reversing of linked list
    public void revese(){
        LinkedList<Integer> lst = new LinkedList<>();
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node current = head;
        while(current!=null){
            lst.addFirst(current.data);
            current = current.next;
        }
        System.out.println(lst+" ");
    }


    //Middle element of list
    public void Middle(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node current = head;

        int count=0;
        while(current!=null){
            count++;
            current = current.next;
        }
        current = head;
        int mid = count/2;


        for(int i=0; i < mid; i++){
            current = current.next;
    }
    System.out.println("Middle element: " + current.data);
}


//find nth node from end
public void FindNthFromEnd(int n){
    if(head == null){
        System.out.println("Empty");
        return;
    }

    Node current = head;
    int count = 0;
    
    while(current!=null){
        count++;
        current = current.next;
    }

    current = head;
    for(int i=0; i<count-n; i++){
        current = current.next;
    }    
    System.out.println("nth elemet from end: "+current.data);
     
}
    
    public static void main(String[] args){
        linkedlist_practice list = new linkedlist_practice();
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(9);
        list.addFirst(8);
        list.insertionAtGiven(24,5);
        list.insertionAtGiven(22,5);
        list.deletion(5);
        System.out.println("No of Nodes: "+list.countNodes());
        System.out.println("No of Nodes: "+list.recursiveCounting(head));
        System.out.println("Node is found: "+list.searchingNode(10));
        System.out.println("Node is found: "+list.recursiveSearching(10,list.head));
        list.revese();
        list.Middle();
        list.printList();
        System.err.println();
        list.FindNthFromEnd(1);
        
        
        
        
    }

}

