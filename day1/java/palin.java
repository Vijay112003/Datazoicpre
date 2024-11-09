import java.util.Scanner;
class Palindrome{
    private final String n;
    Palindrome(String n){
        this.n = n;
    }
    public String reverse(){
        String rev = "";
        for(int i = n.length()-1; i >= 0; i--){
            rev += n.charAt(i);
        }
        return rev;
    }
    public void palincheck(){
        String rev = reverse();
        if(n.equals(rev)){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
    }
}
class palin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        Palindrome p = new Palindrome(str);
        p.palincheck();
    }
}