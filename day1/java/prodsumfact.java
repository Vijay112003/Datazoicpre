
import java.util.Scanner;

class Proddivsum {

    public static int prod(int n) {
        int prod = 1;
        while (n != 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }

    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start = sc.nextInt();
        System.out.println("Enter the end number: ");
        int end = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (prod(i) % sum(i) == 0) {
                System.out.print(i + "+");
                sum += i;
            }
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
