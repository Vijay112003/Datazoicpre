import java.util.Scanner;
class Stack{
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j){
        if(isFull()==true){
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = j;
    }

    public long pop(){
        if(isEmpty()==true){
            return -1;
        }
        return stackArray[top--];
    }

    public long peek(){
        if(isEmpty()==true){
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
    public void display(){
        if(isEmpty()==true){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for(int i=top;i>=0;i--){
            System.out.println(stackArray[i]);
        }
    }
}
class StackApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        long n;
        System.out.print("Enter size of stack: ");
        Stack s = new Stack(sc.nextInt());
        do{
            System.out.print("\n---------------\nChoice 1: Push\nChoice 2: Pop\nChoice 3: Peek\nChoice 4: Display\nChoice 5: Exit\n--------------\nEnter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter number to push: ");
                    n = sc.nextLong();
                    s.push(n);
                    break;
                case 2:
                    n = s.pop();
                    if(n==-1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Popped:"+n);
                    }
                    break;
                case 3:
                    if(s.peek()==-1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Peeked:"+s.peek());
                    }
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.err.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=5);
    }
}