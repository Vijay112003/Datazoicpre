import java.util.Scanner;
class LArrays{
    public static int LinearSearch(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
class Linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Enter the number to search: ");
        int number = sc.nextInt();
        int index = LArrays.LinearSearch(array, number);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}