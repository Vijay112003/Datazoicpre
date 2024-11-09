
import java.util.Scanner;
import java.util.Stack;

class Balanced{
    String exp;
    Balanced(String exp){
        this.exp = exp;
    }
    void chechbalance(){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            } else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }
                char top = stack.pop();
                if((top=='(' && ch!=')') || (top=='{' && ch!='}') || (top=='[' && ch!=']')){
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

}
class BalanceCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        String exp;
        do { 
            System.err.print("\nCoice 1: Check Balanced Parenthesis\nChoice 2: Exit\nEnter your choice: ");
            c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.print("Enter the expression: ");
                    exp = sc.next();
                    Balanced b = new Balanced(exp);
                    b.chechbalance();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (c!=2);
    }
}