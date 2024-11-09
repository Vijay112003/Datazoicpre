import java.util.Scanner;
class PerfectSquareFactors {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Enter the lower bound of the range: ");
            int lowerBound = scanner.nextInt();
        
            System.out.print("Enter the upper bound of the range: ");
            int upperBound = scanner.nextInt();
        
            System.out.println("Numbers with at least one perfect square factor in the range:");
            for (int i = lowerBound; i <= upperBound; i++) {
                if (hasPerfectSquareFactor(i)) {
                    System.out.println(i);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Exiting program.");
        }
    }
    
    private static boolean hasPerfectSquareFactor(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % (i * i) == 0) {
                System.out.print(i*i+"->");
                return true;
            }
        }
        return false;
    }
}