import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null; // Initialize next as null
    }
}

class LinkedList {
    Node head;

    // Constructor to initialize the LinkedList
    LinkedList() {
        this.head = null;
    }

    // Method to add elements to the linked list
    void add(int e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // Method to print the linked list
    void printLinkedList() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

class Mainn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int element;
        while (true) {
            element = sc.nextInt();
            if (element == -1)
                break;
            else
                l1.add(element);
        }
        l1.printLinkedList();
        sc.close();
    }
}
