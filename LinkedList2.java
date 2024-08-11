
public class LinkedList2 {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Add in middle
    public void add(int data, int idx) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        
        Node temp = head;
        int i = 0;
        
        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Remove first
    public void removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    // Print linked list
    public void print() {
        if (head == null) {
            System.out.println("No linked list found");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();

        ll.add(2, 0);
        ll.print();
        ll.add(4, 1);
        ll.print();
        ll.add(6, 2);
        ll.print();
        ll.add(8, 3);
        ll.print();

        // Test remove first
        ll.removeFirst();
        ll.print();
        ll.removeFirst();
        ll.print();
    }
}
