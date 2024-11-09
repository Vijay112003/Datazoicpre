import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class circularLL{
    Node head;
    circularLL(){
        head = null;
    }
    public void add(int data){
        Node toAdd = new Node(data);
        if(head == null){
            head = toAdd;
            head.next = head;
        }else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = toAdd;
            toAdd.next = head;
        }
    }
    public void detectCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                System.out.println("Cycle Detected");
                return;
            }
        }
        System.out.println("No Cycle Detected");
    }
    public void display(){
        Node temp = head;
        while(temp.next != head){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}
class CycleDedection{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circularLL cll = new circularLL();
        int n;
        do {
            System.out.print("Choice\n1. List\n2. Exit\nEnter Choice: ");
            n=sc.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print("Enter the number of elements: ");
                    int num = sc.nextInt();
                    System.out.print("Enter the elements: ");
                    for (int i = 0; i < num; i++) {
                        cll.add(sc.nextInt());
                    }
                    cll.display();
                    System.out.println();
                    cll.detectCycle();
                }
                case 2 -> {
                    System.out.println("Exiting...");
                    break;
                }
                default -> System.out.println("Enter a valid choice");
            }
        } while (n!=2);
    }
}