
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        System.err.println("Node created with data: " + data);
    }
}

class LinkedList {

    Node head;

    LinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void displaymerge(Node head) {
        Node temp = head.next;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        temp.next = l1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = l2;
        System.err.println("Merged linked list: Head: " + dummy.next.data);
        return dummy;
    }

    Node sort(Node h1) {
        Node temp = h1;
        while (temp != null) {
            Node temp2 = temp.next;
            while (temp2 != null) {
                if (temp.data > temp2.data) {
                    int t = temp.data;
                    temp.data = temp2.data;
                    temp2.data = t;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        System.err.println("Sorted linked list: ");
        return h1;
    }
}

class Merge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Choice 1: Merge two linked lists\nChoice 2: Exit\nEnter your choice: ");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    LinkedList l1 = new LinkedList();
                    LinkedList l2 = new LinkedList();
                    LinkedList l3 = new LinkedList();
                    System.out.print("Enter the number of elements in the first linked list: ");
                    int n1 = sc.nextInt();
                    System.out.print("Enter the elements of the first linked list: ");
                    for (int i = 0; i < n1; i++) {
                        l1.insert(sc.nextInt());
                    }
                    System.out.print("Enter the number of elements in the second linked list: ");
                    int n2 = sc.nextInt();
                    System.out.print("Enter the elements of the second linked list: ");
                    for (int i = 0; i < n2; i++) {
                        l2.insert(sc.nextInt());
                    }
                    l3.head = l3.mergeTwoLists(l1.head, l2.head);
                    l3.head = l3.sort(l3.head);
                    System.out.print("The merged linked list is: ");
                    l3.displaymerge(l3.head);
                    System.out.println();
                }
                case 2 ->
                    System.out.println("Exiting...");
                default ->
                    System.out.println("Invalid choice");
            }
        } while (n != 2);
    }
}
