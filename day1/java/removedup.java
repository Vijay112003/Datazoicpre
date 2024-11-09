import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
        System.out.println("Node created with data: " + d);
    }
}
class LinkedList{
    Node head;
    public void insert(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }
        else{
            Node temp = this.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void removeDup(){
        Node temp = this.head;
        Node prev = null;
        while(temp != null){
            Node temp1 = temp;
            while(temp1.next != null){
                if(temp1.next.data == temp.data){
                    prev = temp1.next;
                    prev = null;
                    temp1.next = temp1.next.next;
                }
                else{
                    temp1 = temp1.next;
                }
            }
            temp = temp.next;
        }
    }
    public void sort(){
        Node temp = this.head;
        while(temp != null){
            Node temp1 = temp.next;
            while(temp1 != null){
                if(temp.data > temp1.data){
                    int t = temp.data;
                    temp.data = temp1.data;
                    temp1.data = t;
                }
                temp1 = temp1.next;
            }
            temp = temp.next;
        }
    }
    public void print(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class RemoveDup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,n;
        do { 
            System.out.print("\nChoice 1: Remove duplicates\nChoice 2: Exit\nEnter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();
                    System.out.print("Enter elements: ");
                    LinkedList list = new LinkedList();
                    for(int i=0; i<n; i++){
                        list.insert(sc.nextInt());
                    }
                    System.out.print("Original list: ");
                    list.print();
                    list.sort();
                    list.removeDup();
                    System.out.print("\nList after removing duplicates: ");
                    list.print();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter correct choice");
            }
        } while (choice!=2);
    }
}