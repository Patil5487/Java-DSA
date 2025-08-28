public class LinkedListQuestions {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Delete nth node from the last
    public Node deleteNthFromLast(Node head, int n) {
        if (head.next == null) {
            return null; // Only one node
        }

        int size = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            size++;
        }

        if (n == size) {
            return head.next; // Remove head
        }

        int indexToSearch = size - n;
        Node prev = head;
        for (int i = 1; i < indexToSearch; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next; // Skip nth node
        return head;
    }

    // Palindrome check
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (!firstHalfStart.data.equals(secondHalfStart.data)) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true; // ✅ Missing return fixed
    }

    // Find middle node (slow/fast pointer)
    private Node findMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Reverse linked list
    private Node reverse(Node head) {
        Node prev = null, current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Add node at end (helper for testing)
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Main for testing
    public static void main(String[] args) {
        LinkedListQuestions list = new LinkedListQuestions();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("A");

        list.printList();

        System.out.println("Palindrome? " + list.isPalindrome());

        list.deleteNthFromLast(list.head, 2);
        list.printList();
    }
}
